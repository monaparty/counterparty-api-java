package me.monaparty.api;

import java.net.URL;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CounterpartyAPIFactory {
    private static Logger logger = LoggerFactory.getLogger(CounterpartyAPIFactory.class);

    private CounterpartyAPIFactory() {
        /* singleton */
    }

    static public CounterpartyAPI create(String endpoint, String rpcuser, String rpcpass) {
        final var factory = new CounterpartyAPIFactory();
        final var client = factory.jsonRpcHttpClient(endpoint, rpcuser, rpcpass);
        return ProxyUtil.createClientProxy(factory.getClass().getClassLoader(), CounterpartyAPI.class, client);
    }

    static public CounterpartyAPI create(String endpoint) {
        return CounterpartyAPIFactory.create(endpoint, null, null);
    }

    public JsonRpcHttpClient jsonRpcHttpClient(String endpoint, String rpcuser, String rpcpass) {
        URL url = null;
        Map<String, String> header = new HashMap<>();
        try {
            url = new URL(endpoint);
        } catch (Exception e) {
            logger.error("fatal. Check if endpoint is valid.", e);
        }
        if (rpcuser != null && rpcpass != null) {
            header.put("Authorization", "Basic " + Base64.getEncoder().encode((rpcuser + ":" + rpcpass).getBytes()));
        }
        return new JsonRpcHttpClient(url, header);
    }

    public CounterpartyAPI counterpartyAPI(JsonRpcHttpClient jsonRpcHttpClient) {
        return ProxyUtil.createClientProxy(getClass().getClassLoader(), CounterpartyAPI.class, jsonRpcHttpClient);
    }
}
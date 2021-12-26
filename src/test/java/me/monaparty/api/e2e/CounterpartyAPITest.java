package me.monaparty.api.e2e;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import me.monaparty.api.CounterpartyAPIFactory;
import me.monaparty.api.Filter;

public class CounterpartyAPITest {

    @Test
    public void getAssets1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getAssets(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 1);
        var result = results.get(0);
        assertEquals("3939393939393939114", result.getAsset_id());
        assertEquals("A3939393939393939114", result.getAsset_name());
        assertEquals(Long.valueOf(1165311L), result.getBlock_index());
        assertEquals(null, result.getAsset_longname());
        assertEquals(null, result.getAsset_group());
    }

    @Test
    public void getBalances1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getBalances(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 1);
        var result = results.get(0);
        assertEquals("MUj6ByMDqeKXSxF1TUyLBKDZKkRLuVzo3B", result.getAddress());
        assertEquals("XMP", result.getAsset());
        assertEquals(Long.valueOf(3272053609452944L), result.getQuantity());
    }

    @Test
    public void getBets1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getBets(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 0);
        /*
        var result = results.get(0);
        assertEquals(Long.valueOf(0L), result.getTx_index());
        assertEquals("", result.getTx_hash());
        assertEquals(Long.valueOf(0L), result.getBlock_index());
        assertEquals("", result.getSource());
        assertEquals("", result.getFeed_address());
        assertEquals(Long.valueOf(0L), result.getBet_type());
        assertEquals(Long.valueOf(0L), result.getDeadline());
        assertEquals(Long.valueOf(0L), result.getWager_quantity());
        assertEquals(Long.valueOf(0L), result.getWager_remaining());
        assertEquals(Long.valueOf(0L), result.getCounterwager_quantity());
        assertEquals(Long.valueOf(0L), result.getCounterwager_remaining());
        assertEquals(Double.valueOf(0.0), result.getTarget_value());
        assertEquals(Long.valueOf(0L), result.getLeverage());
        assertEquals(Long.valueOf(0L), result.getExpiration());
        assertEquals(Long.valueOf(0L), result.getExpire_index());
        assertEquals(Long.valueOf(0L), result.getFee_fraction_int());
        assertEquals("", result.getStatus());
        */
    }

    @Test
    public void getBetExpirations1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getBetExpirations(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 0);
        /* TODO: should be implemented */
    }

    @Test
    public void getBetMatches1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getBetMatches(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 0);
        /* TODO: should be implemented */
    }

    @Test
    public void getBetMatchExpirations1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getBetMatchExpirations(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 0);
        /* TODO: should be implemented */
    }

    @Test
    public void getBetMatchReqolutions1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getBetMatchResolutions(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 0);
        /* TODO: should be implemented */
    }

    @Test
    public void getBroadcasts1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getBroadcasts(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);
        assertEquals(Long.valueOf(3L), result.getTx_index());
        assertEquals("6ae8a9bd6fb7a97a4ad1c5556bad152ff93c3c7650b0358e80a7d0460882bbc5", result.getTx_hash());
        assertEquals(Long.valueOf(1165214L), result.getBlock_index());
        assertEquals("MJL8CpXkQpzvGWyeLEnXk88cMDaMX1RtT2", result.getSource());
        assertEquals(Long.valueOf(1511006460L), result.getTimestamp());
        assertEquals(Double.valueOf(-1.0), result.getValue());
        assertEquals(Long.valueOf(0L), result.getFee_fraction_int());
        assertEquals("1BRxyPdLuoq7Nr1K7G8bVrXGszhC1Kmrgm", result.getText());
        assertEquals(Boolean.FALSE, result.getLocked());
        assertEquals("valid", result.getStatus());
    }

    @Test
    public void getBTCPays1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty.api.monaparty.me/");
        var results = client.getBTCPays(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);
        assertEquals(Long.valueOf(27275L), result.getTx_index());
        assertEquals("4b13610eab2edf49ed719ff6a69fa6b7bd9c6e1771ff774f3cb2dc9714cb5aa4", result.getTx_hash());
        assertEquals(Long.valueOf(1257229L), result.getBlock_index());
        assertEquals("MDqpveqsRuixTX5XH17DFZNo8MiJB9FPdP", result.getSource());        
        assertEquals("MUqM2tDnZXtJ4h87W2g8fFz9nW3GsYhMfu", result.getDestination());
        assertEquals(Long.valueOf(6666667L), result.getBtc_amount());
        assertEquals("c8c73ef380e03c71a7dcc17721c03e0ca34519a2d0cad8798fc0128717bf9bad_aa3afcd31d1ebd7559c5d47ed0d4e8410503d8ad62a6fe7d4b9a7a20c32f72dc", result.getOrder_match_id());
        assertEquals("valid", result.getStatus());
    }

    /*

    @JsonRpcMethod("get_btcpays")
    List<GetBTCPaysResult> getBTCPays(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_burns")
    List<GetBurnsResult> getBurns(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_cancels")
    List<GetCancelsResult> getCancels(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_credits")
    List<GetIssuancesResult> getCredits(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_debits")
    List<GetDebitsResult> getDebits(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_dispensers")
    List<GetDispensersResult> getDispensers(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_dispenses")
    List<GetDispensesResult> getDispenses(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_dividends")
    List<GetDividendsResult> getDividends(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_issuances")
    List<GetIssuancesResult> getIssuances(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_mempool")
    List<GetMempoolResult> getMempool(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_orders")
    List<GetOrdersResult> getOrders(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_order_expirations")
    List<GetOrderExpirationsResult> getOrderExpirations(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_order_matches")
    List<GetOrderMatchesResult> getOrderMatches(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_order_match_expirations")
    List<GetOrderMatchExpirationsResult> getOrderMatchExpirations(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_sends")
    List<GetSendsResult> getSends(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_triggers")
    List<GetTrrigersResult> getTriggers(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);
  */      
        
}
package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetMempoolResult {
    private String tx_hash;
    private String command;
    private String category;
    private String bindings;
    private Long timestamp;

    public String getTxHash() {
        return tx_hash;
    }
}

package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetTrrigersResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String target_hash;
    private String payload;
    private String status;

    public Long getTxIndex() {
        return tx_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public String getTargetHash() {
        return target_hash;
    }
}

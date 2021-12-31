package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetBroadcastsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private Long timestamp;
    private Double value;
    private Long fee_fraction_int;
    private String text;
    private Boolean locked;
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

    public Long getFeeFractionInt() {
        return fee_fraction_int;
    }
}

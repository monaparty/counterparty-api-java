package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class GetCancelsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String offer_hash;
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

    public String getOfferHash() {
        return offer_hash;
    }
}

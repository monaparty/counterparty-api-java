package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetDestructionsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String asset;
    private Long quantity;
    private String tag;
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
}

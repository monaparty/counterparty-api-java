package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetSendsResult {
    private Long tx_index;
    private Long msg_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String destination;
    private String asset;
    private Long quantity;
    private String status;
    private String memo;
    private String memo_hex;

    public Long getTxIndex() {
        return tx_index;
    }

    public Long getMsgIndex() {
        return msg_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public String getMemoHex() {
        return memo_hex;
    }
}

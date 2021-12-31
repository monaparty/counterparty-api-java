package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetSweepsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String destination;
    private Long flags;
    private String status;
    private String memo;
    private String memo_hex;
    private Long fee_paid;

    public Long getTxIndex() {
        return tx_index;
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

    public Long getFeePaid() {
        return fee_paid;
    }
}

package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetDispensersResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String asset;
    private Long give_quantity;
    private Long escrow_quantity;
    private Long satoshirate;
    private Long status;
    private Long give_remaining;

    public Long getTxIndex() {
        return tx_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public Long getGiveQuantity() {
        return give_quantity;
    }

    public Long getEscrowQuantity() {
        return escrow_quantity;
    }

    public Long getGiveRemaining() {
        return give_remaining;
    }
}

package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetBetsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String feed_address;
    private Long bet_type;
    private Long deadline;
    private Long wager_quantity;
    private Long wager_remaining;
    private Long counterwager_quantity;
    private Long counterwager_remaining;
    public Double target_value;
    private Long leverage;
    private Long expiration;
    private Long expire_index;
    private Long fee_fraction_int;
    private String status;

    public Long getTxIndex() {
        return tx_index;
    }

    public Long getFeeFractionInt() {
        return fee_fraction_int;
    }

    public Long getExpireIndex() {
        return expire_index;
    }

    public Long getCounterwagerRemaining() {
        return counterwager_remaining;
    }

    public Long getCounterwagerQuantity() {
        return counterwager_quantity;
    }

    public Long getWagerRemaining() {
        return wager_remaining;
    }

    public Long getWagerQuantity() {
        return wager_quantity;
    }

    public Long getBetType() {
        return bet_type;
    }

    public String getFeedAddress() {
        return feed_address;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public String getTxHash() {
        return tx_hash;
    }
}

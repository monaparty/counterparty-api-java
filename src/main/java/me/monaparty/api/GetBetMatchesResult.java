package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetBetMatchesResult {
    private String id;
    private Long tx0_index;
    private String tx0_hash;
    private String tx0_address;
    private Long tx1_index;
    private String tx1_hash;
    private String tx1_address;
    private Long tx0_bet_type;
    private Long tx1_bet_type;
    private String feed_address;
    private Long initial_value;
    private Long deadline;
    private Double target_value;
    private Long leverage;
    private Long forward_quantity;
    private Long backward_quantity;
    private Long tx0_block_index;
    private Long tx1_block_index;
    private Long block_index;
    private Long tx0_expiration;
    private Long tx1_expiration;
    private Long match_expire_index;
    private Long fee_fraction_int;
    private String status;

    public Long getTx0Index() {
        return tx0_index;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public Long getTx0Expiration() {
        return tx0_expiration;
    }

    public Long getTx1Expiration() {
        return tx1_expiration;
    }

    public Long getMatchExpireIndex() {
        return match_expire_index;
    }

    public Long getFeeFractionInt() {
        return fee_fraction_int;
    }

    public Long getTx1BlockIndex() {
        return tx1_block_index;
    }

    public Long getTx0BlockIndex() {
        return tx0_block_index;
    }

    public Long getBackwardQuantity() {
        return backward_quantity;
    }

    public Long getForwardQuantity() {
        return forward_quantity;
    }

    public Double getTargetValue() {
        return target_value;
    }

    public Long getInitialValue() {
        return initial_value;
    }

    public String getFeedAddress() {
        return feed_address;
    }

    public Long getTx1BetType() {
        return tx1_bet_type;
    }

    public Long getTx0BetType() {
        return tx0_bet_type;
    }

    public String getTx1Address() {
        return tx1_address;
    }

    public String getTx1Hash() {
        return tx1_hash;
    }

    public Long getTx1Index() {
        return tx1_index;
    }

    public String getTx0Address() {
        return tx0_address;
    }

    public String getTx0Hash() {
        return tx0_hash;
    }
}

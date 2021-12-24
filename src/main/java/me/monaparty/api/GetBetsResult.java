package me.monaparty.api;

import lombok.Data;

@Data
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
}

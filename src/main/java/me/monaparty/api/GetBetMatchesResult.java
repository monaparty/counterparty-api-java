package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
}

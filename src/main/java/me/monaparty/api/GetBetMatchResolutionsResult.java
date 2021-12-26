package me.monaparty.api;

import lombok.Data;

@Data
public class GetBetMatchResolutionsResult {
    private String bet_match_id;
    private Long bet_match_type_id;
    private Long block_index;
    private String winner;
    Boolean settled;
    private Long bull_credit;
    private Long bear_credit;
    private Long escrow_less_fee;
    private Long fee;
}

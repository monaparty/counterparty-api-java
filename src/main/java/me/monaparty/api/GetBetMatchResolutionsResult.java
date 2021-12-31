package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetBetMatchResolutionsResult {
    private String bet_match_id;
    private Long bet_match_type_id;
    private Long block_index;
    private String winner;
    private Boolean settled;
    private Long bull_credit;
    private Long bear_credit;
    private Long escrow_less_fee;
    private Long fee;

    public String getBetMatchId() {
        return bet_match_id;
    }

    public Long getEscrowLessFee() {
        return escrow_less_fee;
    }

    public Long getBearCredit() {
        return bear_credit;
    }

    public Long getBullCredit() {
        return bull_credit;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public Long getBetMatchTypeId() {
        return bet_match_type_id;
    }
}

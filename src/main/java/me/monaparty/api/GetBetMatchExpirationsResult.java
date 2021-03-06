package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetBetMatchExpirationsResult {
    private String bet_match_id;
    private String tx0_address;
    private String tx1_address;
    private Long block_index;

    public String getBetMatchId() {
        return bet_match_id;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public String getTx1Address() {
        return tx1_address;
    }

    public String getTx0Address() {
        return tx0_address;
    }
}
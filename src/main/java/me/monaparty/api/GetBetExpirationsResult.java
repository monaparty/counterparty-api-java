package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetBetExpirationsResult {
    private Long bet_index;
    private String bet_hash;
    private String source;
    private Long block_index;

    public Long getBetIndex() {
        return bet_index;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public String getBetHash() {
        return bet_hash;
    }

}

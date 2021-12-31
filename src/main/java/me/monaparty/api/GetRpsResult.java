package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetRpsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private Long possible_moves;
    private Long wager;
    private String move_random_hash;
    private Long expiration;
    private Long expire_index;
    private String status;

    public Long getExpireIndex() {
        return expire_index;
    }

    public Long getTxIndex() {
        return tx_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public Long getPossibleMoves() {
        return possible_moves;
    }

    public String getMoveRandomHash() {
        return move_random_hash;
    }
}

package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetRpsResolvesResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private Long move;
    private String random;
    private String rps_match_id;
    private String status;

    public Long getTxIndex() {
        return tx_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public String getRpsMatchId() {
        return rps_match_id;
    }
}

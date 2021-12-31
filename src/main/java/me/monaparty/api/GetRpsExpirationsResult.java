package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetRpsExpirationsResult {
    private Long rps_index;
    private String rps_hash;
    private String source;
    private Long block_index;

    public Long getRpsIndex() {
        return rps_index;
    }

    public String getRpsHash() {
        return rps_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }
}

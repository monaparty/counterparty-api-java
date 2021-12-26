package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetBetExpirationsResult {
    private Long bet_index;
    private String bet_hash;
    private String source;
    private Long block_index;
}

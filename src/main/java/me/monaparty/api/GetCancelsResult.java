package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetCancelsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String offer_hash;
    private String status;

}
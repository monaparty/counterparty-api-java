package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetBroadcastsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private Long timestamp;
    public Double value;
    private Long fee_fraction_int;
    private String text;
    public Boolean locked;
    private String status;
}

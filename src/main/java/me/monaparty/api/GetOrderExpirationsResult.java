package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetOrderExpirationsResult {
    private Long order_index;
    private String order_hash;
    private String source;
    private Long block_index;
}

package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetOrderExpirationsResult {
    private Long order_index;
    private String order_hash;
    private String source;
    private Long block_index;

    public Long getOrderIndex() {
        return order_index;
    }

    public String getOrderHash() {
        return order_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }
}

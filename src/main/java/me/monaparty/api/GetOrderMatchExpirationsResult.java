package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetOrderMatchExpirationsResult {
    private String order_match_id;
    private String tx0_address;
    private String tx1_address;
    private Long block_index;

    public String getOrderMatchId() {
        return order_match_id;
    }

    public String getTx0Address() {
        return tx0_address;
    }

    public String getTx1Address() {
        return tx1_address;
    }

    public Long getBlockIndex() {
        return block_index;
    }
}

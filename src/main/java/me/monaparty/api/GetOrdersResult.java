package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetOrdersResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String give_asset;
    private Long give_quantity;
    private Long give_remaining;
    private String get_asset;
    private Long get_quantity;
    private Long get_remaining;
    private Long expiration;
    private Long expire_index;
    private Long fee_required;
    private Long fee_required_remaining;
    private Long fee_provided;
    private Long fee_provided_remaining;
    private String status;
}

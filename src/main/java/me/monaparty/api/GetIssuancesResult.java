package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetIssuancesResult {
    private Long tx_index;
    private Long msg_index;
    private Long fee_paid;
    private Long call_price;
    private Long fungible;
    private Long vendable;
    private String description;
    private Long reassignable;
    private String source;
    private Long divisible;
    private String issuer;
    private Long quantity;
    private String asset;
    private String tx_hash;
    private Long block_index;
    private Long call_date;
    private String status;
    private Long callable;
    private Long transfer;
    private Long listed;
    private Long locked;
    private String asset_longname;
}
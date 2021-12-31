package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
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

    public Long getTxIndex() {
        return tx_index;
    }

    public Long getMsgIndex() {
        return msg_index;
    }

    public Long getFeePaid() {
        return fee_paid;
    }

    public Long getCallPrice() {
        return call_price;
    }

    public String getTxHash() {
        return tx_hash;
    }


    public Long getBlockIndex() {
        return block_index;
    }

    public Long getCallDate() {
        return call_date;
    }

    public String getAssetLongname() {
        return asset_longname;
    }
}
package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class GetDividendsResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String asset;
    private String dividend_asset;
    private Long quantity_per_unit;
    private Long fee_paid;
    private String status;

    public Long getTxIndex() {
        return tx_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public String getDividendAsset() {
        return dividend_asset;
    }

    public Long getQuantityPerUnit() {
        return quantity_per_unit;
    }

    public Long getFeePaid() {
        return fee_paid;
    }
}

package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
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
}

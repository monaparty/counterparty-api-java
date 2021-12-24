package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetDispensersResult {
     private Long tx_index;
     private String tx_hash;
     private Long block_index;
     private String source;
     private String asset;
     private Long give_quantity;
     private Long escrow_quantity;
     private Long satoshirate;
     private Long status;
     private Long give_remaining;
}

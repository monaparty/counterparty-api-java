package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetDispensesResult {
     private Long tx_index;
     private String tx_hash;
     private Long block_index;
     private String source;
     private String destination;
     private String asset;
     private Long must_give;
     private Long remaining;
     private Long actually_given;
     private Long satoshirate;
     private String dispenser_tx_hash;

}

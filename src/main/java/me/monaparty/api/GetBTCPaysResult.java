package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetBTCPaysResult {
     private Long tx_index;
     private String tx_hash;
     private Long block_index;
     private String source;
     private String destination;
     private Long btc_amount;
     private String order_match_id;
     private String status;
}

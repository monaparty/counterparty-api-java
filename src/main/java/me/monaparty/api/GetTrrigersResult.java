package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetTrrigersResult {
     private Long tx_index;
     private String tx_hash;
     private Long block_index;
     private String source;
     private String target_hash;
     private String payload;
     private String status;
}

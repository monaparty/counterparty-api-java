package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetSendsResult {
     private Long tx_index;
     private String tx_hash;
     private Long block_index;
     private String source;
     private String destination;
     private String asset;
     private Long quantity;
     private String status;
}

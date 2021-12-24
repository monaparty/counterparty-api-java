package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetBurnsResult {
     private Long tx_index;
     private String tx_hash;
     private Long block_index;
     private String source;
     private Long burned;
     private Long earned;
     private String status;

}

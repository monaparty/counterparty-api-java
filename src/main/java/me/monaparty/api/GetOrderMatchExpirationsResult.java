package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetOrderMatchExpirationsResult {
     private String order_match_id;
     private String tx0_address;
     private String tx1_address;
     private Long block_index;

}

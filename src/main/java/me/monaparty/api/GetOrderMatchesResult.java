package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetOrderMatchesResult {
     private String id;
     private Long tx0_index;
     private String tx0_hash;
     private Long tx0_address;
     private Long tx1_index;
     private String tx1_hash;
     private String tx1_address;
     private String forward_asset;
     private Long forward_quantity;
     private String backward_asset;
     private Long backward_quantity;
     private Long tx0_block_index;
     private Long tx1_block_index;
     private Long block_index;
     private Long tx0_expiration;
     private Long tx1_expiration;
     private Long match_expire_index;
     private Long fee_paid;
     private Long status;
}

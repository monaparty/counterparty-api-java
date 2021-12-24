package me.monaparty.api;

import lombok.Data;

@Data
public class GetBetMatchExpirationsResult {
     private String bet_match_id;
     private String tx0_address;
     private String tx1_address;
     private Long block_index;
}
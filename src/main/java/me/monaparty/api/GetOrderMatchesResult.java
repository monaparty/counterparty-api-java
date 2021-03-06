package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetOrderMatchesResult {
    private String id;
    private Long tx0_index;
    private String tx0_hash;
    private String tx0_address;
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
    private String status;

    public Long getTx0Index() {
        return tx0_index;
    }

    public String getTx0Hash() {
        return tx0_hash;
    }

    public String getTx0Address() {
        return tx0_address;
    }

    public Long getTx1Index() {
        return tx1_index;
    }

    public String getTx1Hash() {
        return tx1_hash;
    }

    public String getTx1Address() {
        return tx1_address;
    }

    public String getForwardAsset() {
        return forward_asset;
    }

    public Long getForwardQuantity() {
        return forward_quantity;
    }

    public String getBackwardAsset() {
        return backward_asset;
    }

    public Long getBackwardQuantity() {
        return backward_quantity;
    }

    public Long getTx0BlockIndex() {
        return tx0_block_index;
    }

    public Long getTx1BlockIndex() {
        return tx1_block_index;

    }

    public Long getBlockIndex() {
        return block_index;
    }

    public Long getTx0Expiration() {
        return tx0_expiration;
    }

    public Long getTx1Expiration() {
        return tx1_expiration;
    }
    
    public Long getMatchExpireIndex() {
        return match_expire_index;
    }
    
    public Long getFeePaid() {
        return fee_paid;
    }

}

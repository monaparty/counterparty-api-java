package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetBTCPaysResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String destination;
    private Long btc_amount;
    private String order_match_id;
    private String status;

    public Long getTxIndex() {
        return tx_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public Long getBtcAmount() {
        return btc_amount;
    }

    public String getOrderMatchId() {
        return order_match_id;
    }
}

package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@ToString
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

    public Long getTxIndex() {
        return tx_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public Long getMustGive() {
        return must_give;
    }

    public Long getActuallyGiven() {
        return actually_given;
    }

    public String getDispenserTxHash() {
        return dispenser_tx_hash;
    }
}

package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetAssetgroupsResult {
    private Long tx_index;
    private String tx_hash;
    private Long msg_index;
    private Long block_index;
    private String asset_group;
    private String owner;
    private String status;

    public Long getTxIndex() {
        return tx_index;
    }

    public String getTxHash() {
        return tx_hash;
    }

    public Long getMsgIndex() {
        return msg_index;
    }

    public Long getBlockIndex() {
        return block_index;
    }

    public String getAssetGroup() {
        return asset_group;
    }

}

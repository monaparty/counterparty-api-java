package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetAssetsResult {
    private String asset_id;
    private String asset_name;
    private Long block_index;
    private String asset_longname;
    private String asset_group;

    public String getAssetId() {
        return asset_id;
    }

    public String getAssetGroup() {
        return asset_group;
    }

    public String getAssetLongname() {
		return asset_longname;
	}

	public Long getBlockIndex() {
        return block_index;
    }

    public String getAssetName() {
        return asset_name;
    }
}

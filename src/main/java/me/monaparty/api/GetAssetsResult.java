package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetAssetsResult {
    private String asset_id;
    private String asset_name;
    private Long block_index;
    private String asset_longname;
    private String asset_group;
}

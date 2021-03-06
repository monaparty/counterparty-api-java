package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetDebitsResult {
    private Long block_index;
    private String address;
    private String asset;
    private Long quantity;
    private String action;
    private String event;

    public Long getBlockIndex() {
        return block_index;
    }
}

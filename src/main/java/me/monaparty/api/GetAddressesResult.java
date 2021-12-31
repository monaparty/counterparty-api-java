package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetAddressesResult {

    private String address;
    private Long options;

    private Long block_index;

    public Long getBlockIndex() {
        return block_index;
    }
}

package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetCreditsResult {
    private Long block_index;
    private String address;
    private String asset;
    private Long quantity;
    private String calling_function;
    private String event;

    public String getCalling_function() {
        return calling_function;
    }

    public Long getBlockIndex() {
        return block_index;
    }
}

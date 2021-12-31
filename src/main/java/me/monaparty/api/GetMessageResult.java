package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetMessageResult {
    private Long message_index;
    private Long block_index;
    private String command;
    private String category;
    private String bindings;
    private Long timestamp;

    public Long getMessageIndex() {
        return message_index;
    }

    public Long getBlockIndex() {
        return block_index;
    }
}

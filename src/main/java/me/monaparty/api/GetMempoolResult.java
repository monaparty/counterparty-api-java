package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetMempoolResult {
    private String tx_hash;
    private String command;
    private String category;
    private String bindings;
    private Long timestamp;
}

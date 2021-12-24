package me.monaparty.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetBalancesResult {
    private String address;
    private String asset;
    private Long quantity;
}

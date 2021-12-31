package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetBalancesResult {
    private String address;
    private String asset;
    private Long quantity;
}

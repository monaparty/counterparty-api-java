package me.monaparty.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetOrdersResult {
    private Long tx_index;
    private String tx_hash;
    private Long block_index;
    private String source;
    private String give_asset;
    private Long give_quantity;
    private Long give_remaining;
    private String get_asset;
    private Long get_quantity;
    private Long get_remaining;
    private Long expiration;
    private Long expire_index;
    private Long fee_required;
    private Long fee_required_remaining;
    private Long fee_provided;
    private Long fee_provided_remaining;
    private String status;

	public Long getTxIndex() {
		return tx_index;
	}

    public String getTxHash() {
		return tx_hash;
	}

    public Long getBlockIndex() {
		return block_index;
	}

    public String getGiveAsset() {
		return give_asset;
	}

    public Long getGiveQuantity() {
		return give_quantity;
	}

    public Long getGiveRemaining() {
		return give_remaining;
	}

    public String getGetAsset() {
		return get_asset;
	}

    public Long getGetQuantity() {
		return get_quantity;
	}

    public Long getGetRemaining() {
		return get_remaining;
	}

    public Long getExpireIndex() {
		return expire_index;
	}

    public Long getFeeRequired() {
		return fee_required;
	}

    public Long getFeeRequiredRemaining() {
		return fee_required_remaining;
	}

    public Long getFeeProvided() {
		return fee_provided;
	}

    public Long getFeeProvidedRemaining() {
		return fee_provided_remaining;
	}
}

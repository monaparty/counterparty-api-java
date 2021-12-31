package me.monaparty.api;

import java.util.List;

import com.googlecode.jsonrpc4j.JsonRpcMethod;
import com.googlecode.jsonrpc4j.JsonRpcParam;

public interface CounterpartyAPI {

    // @JsonRpcMethod("get_addresses")
    // List<GetAddressesResult> getAddresses(@JsonRpcParam(value = "filters") Filter[] filterList,
    //         @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
    //         @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
    //         @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
    //         @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_assetgroups")
    List<GetAssetgroupsResult> getAssetGroups(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    // @JsonRpcMethod("get_asset_metadatas")
    // List<GetAssetMetadatasResult> getAssetMetadatas(@JsonRpcParam(value = "filters") Filter[] filterList,
    //         @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
    //         @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
    //         @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
    //         @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_assets")
    List<GetAssetsResult> getAssets(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_balances")
    List<GetBalancesResult> getBalances(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_bets")
    List<GetBetsResult> getBets(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_bet_expirations")
    List<GetBetExpirationsResult> getBetExpirations(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_bet_matches")
    List<GetBetMatchesResult> getBetMatches(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_bet_match_expirations")
    List<GetBetMatchExpirationsResult> getBetMatchExpirations(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_bet_match_resolutions")
    List<GetBetMatchResolutionsResult> getBetMatchResolutions(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_broadcasts")
    List<GetBroadcastsResult> getBroadcasts(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_btcpays")
    List<GetBTCPaysResult> getBTCPays(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_burns")
    List<GetBurnsResult> getBurns(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_cancels")
    List<GetCancelsResult> getCancels(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_credits")
    List<GetCreditsResult> getCredits(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_debits")
    List<GetDebitsResult> getDebits(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_destructions")
    List<GetDestructionsResult> getDestructions(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_dispensers")
    List<GetDispensersResult> getDispensers(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_dispenses")
    List<GetDispensesResult> getDispenses(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_dividends")
    List<GetDividendsResult> getDividends(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_issuances")
    List<GetIssuancesResult> getIssuances(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_mempool")
    List<GetMempoolResult> getMempool(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_messages")
    List<GetMessageResult> getMessages(@JsonRpcParam(value = "block_index") Long block_index);

    @JsonRpcMethod("get_orders")
    List<GetOrdersResult> getOrders(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_order_expirations")
    List<GetOrderExpirationsResult> getOrderExpirations(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_order_matches")
    List<GetOrderMatchesResult> getOrderMatches(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_order_match_expirations")
    List<GetOrderMatchExpirationsResult> getOrderMatchExpirations(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_rps")
    List<GetRpsResult> getRps(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_rps_expirations")
    List<GetRpsExpirationsResult> getRpsExpirations(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_rps_matches")
    List<GetRpsMatchesResult> getRpsMatches(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_rps_match_expirations")
    List<GetRpsMatchExpirationsResult> getRpsMatchExpirations(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_rpsresolves")
    List<GetRpsResolvesResult> getRpsResolves(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_sends")
    List<GetSendsResult> getSends(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_sweeps")
    List<GetSweepsResult> getSweeps(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);

    @JsonRpcMethod("get_triggers")
    List<GetTrrigersResult> getTriggers(@JsonRpcParam(value = "filters") Filter[] filterList,
            @JsonRpcParam(value = "filterop") String filterop, @JsonRpcParam(value = "order_by") String orderBy,
            @JsonRpcParam(value = "order_dir") String orderDir, @JsonRpcParam(value = "start_block") Long startBlock,
            @JsonRpcParam(value = "end_block") Long endBlock, @JsonRpcParam(value = "status") String status,
            @JsonRpcParam(value = "limit") Long limit, @JsonRpcParam(value = "offset") Long offset);
}
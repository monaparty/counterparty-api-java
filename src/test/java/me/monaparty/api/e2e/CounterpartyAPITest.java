package me.monaparty.api.e2e;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import me.monaparty.api.CounterpartyAPIFactory;
import me.monaparty.api.Filter;

public class CounterpartyAPITest {

//    @Test
    // public void getAddresses1() throws Exception {
    //     var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
    //     var results = client.getAddresses(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
    //     assertEquals(results.size(), 1);
    //     var result = results.get(0);
    //     assertEquals("3939393939393939114", result.getAddress());
    //     assertEquals(Long.valueOf(0L), result.getOptions());
    //     assertEquals(Long.valueOf(0L), result.getBlockIndex());
    // }

    @Test
    public void getAssetGroups1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getAssetGroups(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 1);
        var result = results.get(0);
        assertEquals(Long.valueOf(1424), result.getTxIndex());
        assertEquals("64ca29d7a98cfd9c5f99189b579d82bfe8f01287f4d6c3e7ce96296d30e7e835", result.getTxHash());
        assertEquals(Long.valueOf(0L), result.getMsgIndex());
        assertEquals(Long.valueOf(1159866L), result.getBlockIndex());
        assertEquals("NFTEST", result.getAssetGroup());
        assertEquals("mv4FLU4g26hGu3UcuSg8iHaitcY5ECoquT", result.getOwner());
        assertEquals("valid", result.getStatus());
    }

    //@Test
    // TODO: API not implemented yet.
    // public void getAssetMetadatas1() throws Exception {
    //     var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
    //     var results = client.getAssetMetadatas(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
    //     assertEquals(results.size(), 1);
    // }

    @Test
    public void getAssets1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getAssets(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 1);
        var result = results.get(0);
        assertEquals("85011849", result.getAssetId());
        assertEquals("HEAVEN", result.getAssetName());
        assertEquals(Long.valueOf(82647L), result.getBlockIndex());
        assertEquals(null, result.getAssetLongname());
        assertEquals(null, result.getAssetGroup());
    }

    @Test
    public void getBalances1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBalances(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(results.size(), 1);
        var result = results.get(0);
        assertEquals("myMrdd89RXwdS8Quo1ZoFvXShnpMqk4Zi2", result.getAddress());
        assertEquals("XMP", result.getAsset());
        assertEquals(Long.valueOf(149999997265L), result.getQuantity());
    }

    @Test
    public void getBets1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBets(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());

        var result = results.get(0);
        assertEquals(Long.valueOf(455L), result.getTxIndex());
        assertEquals("c62a06db7f8d176da34fe7777c357eed9be6cf6a98433d8d7ba2d830242f16df", result.getTxHash());
        assertEquals(Long.valueOf(965504L), result.getBlockIndex());
        assertEquals("n2T96WQMsY9jx8dPzczaEub9BGkpGXXs4C", result.getSource());
        assertEquals("n2T96WQMsY9jx8dPzczaEub9BGkpGXXs4C", result.getFeedAddress());
        assertEquals(Long.valueOf(2L), result.getBet_type());
        assertEquals(Long.valueOf(1625115967L), result.getDeadline());
        assertEquals(Long.valueOf(100000000L), result.getWagerQuantity());
        assertEquals(Long.valueOf(100000000L), result.getWagerRemaining());
        assertEquals(Long.valueOf(100000000L), result.getCounterwagerQuantity());
        assertEquals(Long.valueOf(100000000L), result.getCounterwagerRemaining());
        assertEquals(Double.valueOf(2.0), result.getTarget_value());
        assertEquals(Long.valueOf(5040L), result.getLeverage());
        assertEquals(Long.valueOf(1000L), result.getExpiration());
        assertEquals(Long.valueOf(966504L), result.getExpireIndex());
        assertEquals(Long.valueOf(1000000L), result.getFee_fraction_int());
        assertEquals("cancelled", result.getStatus());
    }

    @Test
    public void getBetExpirations1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBetExpirations(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);
        /* TODO: should be implemented */

        assertEquals(Long.valueOf(0L), result.getBetIndex());
        assertEquals("", result.getBetHash());
        assertEquals("", result.getSource());
        assertEquals(Long.valueOf(0L), result.getBlockIndex());
    }

    @Test
    public void getBetMatches1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBetMatches(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);
        /* TODO: should be implemented */
        assertEquals("", result.getId());
        assertEquals(Long.valueOf(0L), result.getTx0Index());
        assertEquals("", result.getTx0Hash());
        assertEquals("", result.getTx0Address());
        assertEquals(Long.valueOf(0L), result.getTx1Index());
        assertEquals("", result.getTx1Hash());
        assertEquals("", result.getTx1Address());
        assertEquals(Long.valueOf(0L), result.getTx0BetType());
        assertEquals(Long.valueOf(0L), result.getTx1BetType());
        assertEquals("", result.getFeedAddress());
        assertEquals(Long.valueOf(0L), result.getInitialValue());
        assertEquals(Long.valueOf(0L), result.getDeadline());
        assertEquals(Double.valueOf(0.0), result.getTargetValue());
        assertEquals(Long.valueOf(0L), result.getLeverage());
        assertEquals(Long.valueOf(0L), result.getForwardQuantity());
        assertEquals(Long.valueOf(0L), result.getBackwardQuantity());
        assertEquals(Long.valueOf(0L), result.getTx0BlockIndex());
        assertEquals(Long.valueOf(0L), result.getTx1BlockIndex());
        assertEquals(Long.valueOf(0L), result.getBlockIndex());
        assertEquals(Long.valueOf(0L), result.getTx0Expiration());
        assertEquals(Long.valueOf(0L), result.getTx1Expiration());
        assertEquals(Long.valueOf(0L), result.getMatchExpireIndex());
        assertEquals(Long.valueOf(0L), result.getFeeFractionInt());
        assertEquals("", result.getStatus());
    
    }

    @Test
    public void getBetMatchExpirations1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBetMatchExpirations(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);
        /* TODO: should be implemented */
        assertEquals("", result.getBetMatchId());
        assertEquals("", result.getTx0Address());
        assertEquals("", result.getTx1Address());
        assertEquals(Long.valueOf(0L), result.getBlockIndex());
    }

    @Test
    public void getBetMatchReqolutions1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBetMatchResolutions(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);
        /* TODO: should be implemented */
        assertEquals("", result.getBetMatchId());
        assertEquals(Long.valueOf(0L), result.getBetMatchTypeId());
        assertEquals(Long.valueOf(0L), result.getBlockIndex());
        assertEquals("", result.getWinner());
        assertEquals(Boolean.TRUE, result.getSettled());
        assertEquals(Long.valueOf(0L), result.getBullCredit());
        assertEquals(Long.valueOf(0L), result.getBearCredit());
        assertEquals(Long.valueOf(0L), result.getEscrowLessFee());
        assertEquals(Long.valueOf(0L), result.getFee());
    }

    @Test
    public void getBroadcasts1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBroadcasts(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);
        assertEquals(Long.valueOf(13L), result.getTxIndex());
        assertEquals("b2f90e05a95ce7a05a9e5814ffd96a62b5a87c6d94a7d4b0db3e0fa27ca180fc", result.getTxHash());
        assertEquals(Long.valueOf(82666L), result.getBlockIndex());
        assertEquals("n34j2VSkwR6ofwu8VvFBBqzaRtQiVbCAvK", result.getSource());
        assertEquals(Long.valueOf(1510064340L), result.getTimestamp());
        assertEquals(Double.valueOf(-1.0), result.getValue());
        assertEquals(Long.valueOf(0L), result.getFeeFractionInt());
        assertEquals("", result.getText());
        assertEquals(Boolean.FALSE, result.getLocked());
        assertEquals("valid", result.getStatus());
    }

    @Test
    public void getBTCPays1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBTCPays(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);
        assertEquals(Long.valueOf(27275L), result.getTxIndex());
        assertEquals("4b13610eab2edf49ed719ff6a69fa6b7bd9c6e1771ff774f3cb2dc9714cb5aa4", result.getTxHash());
        assertEquals(Long.valueOf(1257229L), result.getBlockIndex());
        assertEquals("MDqpveqsRuixTX5XH17DFZNo8MiJB9FPdP", result.getSource());        
        assertEquals("MUqM2tDnZXtJ4h87W2g8fFz9nW3GsYhMfu", result.getDestination());
        assertEquals(Long.valueOf(6666667L), result.getBtcAmount());
        assertEquals("c8c73ef380e03c71a7dcc17721c03e0ca34519a2d0cad8798fc0128717bf9bad_aa3afcd31d1ebd7559c5d47ed0d4e8410503d8ad62a6fe7d4b9a7a20c32f72dc", result.getOrderMatchId());
        assertEquals("valid", result.getStatus());
    }

    @Test
    public void getBurns1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getBurns(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(0L), result.getTxIndex());
        assertEquals("689ee5095a4c77e3bac7640f56eb7c9ecac17fbef6aa8d01c8781d66dfb87d20", result.getTxHash());
        assertEquals(Long.valueOf(79405L), result.getBlockIndex());
        assertEquals("myMrdd89RXwdS8Quo1ZoFvXShnpMqk4Zi2", result.getSource());
        assertEquals(Long.valueOf(100000000L), result.getBurned());
        assertEquals(Long.valueOf(149999997265L), result.getEarned());
        assertEquals("valid", result.getStatus());
    }
    
    @Test
    public void getCancels1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getCancels(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(456L), result.getTxIndex());
        assertEquals("4357596ba4366e7337644374a32a1fea6c0994443c14dc84067bf7cf2bf0ac38", result.getTxHash());
        assertEquals(Long.valueOf(965562L), result.getBlockIndex());
        assertEquals("n2T96WQMsY9jx8dPzczaEub9BGkpGXXs4C", result.getSource());
        assertEquals("c62a06db7f8d176da34fe7777c357eed9be6cf6a98433d8d7ba2d830242f16df", result.getOfferHash());
        assertEquals("valid", result.getStatus());
    }

    @Test
    public void getCredits1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getCredits(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(79405L), result.getBlockIndex());
        assertEquals("myMrdd89RXwdS8Quo1ZoFvXShnpMqk4Zi2", result.getAddress());
        assertEquals("XMP", result.getAsset());
        assertEquals(Long.valueOf(149999997265L), result.getQuantity());
        assertEquals("burn", result.getCalling_function());
        assertEquals("689ee5095a4c77e3bac7640f56eb7c9ecac17fbef6aa8d01c8781d66dfb87d20", result.getEvent());
    }

    @Test
    public void getDebits1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getDebits(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(82647L), result.getBlockIndex());
        assertEquals("moeftJCWj4fvkBQ8ixSFsxoAiBAks3XprS", result.getAddress());
        assertEquals("XMP", result.getAsset());
        assertEquals(Long.valueOf(50000000L), result.getQuantity());
        assertEquals("issuance fee", result.getAction());
        assertEquals("5f100357e841146ad7ee51cbc4db298c3d7f5f365ba8a0fed93ec9bf45d527fe", result.getEvent());
    }

    @Test
    public void getDestructions1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getDestructions(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(0L), result.getTxIndex());
        assertEquals("", result.getTxHash());
        assertEquals(Long.valueOf(0L), result.getBlockIndex());
        assertEquals("", result.getSource());
        assertEquals("", result.getAsset());
        assertEquals(Long.valueOf(0L), result.getQuantity());
        assertEquals("", result.getTag());
        assertEquals("", result.getStatus());
    }

    @Test
    public void getDispensers1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getDispensers(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(432L), result.getTxIndex());
        assertEquals("8551c434f8779dcc646e2a553e9d0ec3916e5f627148efc30748422701fa4b17", result.getTxHash());
        assertEquals(Long.valueOf(963666L), result.getBlockIndex());
        assertEquals("mrniZMzZypVNLsmuGypo49eGDWPrv33aZE", result.getSource());
        assertEquals("XMP", result.getAsset());
        assertEquals(Long.valueOf(10000000L), result.getGiveQuantity());
        assertEquals(Long.valueOf(100000000L), result.getEscrowQuantity());
        assertEquals(Long.valueOf(1000000L), result.getSatoshirate());
        assertEquals(Long.valueOf(10L), result.getStatus());
        assertEquals(Long.valueOf(0L), result.getGiveRemaining());
    }

    @Test
    public void getDispenses1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getDispenses(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(434L), result.getTxIndex());
        assertEquals("ff83c55e718e61b172ae993fb7d3578d807c9dbba88a1d0c4c7cd38f1f4a0409", result.getTxHash());
        assertEquals(Long.valueOf(963749L), result.getBlockIndex());
        assertEquals("mryHDV5S3Gk5LgZYect3sBc31bikmg88as", result.getSource());
        assertEquals("mrniZMzZypVNLsmuGypo49eGDWPrv33aZE", result.getDestination());
        assertEquals("XMP", result.getAsset());
        assertEquals(Long.valueOf(2L), result.getMustGive());
        assertEquals(Long.valueOf(10L), result.getRemaining());
        assertEquals(Long.valueOf(20000000L), result.getActuallyGiven());
        assertEquals(Long.valueOf(1000000L), result.getSatoshirate());
        assertEquals("8551c434f8779dcc646e2a553e9d0ec3916e5f627148efc30748422701fa4b17", result.getDispenserTxHash());
    }

    @Test
    public void getDividends1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getDividends(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(157L), result.getTxIndex());
        assertEquals("b4f21e2bb0b7a60f68da4dd153c05d1ba961a81436786865a59874528d9dcac9", result.getTxHash());
        assertEquals(Long.valueOf(92641L), result.getBlockIndex());
        assertEquals("mm3HrtMvhgmRcbMPsPihfCcfuGxXbj3mEp", result.getSource());
        assertEquals("ZAIKO", result.getAsset());
        assertEquals("NURUPO", result.getDividendAsset());
        assertEquals(Long.valueOf(1000000L), result.getQuantityPerUnit());
        assertEquals(Long.valueOf(120000L), result.getFeePaid());
        assertEquals("valid", result.getStatus());
    }

    @Test
    public void getIssuances1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getIssuances(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(10L), result.getTxIndex());
        assertEquals(Long.valueOf(0L), result.getMsgIndex());
        assertEquals(Long.valueOf(50000000L), result.getFeePaid());
        assertEquals(Long.valueOf(0L), result.getCallPrice());
        assertEquals(Long.valueOf(1L), result.getFungible());
        assertEquals(Long.valueOf(1L), result.getVendable());
        assertEquals("", result.getDescription());
        assertEquals(Long.valueOf(1L), result.getReassignable());
        assertEquals("moeftJCWj4fvkBQ8ixSFsxoAiBAks3XprS", result.getSource());
        assertEquals(Long.valueOf(1L), result.getDivisible());
        assertEquals("moeftJCWj4fvkBQ8ixSFsxoAiBAks3XprS", result.getIssuer());
        assertEquals(Long.valueOf(100000000000L), result.getQuantity());
        assertEquals("HEAVEN", result.getAsset());
        assertEquals("5f100357e841146ad7ee51cbc4db298c3d7f5f365ba8a0fed93ec9bf45d527fe", result.getTxHash());
        assertEquals(Long.valueOf(82647L), result.getBlockIndex());
        assertEquals(Long.valueOf(0L), result.getCallDate());
        assertEquals("valid", result.getStatus());
        assertEquals(Long.valueOf(0L), result.getCallable());
        assertEquals(Long.valueOf(0L), result.getTransfer());
        assertEquals(Long.valueOf(1L), result.getListed());
        assertEquals(Long.valueOf(0L), result.getLocked());
        assertEquals(null, result.getAssetLongname());
    }

    @Test
    public void getMempool1() throws Exception {
        try {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getMempool(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);
        assertEquals("", result.getTxHash());
        assertEquals("", result.getCommand());
        assertEquals("", result.getCategory());
        assertEquals("", result.getBindings());
        assertEquals(Long.valueOf(0L), result.getTimestamp());
        } catch (Throwable t) { t.printStackTrace(); throw t; }    }

    @Test
    public void getMessages1() throws Exception {
    }

    @Test
    public void getMessages2() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getMessages(2534262L);
        assertEquals(0, results.size());
        
        var result = results.get(0);
        assertEquals("", result.getMessageIndex());
        assertEquals("", result.getBlockIndex());
        assertEquals("", result.getCommand());
        assertEquals("", result.getCategory());
        assertEquals("", result.getBindings());
        assertEquals("", result.getTimestamp());
        assertEquals(Long.valueOf(0L), result.getTimestamp());
    }
    
    @Test
    public void getOrders1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getOrders(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(21L), result.getTxIndex());
        assertEquals("c645fdcfb47ec4b1d547291d3bdeba6b7beedd790eb4f518f4f72bc9248312c9", result.getTxHash());
        assertEquals(Long.valueOf(82738L), result.getBlockIndex());
        assertEquals("n34j2VSkwR6ofwu8VvFBBqzaRtQiVbCAvK", result.getSource());
        assertEquals("WKTK", result.getGiveAsset());
        assertEquals(Long.valueOf(100000000000L), result.getGiveQuantity());
        assertEquals(Long.valueOf(100000000000L), result.getGiveRemaining());
        assertEquals("XMP", result.getGetAsset());
        assertEquals(Long.valueOf(10000000000L), result.getGetQuantity());
        assertEquals(Long.valueOf(10000000000L), result.getGetRemaining());
        assertEquals(Long.valueOf(7000L), result.getExpiration());
        assertEquals(Long.valueOf(89738L), result.getExpireIndex());
        assertEquals(Long.valueOf(0L), result.getFeeRequired());
        assertEquals(Long.valueOf(0L), result.getFeeRequiredRemaining());
        assertEquals(Long.valueOf(73374L), result.getFeeProvided());
        assertEquals(Long.valueOf(73374L), result.getFeeProvidedRemaining());
        assertEquals("expired", result.getStatus());
    }

    @Test
    public void getOrderExpirations1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getOrderExpirations(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(21L), result.getOrderIndex());
        assertEquals("c645fdcfb47ec4b1d547291d3bdeba6b7beedd790eb4f518f4f72bc9248312c9", result.getOrderHash());
        assertEquals("n34j2VSkwR6ofwu8VvFBBqzaRtQiVbCAvK", result.getSource());
        assertEquals(Long.valueOf(89739L), result.getBlockIndex());
    }

    @Test
    public void getOrderMatches1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getOrderMatches(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals("97727995db2610c7a4e98992ffc46a27062fd95839f58672847e5bd47ceda9d0_5621283ee315220c5bf8ab4b9398ac314fdb0462e663e7abe28ad74c7a9793d6", result.getId());
        assertEquals(Long.valueOf(74L), result.getTx0Index());
        assertEquals("97727995db2610c7a4e98992ffc46a27062fd95839f58672847e5bd47ceda9d0", result.getTx0Hash());
        assertEquals("n2T96WQMsY9jx8dPzczaEub9BGkpGXXs4C", result.getTx0Address());
        assertEquals(Long.valueOf(75L), result.getTx1Index());
        assertEquals("5621283ee315220c5bf8ab4b9398ac314fdb0462e663e7abe28ad74c7a9793d6", result.getTx1Hash());
        assertEquals("mmTczH2SjuzQLxaombReqCynX8RqUMG6MY", result.getTx1Address());
        assertEquals("XMP", result.getForwardAsset());
        assertEquals(Long.valueOf(100000000L), result.getForwardQuantity());
        assertEquals("MONA", result.getBackwardAsset());
        assertEquals(Long.valueOf(100000000L), result.getBackwardQuantity());
        assertEquals(Long.valueOf(91254L), result.getTx0BlockIndex());
        assertEquals(Long.valueOf(91258L), result.getTx1BlockIndex());
        assertEquals(Long.valueOf(91258L), result.getBlockIndex());
        assertEquals(Long.valueOf(1000L), result.getTx0Expiration());
        assertEquals(Long.valueOf(1000L), result.getTx1Expiration());
        assertEquals(Long.valueOf(91278L), result.getMatchExpireIndex());
        assertEquals(Long.valueOf(0L), result.getFeePaid());
        assertEquals("expired", result.getStatus());
    }

    @Test
    public void getOrderMatchExpirations1() throws Exception {
        try {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getOrderMatchExpirations(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals("97727995db2610c7a4e98992ffc46a27062fd95839f58672847e5bd47ceda9d0_5621283ee315220c5bf8ab4b9398ac314fdb0462e663e7abe28ad74c7a9793d6", result.getOrderMatchId());
        assertEquals("n2T96WQMsY9jx8dPzczaEub9BGkpGXXs4C", result.getTx0Address());
        assertEquals("mmTczH2SjuzQLxaombReqCynX8RqUMG6MY", result.getTx1Address());
        assertEquals(Long.valueOf(91279L), result.getBlockIndex());
        } catch (Throwable t) { t.printStackTrace(); throw t; }
    }

    @Test
    public void getRps1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getRps(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(0L), result.getTxIndex());
        assertEquals("",result.getTxHash());
        assertEquals(Long.valueOf(0L),result.getBlockIndex());
        assertEquals("", result.getSource());
        assertEquals(Long.valueOf(0L), result.getPossibleMoves());
        assertEquals(Long.valueOf(0L), result.getWager());
        assertEquals("", result.getMoveRandomHash());
        assertEquals(Long.valueOf(0L), result.getExpiration());
        assertEquals(Long.valueOf(0L), result.getExpireIndex());
        assertEquals("", result.getStatus());
    }

    @Test
    public void getRpsExpirations1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getRpsExpirations(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(0L), result.getRpsIndex());
        assertEquals("", result.getRpsHash());
        assertEquals("", result.getSource());
        assertEquals(Long.valueOf(0L),result.getBlockIndex());
    }

    @Test
    public void getRpsMatches1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getRpsMatches(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);

        assertEquals("",result.getId());
        assertEquals(Long.valueOf(0L), result.getTx0Index());
        assertEquals("",result.getTx0Hash());
        assertEquals("",result.getTx0Address());
        assertEquals(Long.valueOf(0L), result.getTx1Index());
        assertEquals("",result.getTx1Hash());
        assertEquals("", result.getTx1Address());
        assertEquals("", result.getTx0MoveRandomHash());
        assertEquals("", result.getTx1MoveRandomHash());
        assertEquals(Long.valueOf(0L), result.getWager());
        assertEquals(Long.valueOf(0L), result.getPossibleMoves());
        assertEquals(Long.valueOf(0L), result.getTx0BlockIndex());
        assertEquals(Long.valueOf(0L), result.getTx1BlockIndex());
        assertEquals(Long.valueOf(0L),result.getBlockIndex());
        assertEquals(Long.valueOf(0L), result.getTx0Expiration());
        assertEquals(Long.valueOf(0L), result.getTx1Expiration());
        assertEquals(Long.valueOf(0L), result.getMatchExpireIndex());
        assertEquals("", result.getStatus());
        }

    @Test
    public void getRpsMatchExpirations1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getRpsMatchExpirations(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);

        assertEquals("", result.getRpsMatchId());
        assertEquals("",result.getTx0Address());
        assertEquals("", result.getTx1Address());
        assertEquals(Long.valueOf(0L),result.getBlockIndex());
        }

    @Test
    public void getRpsResolves1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getRpsResolves(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(0L), result.getTxIndex());
        assertEquals("",result.getTxHash());
        assertEquals(Long.valueOf(0L), result.getBlockIndex());
        assertEquals("", result.getSource());
        assertEquals(Long.valueOf(0L), result.getMove());
        assertEquals("", result.getRandom());
        assertEquals("", result.getRpsMatchId());
        assertEquals("valid", result.getStatus());
    }


    @Test
    public void getSends1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getSends(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(18L), result.getTxIndex());
        assertEquals("1bdce6d1910849e0b3263f9bb4ec393e79af6a93ac2e91e4ee842a7805f40691", result.getTxHash());
        assertEquals(Long.valueOf(0L), result.getMsgIndex());
        assertEquals(Long.valueOf(82669L), result.getBlockIndex());
        assertEquals("mwEu6Bifp4i5tYj8zDqnThNAPfMtkWKAfK", result.getSource());
        assertEquals("miW8kU4rLaUeHgu9WUaV2kMmWHg1LxWtLM", result.getDestination());
        assertEquals("XMP", result.getAsset());
        assertEquals(Long.valueOf(252520000L), result.getQuantity());
        assertEquals(null, result.getMemo());
        assertEquals(null, result.getMemoHex());
        assertEquals("valid", result.getStatus());
    }

    @Test
    public void getSweeps1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getSweeps(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(1, results.size());
        var result = results.get(0);

        assertEquals(Long.valueOf(511L), result.getTxIndex());
        assertEquals("ab04181e090ca3d683f41eb27bac4fa713893d1431341d919c65bc2b7407b02b", result.getTxHash());
        assertEquals(Long.valueOf(969445L), result.getBlockIndex());
        assertEquals("mwVniVdDnwjwzUPmcXpD8MTQGA83aDKYV2", result.getSource());
        assertEquals("n3WHS2rRGzfzvrDK9xKHEjiV8MgauFN3RV", result.getDestination());
        assertEquals(Long.valueOf(3L), result.getFlags());
        assertEquals("valid", result.getStatus());
        assertEquals(null, result.getMemo());
        assertEquals(Long.valueOf(50000000L), result.getFeePaid());
    }

    @Test
    public void getTriggers1() throws Exception {
        var client = CounterpartyAPIFactory.create("https://counterparty-testnet.api.monaparty.me/");
        var results = client.getTriggers(new Filter[0], null, null, null, 0L, Long.MAX_VALUE, null, 1L, 0L);
        assertEquals(0, results.size());
        /*
        var result = results.get(0);

        assertEquals(Long.valueOf(0L), result.getTxIndex());
        assertEquals("", result.getTxHash());
        assertEquals(Long.valueOf(0L), result.getBlockIndex());
        assertEquals("", result.getSource());
        assertEquals("", result.getTargetHash());
        assertEquals("", result.getPayload());
        assertEquals("", result.getStatus());
        */
    }
}

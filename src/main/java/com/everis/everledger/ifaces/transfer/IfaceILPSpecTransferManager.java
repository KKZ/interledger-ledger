package com.everis.everledger.ifaces.transfer;

import java.util.UUID;

import org.interledger.cryptoconditions.PreimageSha256Condition;
import org.interledger.cryptoconditions.PreimageSha256Fulfillment;

public interface IfaceILPSpecTransferManager {
   // TODO:(0)
    java.util.List<IfaceTransferIfaceILP> getTransfersByExecutionCondition(PreimageSha256Condition condition);

    // TODO:(0) proposeILPTransfer(ILPTransfer
    void prepareILPTransfer(IfaceTransferIfaceILP newTransfer); // TODO:(0) Rename / split into propose/prepare ?

    IfaceTransferIfaceILP executeILPTransfer(IfaceTransferIfaceILP transfer, PreimageSha256Fulfillment executionFulfillment);

    IfaceTransferIfaceILP cancelILPTransfer(IfaceTransferIfaceILP transfer, PreimageSha256Fulfillment cancellationFulfillment);
    
    boolean doesTransferExists(UUID transferId);


}

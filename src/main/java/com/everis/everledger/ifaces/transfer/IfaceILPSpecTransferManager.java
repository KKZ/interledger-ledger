package com.everis.everledger.ifaces.transfer;

import java.util.UUID;

import org.interledger.Condition;
import org.interledger.Fulfillment;

public interface IfaceILPSpecTransferManager {
   // TODO:(0)
    java.util.List<IfaceTransferIfaceILP> getTransfersByExecutionCondition(Condition condition);

    // TODO:(0) proposeILPTransfer(ILPTransfer
    void prepareILPTransfer(IfaceTransferIfaceILP newTransfer); // TODO:(0) Rename / split into propose/prepare ?

    IfaceTransferIfaceILP executeILPTransfer(IfaceTransferIfaceILP transfer, Fulfillment executionFulfillment);

    IfaceTransferIfaceILP cancelILPTransfer(IfaceTransferIfaceILP transfer, Fulfillment cancellationFulfillment);
    
    boolean doesTransferExists(UUID transferId);


}

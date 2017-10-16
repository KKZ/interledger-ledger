package com.everis.everledger.ifaces.transfer;

import com.everis.everledger.ifaces.transfer.ILocalTransfer.LocalTransferID;

public interface IfaceLocalTransferManager {

    IfaceTransferIfaceILP getTransferById(LocalTransferID transferId);

    IfaceTransferIfaceILP executeLocalTransfer(IfaceTransferIfaceILP transfer); // TODO:(0) Check returned IfaceTransferIfaceILP
    
    boolean doesTransferExists(LocalTransferID transferId);

}

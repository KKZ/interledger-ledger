package com.everis.everledger.ifaces.transfer;

import org.interledger.cryptoconditions.PreimageSha256Condition;
import org.interledger.cryptoconditions.PreimageSha256Fulfillment;
import org.interledger.InterledgerAddress;

import java.time.ZonedDateTime;
import java.util.UUID;
import javax.money.MonetaryAmount;


/**
 * Defines a transfer on the ledger.
 */
public interface IfaceILPLedgerTransfer {

  /**
   * Returns the unique id of the transfer.
   */
  UUID getId();

  /**
   * Returns the account from which funds will be transferred.
   */
  InterledgerAddress getFromAccount();

  /**
   * Returns the account to which funds will be transferred.
   */
  InterledgerAddress getToAccount();

  /**
   * Returns the amount being transferred.
   */
  MonetaryAmount getAmount();

  /**
   * TODO:??.
   */
  boolean isILPAuthorized();

  /**
   * TODO:??.
   */
  String getInvoice();

  /**
   * TODO:??.
   */
  byte[] getData();

  /**
   * TODO:??.
   */
  byte[] getNoteToSelf();

  /**
   * Returns the condition under which the transfer will be executed.
   */
  PreimageSha256Condition getExecutionCondition();


  public PreimageSha256Fulfillment getExecutionFulfillment();

  /**
   * The date when the transfer expires and will be rejected by the ledger.
   */
  ZonedDateTime getILPExpiresAt();
  ZonedDateTime getILPPreparedAt();
  ZonedDateTime getILPExecutedAt();
  ZonedDateTime getILPRejectedAt();
  ZonedDateTime getILPProposedAt();


  /**
   * Indicates if the transfer has been rejected.
   */
  boolean isRejected();

  /**
   * Returns the reason for rejecting the transfer.
   */
  String getRejectionMessage();

}

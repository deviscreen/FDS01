package org.kakaobank.evalutation.domain;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/*
 * 이체로그 : Transfer
 * 고객번호 : userid
 * 송금계좌번호 : remittanceAccountNumber
 * 수취은행 : receiptBankName
 * 수취 계좌번호 : receiptAccountNumber
 * 수취계좌주 : receiptUserName
 * 이체금액 : amount
 * 거래시각 : transcationTime
 */
@JsonRootName("tranfer")
public class Transfer {
    Long senderId;
    String remittanceAccountNumber;
    String receiptBankName;
    String receiptAccountNumber;
    String receiptUserName;
    BigDecimal sendAmount;
    LocalDateTime transactionTime;

    public Transfer(Long senderId, String remittanceAccountNumber, String receiptBankName, String receiptAccountNumber, String receiptUserName, BigDecimal sendAmount, LocalDateTime transactionTime) {
        this.senderId = senderId;
        this.remittanceAccountNumber = remittanceAccountNumber;
        this.receiptBankName = receiptBankName;
        this.receiptAccountNumber = receiptAccountNumber;
        this.receiptUserName = receiptUserName;
        this.sendAmount = sendAmount;
        this.transactionTime = transactionTime;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getRemittanceAccountNumber() {
        return remittanceAccountNumber;
    }

    public void setRemittanceAccountNumber(String remittanceAccountNumber) {
        this.remittanceAccountNumber = remittanceAccountNumber;
    }

    public String getReceiptBankName() {
        return receiptBankName;
    }

    public void setReceiptBankName(String receiptBankName) {
        this.receiptBankName = receiptBankName;
    }

    public String getReceiptAccountNumber() {
        return receiptAccountNumber;
    }

    public void setReceiptAccountNumber(String receiptAccountNumber) {
        this.receiptAccountNumber = receiptAccountNumber;
    }

    public String getReceiptUserName() {
        return receiptUserName;
    }

    public void setReceiptUserName(String receiptUserName) {
        this.receiptUserName = receiptUserName;
    }

    public BigDecimal getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(BigDecimal sendAmount) {
        this.sendAmount = sendAmount;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }
}

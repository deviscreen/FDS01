package org.kakaobank.evalutation.domain;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.time.LocalDateTime;

/*
 * 계좌개설로그 : Accountopen
 * 고객번호 : userid
 * 계좌번호 : accountNumber
 * 거래시각 : transactionTime
 */
@JsonRootName("accountopen")
public class AccountOpen {
    Long userid;
    String accountNumber;
    LocalDateTime transactionTime;

    public AccountOpen(Long userid, String accountNumber, LocalDateTime transactionTime) {
        this.userid = userid;
        this.accountNumber = accountNumber;
        this.transactionTime = transactionTime;
    }

    public Long getUserid() {
        return userid;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }


}
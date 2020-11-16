package com.redhat.bankdemo;

import java.math.BigDecimal;
import java.util.Date;

public class Balance {

    public String accountId;
    public BigDecimal amount;
    public Date balanceDate;

    public Balance() {
        
    }

    public Balance(String accountId, BigDecimal amount, Date balanceDate) {
        this.accountId = accountId;
        this.amount = amount;
        this.balanceDate = balanceDate;
    }

    public static Balance fromTransaction(Transaction tx) {
        return new Balance(tx.accountId, tx.balance, tx.timeStamp);
    }

}

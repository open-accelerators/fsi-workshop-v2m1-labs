package com.redhat.bankdemo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Account implements Serializable {

  private static final long serialVersionUID = 3447435845943894804L;

  private BigDecimal balance;
  private BigDecimal beginBalance;
  private BigDecimal creditLine;
  private Date balanceDate;
  private Date beginBalanceTimeStamp;
  private String accountId;
  private String description;
  private String type;

  public Account(String accountId, String type, String description, BigDecimal balance, Date balanceDate, BigDecimal creditLine,
      BigDecimal beginBalance, Date beginBalanceTimeStamp) {
    this.accountId = accountId;
    this.type = type;
    this.description = description;
    this.balance = balance;
    this.balanceDate = balanceDate;
    this.creditLine = creditLine;
    this.beginBalance = beginBalance;
    this.beginBalanceTimeStamp = beginBalanceTimeStamp;
  }

  public Account(String type, String description, BigDecimal balance, Date balanceDate, BigDecimal creditLine, BigDecimal beginBalance,
      Date beginBalanceTimeStamp) {
    this.type = type;
    this.description = description;
    this.balance = balance;
    this.balanceDate = balanceDate;
    this.creditLine = creditLine;
    this.beginBalance = beginBalance;
    this.beginBalanceTimeStamp = beginBalanceTimeStamp;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getDescription() {
    return description;
  }

  public String getType() {
    return type;
  }

  public Date getBalancDate() {
    return balanceDate;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public BigDecimal getCreditLine() {
    return creditLine;
  }

  public BigDecimal getBeginBalance() {
    return beginBalance;
  }

  public  getBeginBalanceTimeStamp() {
    return beginBalanceTimeStamp;
  }

  public BigDecimal getRemainingCredit() {
    if (this.type.equals("Credit")) {
      return creditLine.subtract(balance);
    } else {
      return creditLine;
    }
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setBalanceDate(Date balanceDate) {
    this.balanceDate = balanceDate;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public void setCreditLine(BigDecimal creditLine) {
    this.creditLine = creditLine;
  }

  public void setBeginBalance(BigDecimal beginBalance) {
    this.beginBalance = beginBalance;
  }

  public void setBeginBalanceTimeStamp(Date beginBalanceTimeStamp) {
    this.beginBalanceTimeStamp = beginBalanceTimeStamp;
  }

  @Override
  public String toString() {
    return "Account [accountId=" + accountId + ", type=" + type + ", balance=" + balance+ ", balanceDate=" + balanceDate + ", creditLine=" + creditLine + "]";
  }

}

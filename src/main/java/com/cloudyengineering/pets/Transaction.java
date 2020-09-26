package com.cloudyengineering.pets;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

    @JsonProperty("txn_id")
    private String transactionId;

    @JsonProperty("txn_amount")
    private Double transactionAmount;

    @JsonProperty("txn_date")
    private Date transactionDate;

    @JsonProperty("txn_amount")
    private String transactionMethod;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionMethod() {
        return transactionMethod;
    }

    public void setTransactionMethod(String transactionMethod) {
        this.transactionMethod = transactionMethod;
    }

}

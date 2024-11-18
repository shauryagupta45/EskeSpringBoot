package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Customer;

public class TransactionDetailedDto {

    private Integer transactionDetailedId;
    private String purchaseDate;
    private Integer orderId;
    private Customer customer;
    private boolean orderComplete;

    public Integer getTransactionDetailedId() {
        return transactionDetailedId;
    }

    public void setTransactionDetailedId(Integer transactionDetailedId) {
        this.transactionDetailedId = transactionDetailedId;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isOrderComplete() {
        return orderComplete;
    }

    public void setOrderComplete(boolean orderComplete) {
        this.orderComplete = orderComplete;
    }
}

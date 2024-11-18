package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Customer;

public class TransactionDto {

    private Integer transactionId;
    private String paymentTime;
    private String paymentDate;
    private Customer customer;
    private Integer orderId;
    private Integer totalAmount;
    private String offerCode;
    private Integer offerDiscount;
    private String bankCode;
    private Integer bankDiscount;
    private Integer pointsApplied;
    private Integer totalDiscount;
    private Integer amountPaid;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public Integer getOfferDiscount() {
        return offerDiscount;
    }

    public void setOfferDiscount(Integer offerDiscount) {
        this.offerDiscount = offerDiscount;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Integer getBankDiscount() {
        return bankDiscount;
    }

    public void setBankDiscount(Integer bankDiscount) {
        this.bankDiscount = bankDiscount;
    }

    public Integer getPointsApplied() {
        return pointsApplied;
    }

    public void setPointsApplied(Integer pointsApplied) {
        this.pointsApplied = pointsApplied;
    }

    public Integer getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Integer totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }
}

package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "transaction_table")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Integer transactionId;

    @Column(name = "payment_time")
    private String paymentTime = LocalDateTime.now().toString();

    @Column(name = "payment_date")
    private String paymentDate = Date.valueOf(LocalDate.now()).toString() ;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @Column(name = "order_id",unique = true)
    private Integer orderId;

    @Column(name = "total_amount", nullable = false)
    private Integer totalAmount;

    @Column(name = "offer_code", length = 20)
    private String offerCode = null;

    @Column(name = "offer_discount", columnDefinition = "INT DEFAULT 0")
    private Integer offerDiscount = 0;

    @Column(name = "bank_code", length = 20)
    private String bankCode  = null;

    @Column(name = "bank_discount", columnDefinition = "INT DEFAULT 0")
    private Integer bankDiscount = 0 ;

    @Column(name = "points_applied", columnDefinition = "INT DEFAULT 0")
    private Integer pointsApplied = 0 ;


    @Column(name = "total_discount", nullable = false)
    private Integer totalDiscount;


    @Column(name = "amount_paid", nullable = false)
    private Integer amountPaid;


    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", paymentTime=" + paymentTime +
                ", paymentDate=" + paymentDate +
                ", customerId=" + customer.getCustomerId() +
                ", orderId=" + orderId +
                ", totalAmount=" + totalAmount +
                ", offerCode='" + offerCode + '\'' +
                ", offerDiscount=" + offerDiscount +
                ", bankCode='" + bankCode + '\'' +
                ", bankDiscount=" + bankDiscount +
                ", pointsApplied=" + pointsApplied +
                ", totalDiscount=" + totalDiscount +
                ", amountPaid=" + amountPaid +
                '}';
    }
}
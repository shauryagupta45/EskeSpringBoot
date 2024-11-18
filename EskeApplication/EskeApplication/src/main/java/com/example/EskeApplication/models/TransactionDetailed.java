package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "transaction_detailed")
public class TransactionDetailed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "td_id")
    private Integer transactionDetailedId;

    @Column(name = "purchase_date")
    private String purchaseDate = Date.valueOf(LocalDate.now()).toString() ;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @Column(name = "order_complete", nullable = false)
    private boolean orderComplete = false ;

    @Override
    public String toString() {
        return "TransactionDetailed{" +
                "tdId=" + transactionDetailedId +
                ", purchaseDate=" + purchaseDate +
                ", orderId=" + orderId +
                ", customerId=" + customer.getCustomerId() +
                ", orderComplete=" + orderComplete +
                '}';
    }
}
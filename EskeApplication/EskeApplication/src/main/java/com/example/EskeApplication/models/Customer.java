package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "customer_table")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;


    @Column(name = "customer_email", length = 30, unique = true)
    private String customerEmail;

    @Column(name = "customer_contact_num", length = 10, nullable = false, unique = true)
    private String customerContactNum;

    @Column(name = "customer_fullname", length = 50, nullable = false)
    private String customerFullName;

    @Column(name = "customer_points", nullable = false)
    private Integer customerPoints;

    @Column(name = "customer_address", nullable = false)
    private String customerAddress;

    @OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransactionDetailed> transactionDetailed;

    @OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transaction;

    @OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Delivery> delivery;

    @OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CustomerSupport> customerSupport;

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerContactNum='" + customerContactNum + '\'' +
                ", customerFullName='" + customerFullName + '\'' +
                ", customerPoints=" + customerPoints +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}

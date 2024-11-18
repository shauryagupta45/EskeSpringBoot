package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "delivery")
public class Delivery {

    @Id
    @Column(name = "delivery_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deliveryId;

    @Column(name = "delivery_address", nullable = false)
    private String deliveryAddress;

    @Column(name = "delivery_contact",nullable = false)
    private String deliveryContactNumber;

    @Column(name = "delivery_expected_date")
    private String deliveryExpectedDate;

    @Column(name = "delivery_start_date")
    private String deliveryStartDate;

    @Column(name = "actual_delivery_date")
    private String deliveryActualDate;

    @Column(name = "delivery_status")
    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;

    private enum DeliveryStatus {
        DONE, NOT_DONE
    }

    @Column(name = "delivery_order_id", nullable = false)
    private Integer deliveryOrderId;

    @ManyToOne
    @JoinColumn(name = "delivery_customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customer ;

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryContactNumber='" + deliveryContactNumber + '\'' +
                ", deliveryExpectedDate='" + deliveryExpectedDate + '\'' +
                ", deliveryStartDate='" + deliveryStartDate + '\'' +
                ", deliveryActualDate='" + deliveryActualDate + '\'' +
                ", deliveryStatus=" + deliveryStatus +
                ", deliveryOrderId=" + deliveryOrderId +
                ", customerId=" + customer.getCustomerId() +
                '}';
    }
}
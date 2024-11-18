package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "logistics")
public class Logistics {

    @Id
    @Column(name = "log_shipid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shipmentId;

    @Column(name = "log_shipquantity", nullable = false)
    private Integer shipmentQuantity;

    @Column(name = "log_shipstatus", nullable = false)
    @Enumerated(EnumType.STRING)
    private ShipStatus shipmentStatus;

    public enum ShipStatus{
        DONE,
        NOT_DONE
    }

    @Column(name = "log_shipfrom", nullable = false)
    private String shipmentFrom;

    @Column(name = "log_shipto", nullable = false)
    private String shipmentTo;

    @Column(name = "log_shipcost", nullable = false)
    private String shipmentCost;

    @ManyToOne
    @JoinColumn(name = "log_product_id", referencedColumnName = "prod_id", nullable = false)
    private Product product;

    @Override
    public String toString() {
        return "Logistics{" +
                "shipmentId=" + shipmentId +
                ", shipmentQuantity=" + shipmentQuantity +
                ", shipmentStatus=" + shipmentStatus +
                ", shipmentFrom='" + shipmentFrom + '\'' +
                ", shipmentTo='" + shipmentTo + '\'' +
                ", shipmentCost='" + shipmentCost + '\'' +
                ", productId=" + product.getProductId() +
                '}';
    }
}
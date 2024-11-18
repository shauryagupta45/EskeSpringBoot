package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "items_bought")
public class ItemsBought {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "items_bought_id")
    private Integer itemsBoughtId;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "prod_id", nullable = false)
    private Product productId;

    @Column(name = "quantity",  nullable = false)
    private Integer quantity;

    @Column(name = "total_product_amount",nullable = false)
    private Integer totalProductAmount;

    @Column(name = "total_product_discount", nullable = false)
    private Integer totalProductDiscount;

    @Column(name = "total_product_profit", nullable = false)
    private Integer totalProductProfit;

    @Override
    public String toString() {
        return "ItemsBought{" +
                "itemsBoughtId=" + itemsBoughtId +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", totalProductAmount=" + totalProductAmount +
                ", totalProductDiscount=" + totalProductDiscount +
                ", totalProductProfit=" + totalProductProfit +
                '}';
    }
}
package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product_revenue")
public class ProductRevenue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "revenue_id")
    private Integer revenueId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "prod_id", referencedColumnName = "prod_id")
    private Product product;

    @Column(name = "discount_quarter", nullable = false)
    private Integer discountQuarter;

    @Column(name = "quantity", nullable = false)
    private Integer quantity = 0;

    @Column(name = "profit", nullable = false)
    private Integer profit = 0 ;

    @Column(name="revenue", nullable = false)
    private Integer revenue = 0 ;

    @Override
    public String toString() {
        return "ProductRevenue{" +
                "revenueId=" + revenueId +
                ", productId=" + product.getProductId() +
                ", discountQuarter=" + discountQuarter +
                ", quantity=" + quantity +
                ", profit=" + profit +
                ", revenue=" + revenue +
                '}';
    }
}
package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product_cost_relation")
public class ProductCostRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cost_relation_id")
    private Integer costRelationId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "prod_id", referencedColumnName = "prod_id")
    private Product product;

    @Column(name = "prod_cost_price", nullable = false)
    private Integer productCostPrice;

    @Column(name = "prod_mrp", nullable = false)
    private Integer productMRP;

    @Column(name = "discount_quarter", nullable = false)
    private Integer discountQuarter;

    @Column(name = "prod_discount", nullable = false)
    private Integer productDiscount;

    @Column(name = "prod_selling_price", nullable = false)
    private Integer productSellingPrice;

    @Override
    public String toString() {
        return "ProductCostRelation{" +
                "costRelationId=" + costRelationId +
                ", productId=" + product.getProductId() +
                ", prodCostPrice=" + productCostPrice +
                ", prodMRP=" + productMRP +
                ", discountCounter=" + discountQuarter +
                ", prodDiscount=" + productDiscount +
                ", prodSellingPrice=" + productSellingPrice +
                '}';
    }
}
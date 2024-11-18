package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Integer productId;

    @Column(name = "prod_name", nullable = false, unique = true)
    private String productName;

    @Column(name = "prod_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private ProductType productType;

    public enum ProductType{
        Sophisticated,
        Elite,
        Luxury
    }

    @Column(name = "prod_wax", nullable = false)
    @Enumerated(EnumType.STRING)
    private ProductWax productWax;

    public enum ProductWax{
        Soy_Wax,
        Bees_Wax,
        Coconut_Wax
    }

    @Column(name = "prod_major_scent", nullable = false)
    private String productMajorScent;

    @Column(name = "prod_minor_scent", nullable = false)
    private String productMinorScent;


    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductCostRelation> productCostRelationList ;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductRevenue> productRevenueList;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Logistics> logistics;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ItemsBought> itemsBought;

}
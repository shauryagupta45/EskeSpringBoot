package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "offer_id")
    private Integer offerId;

    @Column(name = "offer_code")
    private String offerCode;

    @Column(name = "offer_discount_max")
    private Integer offerDiscountMax;

    @Column(name = "offer_percentage")
    private Integer offerDiscountPercentage;

    @Override
    public String toString() {
        return "Offer{" +
                "offerId=" + offerId +
                ", offerCode='" + offerCode + '\'' +
                ", offerDiscountMax=" + offerDiscountMax +
                ", offerDiscountPercentage=" + offerDiscountPercentage +
                '}';
    }
}
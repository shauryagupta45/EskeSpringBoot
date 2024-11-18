package com.example.EskeApplication.dto;

public class OfferDto {

    private Integer offerId;
    private String offerCode;
    private Integer offerDiscountMax;
    private Integer offerDiscountPercentage;

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public Integer getOfferDiscountMax() {
        return offerDiscountMax;
    }

    public void setOfferDiscountMax(Integer offerDiscountMax) {
        this.offerDiscountMax = offerDiscountMax;
    }

    public Integer getOfferDiscountPercentage() {
        return offerDiscountPercentage;
    }

    public void setOfferDiscountPercentage(Integer offerDiscountPercentage) {
        this.offerDiscountPercentage = offerDiscountPercentage;
    }
}

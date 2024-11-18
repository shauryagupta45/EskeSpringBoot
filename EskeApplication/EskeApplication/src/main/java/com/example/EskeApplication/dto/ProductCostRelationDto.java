package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Product;

public class ProductCostRelationDto {

    private Integer costRelationId;
    private Integer productId;
    private Integer productCostPrice;
    private Integer productMRP;
    private Integer discountQuarter;
    private Integer productDiscount;
    private Integer productSellingPrice;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }


    public Integer getCostRelationId() {
        return costRelationId;
    }

    public void setCostRelationId(Integer costRelationId) {
        this.costRelationId = costRelationId;
    }

    public Integer getProductCostPrice() {
        return productCostPrice;
    }

    public void setProductCostPrice(Integer productCostPrice) {
        this.productCostPrice = productCostPrice;
    }

    public Integer getProductMRP() {
        return productMRP;
    }

    public void setProductMRP(Integer productMRP) {
        this.productMRP = productMRP;
    }

    public Integer getDiscountQuarter() {
        return discountQuarter;
    }

    public void setDiscountQuarter(Integer discountQuarter) {
        this.discountQuarter = discountQuarter;
    }

    public Integer getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(Integer productDiscount) {
        this.productDiscount = productDiscount;
    }

    public Integer getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(Integer productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }

}

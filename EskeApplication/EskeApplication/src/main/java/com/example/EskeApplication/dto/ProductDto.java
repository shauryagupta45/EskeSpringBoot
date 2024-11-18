package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Product;

public class ProductDto {

    private Integer productId ;
    private String productName ;
    private Product.ProductType productType ;
    private Product.ProductWax productWax ;
    private String productMajorScent ;
    private String productMinorScent ;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product.ProductType getProductType() {
        return productType;
    }

    public void setProductType(Product.ProductType productType) {
        this.productType = productType;
    }

    public Product.ProductWax getProductWax() {
        return productWax;
    }

    public void setProductWax(Product.ProductWax productWax) {
        this.productWax = productWax;
    }

    public String getProductMajorScent() {
        return productMajorScent;
    }

    public void setProductMajorScent(String productMajorScent) {
        this.productMajorScent = productMajorScent;
    }

    public String getProductMinorScent() {
        return productMinorScent;
    }

    public void setProductMinorScent(String productMinorScent) {
        this.productMinorScent = productMinorScent;
    }

    public ProductDto(Integer productId, String productName, Product.ProductType productType, Product.ProductWax productWax, String productMajorScent, String productMinorScent) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productWax = productWax;
        this.productMajorScent = productMajorScent;
        this.productMinorScent = productMinorScent;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productType=" + productType +
                ", productWax=" + productWax +
                ", productMajorScent='" + productMajorScent + '\'' +
                ", productMinorScent='" + productMinorScent + '\'' +
                '}';
    }
<<<<<<< HEAD
}
=======
}

>>>>>>> 303f23edff9e4ebc61916c932457f2f3de8ec608

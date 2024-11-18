package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Product;

public class ItemsBoughtDto {

    private Integer itemsBoughtId;
    private Integer orderId;
    private Product product;
    private Integer quantity;
    private Integer totalProductAmount;
    private Integer totalProductDiscount;
    private Integer totalProductProfit;

    public Integer getItemsBoughtId() {
        return itemsBoughtId;
    }

    public void setItemsBoughtId(Integer itemsBoughtId) {
        this.itemsBoughtId = itemsBoughtId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalProductAmount() {
        return totalProductAmount;
    }

    public void setTotalProductAmount(Integer totalProductAmount) {
        this.totalProductAmount = totalProductAmount;
    }

    public Integer getTotalProductDiscount() {
        return totalProductDiscount;
    }

    public void setTotalProductDiscount(Integer totalProductDiscount) {
        this.totalProductDiscount = totalProductDiscount;
    }

    public Integer getTotalProductProfit() {
        return totalProductProfit;
    }

    public void setTotalProductProfit(Integer totalProductProfit) {
        this.totalProductProfit = totalProductProfit;
    }
}

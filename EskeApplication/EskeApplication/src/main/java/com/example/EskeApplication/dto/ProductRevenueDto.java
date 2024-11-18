package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Product;

public class ProductRevenueDto {

    private Integer revenueId;
    private Product product;
    private Integer discountQuarter;
    private Integer quantity;
    private Integer profit;
    private Integer revenue;

    public Integer getRevenueId() {
        return revenueId;
    }

    public void setRevenueId(Integer revenueId) {
        this.revenueId = revenueId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getDiscountQuarter() {
        return discountQuarter;
    }

    public void setDiscountQuarter(Integer discountQuarter) {
        this.discountQuarter = discountQuarter;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }
}

package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Logistics;
import com.example.EskeApplication.models.Product;

public class LogisticsDto {

    private Integer shipmentId;
    private Integer shipmentQuantity;
    private Logistics.ShipStatus shipmentStatus;
    private String shipmentFrom;
    private String shipmentTo;
    private String shipmentCost;
    private Product product;

    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Integer getShipmentQuantity() {
        return shipmentQuantity;
    }

    public void setShipmentQuantity(Integer shipmentQuantity) {
        this.shipmentQuantity = shipmentQuantity;
    }

    public Logistics.ShipStatus getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(Logistics.ShipStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getShipmentFrom() {
        return shipmentFrom;
    }

    public void setShipmentFrom(String shipmentFrom) {
        this.shipmentFrom = shipmentFrom;
    }

    public String getShipmentTo() {
        return shipmentTo;
    }

    public void setShipmentTo(String shipmentTo) {
        this.shipmentTo = shipmentTo;
    }

    public String getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(String shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

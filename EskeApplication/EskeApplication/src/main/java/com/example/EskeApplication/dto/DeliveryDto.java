package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Customer;
import com.example.EskeApplication.models.Delivery;

public class DeliveryDto {

    private Integer deliveryId;
    private String deliveryAddress;
    private String deliveryContactNumber;
    private String deliveryExpectedDate;
    private String deliveryStartDate;
    private String deliveryActualDate;
    private Delivery.DeliveryStatus deliveryStatus;
    private Integer deliveryOrderId;
    private Customer customer ;


    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryContactNumber() {
        return deliveryContactNumber;
    }

    public void setDeliveryContactNumber(String deliveryContactNumber) {
        this.deliveryContactNumber = deliveryContactNumber;
    }

    public String getDeliveryExpectedDate() {
        return deliveryExpectedDate;
    }

    public void setDeliveryExpectedDate(String deliveryExpectedDate) {
        this.deliveryExpectedDate = deliveryExpectedDate;
    }

    public String getDeliveryStartDate() {
        return deliveryStartDate;
    }

    public void setDeliveryStartDate(String deliveryStartDate) {
        this.deliveryStartDate = deliveryStartDate;
    }

    public String getDeliveryActualDate() {
        return deliveryActualDate;
    }

    public void setDeliveryActualDate(String deliveryActualDate) {
        this.deliveryActualDate = deliveryActualDate;
    }

    public Delivery.DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Delivery.DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Integer getDeliveryOrderId() {
        return deliveryOrderId;
    }

    public void setDeliveryOrderId(Integer deliveryOrderId) {
        this.deliveryOrderId = deliveryOrderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

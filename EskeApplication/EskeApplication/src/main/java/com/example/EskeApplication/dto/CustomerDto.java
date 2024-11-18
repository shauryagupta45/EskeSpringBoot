package com.example.EskeApplication.dto;

public class CustomerDto {

    private Integer customerId;
    private String customerEmail;
    private String customerContactNum;
    private String customerFullName;
    private Integer customerPoints;
    private String customerAddress;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerContactNum() {
        return customerContactNum;
    }

    public void setCustomerContactNum(String customerContactNum) {
        this.customerContactNum = customerContactNum;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public Integer getCustomerPoints() {
        return customerPoints;
    }

    public void setCustomerPoints(Integer customerPoints) {
        this.customerPoints = customerPoints;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerId=" + customerId +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerContactNum='" + customerContactNum + '\'' +
                ", customerFullName='" + customerFullName + '\'' +
                ", customerPoints=" + customerPoints +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}

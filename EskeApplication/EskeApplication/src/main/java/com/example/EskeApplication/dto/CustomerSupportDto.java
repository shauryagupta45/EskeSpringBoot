package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Customer;
import com.example.EskeApplication.models.CustomerSupport;
import com.example.EskeApplication.models.Employee;

public class CustomerSupportDto {

    private int custTicketId;
    private CustomerSupport.custStatus custStatus;
    private String custTicketDescription ;
    private String custTicketLogDate;
    private String custTicketCloseDate;
    private Integer custOrderId ;
    private Employee employee;
    private Customer customer;

    public int getCustTicketId() {
        return custTicketId;
    }

    public void setCustTicketId(int custTicketId) {
        this.custTicketId = custTicketId;
    }

    public CustomerSupport.custStatus getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(CustomerSupport.custStatus custStatus) {
        this.custStatus = custStatus;
    }

    public String getCustTicketDescription() {
        return custTicketDescription;
    }

    public void setCustTicketDescription(String custTicketDescription) {
        this.custTicketDescription = custTicketDescription;
    }

    public String getCustTicketLogDate() {
        return custTicketLogDate;
    }

    public void setCustTicketLogDate(String custTicketLogDate) {
        this.custTicketLogDate = custTicketLogDate;
    }

    public String getCustTicketCloseDate() {
        return custTicketCloseDate;
    }

    public void setCustTicketCloseDate(String custTicketCloseDate) {
        this.custTicketCloseDate = custTicketCloseDate;
    }

    public Integer getCustOrderId() {
        return custOrderId;
    }

    public void setCustOrderId(Integer custOrderId) {
        this.custOrderId = custOrderId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

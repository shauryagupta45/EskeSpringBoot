package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "customer_support")
public class CustomerSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_ticketid")
    private int custTicketId;

    @Column(name = "cust_ticket_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private custStatus custTicketStatus;

    public enum custStatus {
        OPEN, CLOSED
    }

    @Column(name = "cust_ticket_desc", nullable = false)
    private String custTicketDescription ;

    @Column(name = "cust_ticket_logdate", nullable = false)
    private String custTicketLogDate = Date.valueOf(LocalDate.now()).toString();

    @Column(name = "cust_ticket_closedate", nullable = false)
    private String custTicketCloseDate;

    @Column(name = "cust_order_id", nullable = false)
    private Integer custOrderId ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_employee_id", referencedColumnName = "emp_id", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "cust_customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customer;

    @Override
    public String toString() {
        return "CustomerSupport{" +
                "custTicketId=" + custTicketId +
                ", custTicketStatus=" + custTicketStatus +
                ", custTicketDescription='" + custTicketDescription + '\'' +
                ", custTicketLogDate=" + custTicketLogDate +
                ", custTicketCloseDate=" + custTicketCloseDate +
                ", custEmployeeId=" + employee.getEmployeeId() +
                ", custCustomerId=" + customer.getCustomerId() +
                '}';
    }
}
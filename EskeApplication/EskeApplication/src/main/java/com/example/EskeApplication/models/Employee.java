package com.example.EskeApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.* ;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer employeeId;

    @Column(name = "emp_name", nullable = false)
    private String employeeName;

    @Column(name = "start_date", nullable = false)
    private String employeeStartDate;

    @Column(name = "emp_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private EmpStatus employeeStatus;

    public enum EmpStatus {
        Active,
        Inactive
    }

    @Column(name = "emp_contact", nullable = false)
    private String employeeContactNumber;

    @Column(name = "emp_role", nullable = false)
    private String employeeRole;

    @Column(name = "can_approve", nullable = false)
    private Boolean canEmployeeApprove = false;

    @ManyToOne
    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "team_id", nullable = false)
    private Team team;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CustomerSupport> customerSupportList;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeJoiningDate='" + employeeStartDate + '\'' +
                ", employeeStatus=" + employeeStatus +
                ", employeeContactNumber='" + employeeContactNumber + '\'' +
                ", employeeRole='" + employeeRole + '\'' +
                ", canEmployeeApprove=" + canEmployeeApprove +
                ", employeeDepartmentId=" + department.getDepartmentId() +
                ", employeeTeamId=" + team.getTeamId() +
                '}';
    }


}
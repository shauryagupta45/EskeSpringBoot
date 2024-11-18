package com.example.EskeApplication.dto;

import com.example.EskeApplication.models.Department;
import com.example.EskeApplication.models.Employee;
import com.example.EskeApplication.models.Team;

public class EmployeeDto {

    private Integer employeeId;
    private String employeeName;
    private String employeeStartDate;
    private Employee.EmpStatus employeeStatus;
    private String employeeContactNumber;
    private String employeeRole;
    private Boolean canEmployeeApprove;
    private Department department;
    private Team team;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(String employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    public Employee.EmpStatus getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(Employee.EmpStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public void setEmployeeContactNumber(String employeeContactNumber) {
        this.employeeContactNumber = employeeContactNumber;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public Boolean getCanEmployeeApprove() {
        return canEmployeeApprove;
    }

    public void setCanEmployeeApprove(Boolean canEmployeeApprove) {
        this.canEmployeeApprove = canEmployeeApprove;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

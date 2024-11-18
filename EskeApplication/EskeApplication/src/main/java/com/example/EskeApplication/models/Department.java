package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dept_id")
    private Integer departmentId;

    @Column(name = "dept_name", nullable = false)
    private String departmentName;

    @Column(name = "dept_head")
    private String departmentHead;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employeeList ;

    @OneToMany(mappedBy = "department" ,  cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Team> teamList ;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentHead='" + departmentHead + '\'' +
                '}';
    }
}
package com.example.EskeApplication.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Integer teamId;

    @Column(name = "team_status", nullable = false)
    private String teamStatus;

    @ManyToOne
    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id", nullable = false)
    private Department department;

    @Column(name = "teamlead_id")
    private Integer teamLeadId;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employeeList ;

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamStatus='" + teamStatus + '\'' +
                ", departmentId=" + department.getDepartmentId() +
                ", teamLeadId=" + teamLeadId +
                '}';
    }
}
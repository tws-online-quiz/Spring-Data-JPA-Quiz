package com.example.employee.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(name = "companyName")
    private String companyName;

    @NotNull
    @Column(name = "employeesNumber")
    private Integer employeesNumber;

    @OneToMany(cascade = {CascadeType.ALL})
    //可以执行所有的级联操作
    @JoinColumn(name = "companyId")
    private List<Employee> employees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", employeesNumber=" + employeesNumber +
                ", employees=" + employees +
                '}';
    }
}

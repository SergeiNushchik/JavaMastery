package com.mastery.java.task.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Date;




public class Employee {

    private int  employeeId;

    private String firstName;

    private String lastName;

    private Integer departmentId;

    private String jobTitle;

    private Gender gender;

    private Date date_of_birth;

    public Employee() {
    }

    public Employee(String firstName, String lastName,
                    Integer departmentId, String jobTitle,
                    Gender gender, Date date_of_birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int  employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentId=" + departmentId +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", date_of_birth=" + date_of_birth +
                '}';
    }

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }
}

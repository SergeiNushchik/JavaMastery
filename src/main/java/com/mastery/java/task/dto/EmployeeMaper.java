package com.mastery.java.task.dto;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMaper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getInt("employee_id"));
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setDepartmentId(resultSet.getInt("department_id"));
        employee.setJobTitle(resultSet.getString("job_title"));
        employee.setGender(resultSet.getString("gender"));
        employee.setDate_of_birth(resultSet.getDate("date_of_birth"));
        return employee;
    }
}

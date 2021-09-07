package com.mastery.java.task.dao;

import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.dto.EmployeeMaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Configuration
public class EmployeeDao {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> index() {
        return jdbcTemplate.query("SELECT*FROM employee", new EmployeeMaper());

    }

    public Employee getById(int id) {
        return jdbcTemplate.query("SELECT *  FROM employee WHERE employee_id = " + id + ";", new EmployeeMaper())
                .stream().findAny().orElse(null);
    }

    public void deleteById(int id) {
        jdbcTemplate.update("DELETE FROM employee WHERE employee_id =?", id);
    }


    public void save(Employee employee) {
        jdbcTemplate.update("INSERT INTO employee (first_name, last_name, department_id, job_title, gender, date_of_birth) VALUES (?,?,?,?,?,?)",
                employee.getFirstName(), employee.getLastName(), employee.getDepartmentId(),
                employee.getJobTitle(), employee.getGender().toString(), employee.getDate_of_birth()
        );
    }

    public void update(int id, Employee employee) {
        jdbcTemplate.update("UPDATE employee SET first_name =? , last_name = ?, department_id = ?, job_title =?, gender =?, date_of_birth =? WHERE employee_id = ?",
                employee.getFirstName(), employee.getLastName(), employee.getDepartmentId(),
                employee.getJobTitle(), employee.getGender().toString(), employee.getDate_of_birth(), id);
    }


}

package com.mastery.java.task.service;

import com.mastery.java.task.dao.EmployeeDao;
import com.mastery.java.task.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class EmployeeService {


        @Autowired
        private EmployeeDao employeeDao;


        public void create(Employee employee) {
            employeeDao.save(employee);
        }


        public List<Employee> readAll() {
            return employeeDao.index();
        }


        public Employee read(int id) {
            return employeeDao.getById(id);
        }


        public void update(Employee employee, int id) {
            employeeDao.update(id, employee);
        }


        public void delete(int id) {
            employeeDao.deleteById(id);
        }

    }

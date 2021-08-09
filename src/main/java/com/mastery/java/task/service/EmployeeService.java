package com.mastery.java.task.service;

import com.mastery.java.task.dao.EmployeeDao;
import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.service.api.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {


    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void create(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public List<Employee> readAll() {
        return   employeeDao.findAll();
    }

    @Override
    public Employee read(long id) {
        return employeeDao.getById(id);
    }

    @Override
    public boolean update(Employee employee, long id) {
        if (employeeDao.existsById(id)) {
            employee.setEmployeeId(id);
            employeeDao.save(employee);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(long id) {
        if(employeeDao.existsById(id)){
            employeeDao.deleteById(id);
            return true;
        }
        return false;
    }
}

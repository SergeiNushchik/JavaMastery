package com.mastery.java.task.rest;


import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody

public class EmployeeController  {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

  @PostMapping()
  public ResponseEntity<?> create(@RequestBody Employee employee) {
      employeeService.create(employee);
      return new ResponseEntity<>(HttpStatus.CREATED);
  }

    @GetMapping()
    public ResponseEntity<List<Employee>> read() {
        final List<Employee> employees = employeeService.readAll();
       return employees != null &&  !employees.isEmpty()
              ? new ResponseEntity<>(employees, HttpStatus.OK)
              : new ResponseEntity<>(HttpStatus.NOT_FOUND);
   }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> read(@PathVariable int id) {
        final Employee employees = employeeService.read(id);

        return employees != null
                ? new ResponseEntity<>(employees, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

  @PutMapping(value = "/{id}")
  public ResponseEntity<?> update(@PathVariable int id, @RequestBody Employee employee) {
     employeeService.update(employee, id);

      return new ResponseEntity<>(HttpStatus.OK);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<?> delete(@PathVariable int  id) {
     employeeService.delete(id);
       return  new ResponseEntity<>(HttpStatus.OK);

   }
}


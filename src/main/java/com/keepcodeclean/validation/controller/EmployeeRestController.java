package com.keepcodeclean.validation.controller;

import com.keepcodeclean.validation.Employee;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("rest")
@Validated
public class EmployeeRestController {

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody @Valid Employee employee) {
        return employee;
    }
    
    @GetMapping("/employee/{id}")
    public Employee findEmployee(@PathVariable @Min(1) Long id) {
        Employee employee = new Employee();
        employee.setId(String.valueOf(id));
        
        return employee;
    }
}

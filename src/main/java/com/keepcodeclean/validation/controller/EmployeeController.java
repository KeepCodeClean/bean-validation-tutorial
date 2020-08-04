package com.keepcodeclean.validation.controller;

import com.keepcodeclean.validation.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class EmployeeController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String intro(Model model) {
        model.addAttribute(new Employee());
        
        return "intro";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(@Valid Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "intro";
        }
        return "intro";
    }
    
}

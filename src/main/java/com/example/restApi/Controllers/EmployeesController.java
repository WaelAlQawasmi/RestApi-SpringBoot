package com.example.restApi.Controllers;

import com.example.restApi.DTO.EmployeeDOT;
import com.example.restApi.Servises.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
    @Autowired
    EmployeesService employeesService;

    @PostMapping("/employee/add")
    public String addEmployee(@RequestBody EmployeeDOT employeeDOT){
        employeesService.addEmpEmployees(employeeDOT);
        return "employee added successfully";
    }
}

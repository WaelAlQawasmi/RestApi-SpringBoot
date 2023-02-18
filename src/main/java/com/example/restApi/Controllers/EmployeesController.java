package com.example.restApi.Controllers;

import com.example.restApi.DTO.EmployeeDOT;
import com.example.restApi.Entity.Employees;
import com.example.restApi.Servises.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class EmployeesController {
    @Autowired
    EmployeesService employeesService;

    @PostMapping("/employee/add")
    public String addEmployee(@RequestBody EmployeeDOT employeeDOT) throws ParseException {
        employeesService.addEmpEmployees(employeeDOT);
        return "employee added successfully";
    }

    @GetMapping("/employee/findbyname/{name}")
    public Employees findbyname(@PathVariable("name") String name){
      return   employeesService.findEmployeeByName(name);
    }


    @GetMapping("/employee/find-company-of-employee/{id}")
    public String findCompany(@PathVariable("id") Long id){
        return   employeesService.findCompanyOfEmployeeById(id);
    }

    @GetMapping("/employee/findEmployeeDetails/{id}")
    public List<Object[]> findEmployeeDetails(@PathVariable("id") Long id){
        return   employeesService.findEmployeeDetailsById(id);
    }


    @GetMapping("/employee/findEmployeeNameById/{id}")
    public String findEmployeeNameById(@PathVariable("id") Long id){
        return   employeesService.findEmployeeNameById(id);
    }


    @GetMapping("/employee/findBetweenTwoDates/")
    public List<Employees> findBetweenTwoDates(@RequestParam String start, @RequestParam String end) throws ParseException {
        return   employeesService.findEmployeesStartBetweenTwoDates(start,end);
    }
}

package com.example.restApi.Servises;

import com.example.restApi.DTO.EmployeeDOT;
import com.example.restApi.Entity.Company;
import com.example.restApi.Entity.Employees;
import com.example.restApi.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;
    @Autowired
    CompanyService companyService;

    public String addEmpEmployees( EmployeeDOT employeeDOT){

        Company company= companyService.findCompanyById(employeeDOT.getCompanyId());
        Employees employee= new Employees(employeeDOT.getName(), employeeDOT.getSalary(), employeeDOT.getStartDate(),company);
        employeesRepository.save(employee);


        return "the Employee add successfully";

    }
}

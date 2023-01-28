package com.example.restApi.Servises;

import com.example.restApi.DTO.EmployeeDOT;
import com.example.restApi.Repository.EmployeesRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {
    EmployeesRepository employeesRepository;
    public String addEmpEmployees(Long companyId, EmployeeDOT employeeDOT){


        return "the Employee add successfully";

    }
}

package com.example.restApi.Servises;

import com.example.restApi.DTO.EmployeeDOT;
import com.example.restApi.Entity.Company;
import com.example.restApi.Entity.Employees;
import com.example.restApi.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;
    @Autowired
    CompanyService companyService;

    public String addEmpEmployees( EmployeeDOT employeeDOT) throws ParseException {

        Company company= companyService.findCompanyById(employeeDOT.getCompanyId());
        DateTimeFormatter fIn = DateTimeFormatter.ofPattern( "uuuu-MM-dd" , Locale.UK );  // As a habit, specify the desired/expected locale, though in this case the locale is irrelevant.

        LocalDate ld = LocalDate.parse( employeeDOT.startDate ,fIn);
          //timezone of your database
        Employees employee= new Employees(employeeDOT.getName(), employeeDOT.getSalary(), ld,company);
        employeesRepository.save(employee);
        return "the Employee add successfully";

    }

    public Employees findEmployeeByName( String name){

        Employees employee= employeesRepository.findByname(name);
        return employee;

    }

    public String findCompanyOfEmployeeById( Long Id){
        String CompanyName= employeesRepository.findCompanyNameById(Id);
        return CompanyName;

    }

    public String findEmployeeNameById( Long Id){
        String EmployeeName= employeesRepository.findName(Id);
        return EmployeeName;

    }

    public List<Object[]> findEmployeeDetailsById( Long Id){
        List<Object[]> Employee= employeesRepository.findEmployeeDetails(Id);
        return Employee;

    }

    public List<Employees> findEmployeesStartBetweenTwoDates(String start, String end) throws ParseException {
        DateTimeFormatter fIn = DateTimeFormatter.ofPattern( "uuuu-MM-dd" , Locale.UK );  // As a habit, specify the desired/expected locale, though in this case the locale is irrelevant.

        LocalDate starting = LocalDate.parse( start ,fIn);
        LocalDate ending = LocalDate.parse( end ,fIn);

        return employeesRepository.findBystartDateBetween(starting,ending);
    }



}

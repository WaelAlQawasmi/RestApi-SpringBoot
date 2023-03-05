package com.example.restApi;

import com.example.restApi.Controllers.EmployeesController;
import com.example.restApi.DTO.EmployeeDOT;
import com.example.restApi.DTO.companyDTO;
import com.example.restApi.Servises.CompanyService;
import com.example.restApi.Servises.EmployeesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class employeesTests {
    @Autowired
    EmployeesService employeesService;
    @Autowired
    CompanyService companyService;



    @BeforeEach
    public void setup() {
      	companyDTO company= new companyDTO("company","079999");
        companyService.addCompany(company);
    }

    @Test
    void testServiceAddCompany() throws ParseException {

        EmployeeDOT employeeDOT= new EmployeeDOT("company",500,"2010-10-10", 1L);
        String addUserExpected= employeesService.addEmpEmployees(employeeDOT);
        assertEquals(addUserExpected,"the Employee add successfully");

    }


}

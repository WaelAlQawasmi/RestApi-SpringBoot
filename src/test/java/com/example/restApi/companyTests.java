package com.example.restApi;

import com.example.restApi.Controllers.companyController;
import com.example.restApi.DTO.companyDTO;
import com.example.restApi.Servises.CompanyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class companyTests {

    @Autowired
	CompanyService CompanyService;
	@Autowired
	companyController companyController;

	@Test
	void testServiceAddCompany()  {
		companyDTO company= new companyDTO("company","079999");
		HttpStatus addUserExpected= CompanyService.addCompany(company);
		companyController.addCompany(company);
		assertEquals(addUserExpected,HttpStatus.OK);
	}

	@Test
	void testControllerAddCompany()  {
		companyDTO company= new companyDTO("company","079999");
		HttpStatus addUserExpected= companyController.addCompany(company);
		assertEquals(addUserExpected,HttpStatus.OK);
	}

}

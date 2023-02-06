package com.example.restApi.Controllers;

import com.example.restApi.DTO.companyDTO;
import com.example.restApi.Entity.Company;
import com.example.restApi.Servises.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@RestController
public class companyController {


  @Autowired
  CompanyService companyServise;


    @PostMapping("/company/add/")
    public HttpStatus addCompany(@RequestBody companyDTO company){
      return companyServise.addCompany(company);
    }



    @GetMapping ("/company/{id}")
    public Company editCompany(@PathVariable("id") Long id){
        return companyServise.findCompanyById(id);
    }

    @ResponseBody
    @DeleteMapping ("/company/{id}")
    public RedirectView deleteCompany(@PathVariable("id") int id){
        return new RedirectView("/all/companies");
    }


}

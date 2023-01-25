package com.example.restApi.Servises;

import com.example.restApi.DTO.companyDTO;
import com.example.restApi.Entity.*;
import com.example.restApi.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public HttpStatus addCompany(companyDTO companyDTO){
        Company company=new Company(companyDTO.getName(),companyDTO.getPhoneNumber());
        companyRepository.save(company);
                return HttpStatus.OK;    }

    public Company findCompanyById(Long id){
         return companyRepository.findById(id) .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

      }
}


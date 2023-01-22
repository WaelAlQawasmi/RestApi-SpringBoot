package com.example.test799.Reposoory;

import com.example.test799.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyReposotry extends JpaRepository<Company,Long> {
}

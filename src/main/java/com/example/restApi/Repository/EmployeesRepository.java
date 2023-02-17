package com.example.restApi.Repository;

import com.example.restApi.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Long> {
    Employees findByname(String name);

    @Query(value = "SELECT name FROM Employees u WHERE u.id = ?1",
            nativeQuery = true)
    String findName(Long id);

    public static final String FIND_EmployeeDetails = "SELECT e.start_date, e.salary FROM Employees e WHERE e.id = ?1";
    @Query(value = FIND_EmployeeDetails, nativeQuery = true)
    List<Object[]> findEmployeeDetails(Long id);

    @Query(value = "SELECT c.name FROM Employees e INNER JOIN Company c ON e.company_id=c.id   WHERE e.id = ?1",
            nativeQuery = true)
    String findCompanyNameById(Long id);

}


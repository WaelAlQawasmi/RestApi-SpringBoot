package com.example.restApi.DTO;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder

@Setter
public class EmployeeDOT {

    public String name;

    public int salary;

    public String startDate;

    public   Long CompanyId;
}

package com.example.restApi.DTO;

import com.example.restApi.Entity.Employees;
import lombok.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class companyDTO {

    public String name;
    public String phoneNumber;

}

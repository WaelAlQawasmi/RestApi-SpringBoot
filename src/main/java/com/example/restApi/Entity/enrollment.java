package com.example.restApi.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter

public class enrollment {
    @Id
    @GeneratedValue
    Long id;

    @NonNull
    String start;
    @NonNull
    String leaving;

    @NonNull
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "employee_id")
    Employees employee;

}
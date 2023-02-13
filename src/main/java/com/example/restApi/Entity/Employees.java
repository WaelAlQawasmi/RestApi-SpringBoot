package com.example.restApi.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter

public class Employees {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue

    private Long id;
    @NonNull
    String name;
    @NonNull
    int salary;
    @NonNull
    String startDate;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "company_id")
    Company company;
    @OneToMany(mappedBy = "employee")
    List<enrollment> enrollments;




}

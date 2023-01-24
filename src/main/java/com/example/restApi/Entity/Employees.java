package com.example.restApi.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter

public class Employees {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @NonNull
    String name;
    @NonNull
    int salary;
    @NonNull
    int startDate;




}

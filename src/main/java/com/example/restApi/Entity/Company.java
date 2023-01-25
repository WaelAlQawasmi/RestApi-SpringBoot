package com.example.restApi.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor

public class Company {
    @Id
@GeneratedValue
    Long id;
    @NonNull
    String name;
    @NonNull

    String phoneNumber;

}

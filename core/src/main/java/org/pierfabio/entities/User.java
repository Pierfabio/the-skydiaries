package org.pierfabio.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private int age;

    private String nationality;

    enum Gender{
        MALE,
        FEMALE
    }

}

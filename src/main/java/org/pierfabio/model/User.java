package org.pierfabio.model;

import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
package org.pierfabio.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("users")
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
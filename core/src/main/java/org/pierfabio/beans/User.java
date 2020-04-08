package org.pierfabio.beans;

public class User {

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

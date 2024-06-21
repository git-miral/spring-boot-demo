package com.amira.SpringDemo.student;

import java.time.LocalDate;

public class student {

    private String firstname;

    private String lastname;

    private LocalDate dateofBirth;

    private  String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public student(String firstname,
                   String lastname, LocalDate dateofBirth, String email, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofBirth = dateofBirth;
        this.email = email;
        this.age = age;
    }

    public student() {
    }

    private Integer age;

}

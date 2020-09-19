package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerEntity {

    public Long getId() {
        return id;
    }

    public Long getAge() {
        return age;
    }

    public String getRegistration() {
        return registration;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setAge(final Long age) {
        this.age = age;
    }

    public void setRegistration(final String registration) {
        this.registration = registration;
    }

    @Id
    private Long   id;
    private Long   age;
    private String registration;
}

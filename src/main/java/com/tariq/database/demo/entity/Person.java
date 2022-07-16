package com.tariq.database.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String location;
    private Date birthDate;

    public Person(String name, String location, Date birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }
}

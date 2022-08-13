package com.tariq.database.demo.service;

import com.tariq.database.demo.dao.PersonJpaDao;
import com.tariq.database.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonJpaDao dao;

    public List<Person> getAllPersons()
    {
        return dao.findAll();
    }

    public Person addPerson(Person person)
    {
        return dao.save(person);
    }
}

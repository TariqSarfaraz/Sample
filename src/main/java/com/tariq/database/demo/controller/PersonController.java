package com.tariq.database.demo.controller;

import com.tariq.database.demo.entity.Person;
import com.tariq.database.demo.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService service;

    /**
     * To get all Persons
     *
     * @return Person
     * @throws Exception exception
     */
    @GetMapping("/persons")
    @Operation(summary = "To get all Persons", tags = "Person")
    public List<Person> getAll() throws Exception
    {
        return service.getAllPersons();
    }

    /**
     * To add a Person
     *
     * @param person
     * @return ResponseEntity
     * @throws Exception exception
     */
    @PostMapping("/persons")
    @Operation(summary = "To add a Person", tags = "Person")
    public ResponseEntity<Person> addPerson(@RequestBody Person person) throws Exception
    {
        Person response = service.addPerson(person);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}

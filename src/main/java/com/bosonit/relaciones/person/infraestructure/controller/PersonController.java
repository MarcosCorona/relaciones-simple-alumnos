package com.bosonit.relaciones.person.infraestructure.controller;

import com.bosonit.relaciones.person.application.PersonService;
import com.bosonit.relaciones.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping
    public Person addPerson(@RequestBody Person newPerson){
        return personService.addPerson(newPerson);
    }

    @GetMapping("/{person_id}")
    public Optional<Person> findById(@PathVariable Long person_id){
        return personService.findById(person_id);
    }

    @GetMapping
    public List<Person> findAll(){
        return personService.findAllPersons();
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person personUpdated){
        return personService.updatePerson(personUpdated);
    }

}

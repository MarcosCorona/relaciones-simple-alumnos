package com.bosonit.relaciones.person.application;

import com.bosonit.relaciones.person.domain.Person;
import com.bosonit.relaciones.person.infraestructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person addPerson(Person personAdded){

        return personRepository.save(personAdded);
    }

    public String deletePerson(Long idPersonDeleted){
        personRepository.deleteById(idPersonDeleted);
        return "Persona eliminada.";
    }


    //shd have the same id the person we want to update.
    public Person updatePerson(Person personUpdated){
        return personRepository.save(personUpdated);
    }

    public Optional<Person> findById(Long personId){
        return personRepository.findById(personId);
    }

    public List<Person> findAllPersons(){
        return personRepository.findAll();
    }


}

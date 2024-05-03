package com.kadiraksoy.springbootpostgresqdocker.service;

import com.kadiraksoy.springbootpostgresqdocker.model.Person;
import com.kadiraksoy.springbootpostgresqdocker.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        Optional<Person> personOptional = personRepository.findById(id);
        return personOptional.orElse(null);
    }

    public Person createPerson(Person person) {

        Person newPerson = personRepository.save(person);
        System.out.println(person.getName()+ " "+ "eklendi");

        return newPerson;
    }

    public Person updatePerson(Long id, Person updatedPerson) {
        if (personRepository.existsById(id)) {
            updatedPerson.setId(id);
            return personRepository.save(updatedPerson);
        }
        return null;
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }


}
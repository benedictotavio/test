package com.br.service;

import com.br.domain.Person;

public class PersonService {
    public boolean isAdult(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person can´t be null");
        }
        return person.getAge() >= 21;
    }
}

package com.br.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.br.domain.Person;

public class PersonServiceTest {

    protected PersonService personService = new PersonService();

    private Person adult;
    private Person notAdult;
    private Person nullPeople;

    @BeforeEach
    public void setup() {
        adult = new Person(20);
        notAdult = new Person(6);
    }

    /**
     * Teste de verificação de idade
     * 
     * @author Otavio Benedicto
     * @date 14/12/2023
     */

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse() {
        Assertions.assertEquals(false, personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greater than 18")
    void isAdult_ReturnTrue() {
        Assertions.assertFalse(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should be return a illegal exception")
    void isAdult_ReturnIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.isAdult(nullPeople));
    }
}

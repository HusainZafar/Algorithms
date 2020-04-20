package com.husain.javaPractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTestStatic {

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();
        assertEquals(3, myPerson.numberOfPersons());
    }
}
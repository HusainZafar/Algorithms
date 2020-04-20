package com.husain.javaPractice;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person person = new Person();
        assertEquals("Hello World", person.helloWorld() );
        person = null;
    }

    @Test
    public void shouldReturnHelloHusain() {
        Person husain = new Person();
        assertEquals("Hello Husain", husain.helloPerson("Husain"));
        husain = null;
    }
}
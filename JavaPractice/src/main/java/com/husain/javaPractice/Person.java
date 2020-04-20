package com.husain.javaPractice;
import com.husain.javaPractice.attributes.Name;

public class Person {

    // Name class is empty right now
    private Name personName;
    private static int personCounter;

    public Person() {
        /*
         * default constructor, required by a future application.
         */
        personCounter++;
    }

    public Person(Name personName) {
        this.personName = personName;
    }

    public static int numberOfPersons() {
        return personCounter;
    }

    public Name getPersonName() {
        return personName;
    }

    public String helloPerson(String name) {
        return "Hello " + name;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
//        Person p = new Person();
//        // null
//        System.out.println(p.getPersonName());
    }
}

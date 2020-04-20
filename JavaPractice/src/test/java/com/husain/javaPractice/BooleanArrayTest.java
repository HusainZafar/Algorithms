package com.husain.javaPractice;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BooleanArrayTest {
    @Test
    public void shouldShortCircuit() {
        Boolean result = true || (5/0 < 3);
    }

    @Test
    public void demonstrateArrayInit() {
        Person[] persons = new Person[4];
        int[] numbers = new int[4];
        persons[1] = new Person();
        numbers[1] = 5;
        assertEquals(true, persons[1] instanceof Person);
        assertEquals(null, persons[0]);

        assertEquals(true, Integer.class.isInstance(numbers[1]));
        assertEquals(0, numbers[0]);
        assertEquals(4, numbers.length);

        // Another syntax
        Person[] persons2 = {null, null, new Person()};
        assertEquals(3, persons2.length);

        Person[] empty = new Person[4];
        // foreach
        for (Person p : empty) {
            assertEquals(null, p);
        }

    }

    @Test
    public void demonstrateMultidimArrayInit() {
        // Multidim array
        int[][] twoDNumbers = new int[2][3];
        Person [][][] threeDPerson = new Person[2][4][3];
        assertEquals(null, threeDPerson[1][1][1]);

        // multidim shorthand
        int[][] twoDNumbers2 = {
                {0, 42, 3,},
                {6, 6, -33,},
        };
        assertEquals(2, twoDNumbers2.length);
        assertEquals(42, twoDNumbers2[0][1]);
    }
}

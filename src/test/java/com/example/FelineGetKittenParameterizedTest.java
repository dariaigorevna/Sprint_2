package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FelineGetKittenParameterizedTest {

    private final int inputNumber;
    private final int expected;

    public FelineGetKittenParameterizedTest(int inputNumber, int expected) {
        this.inputNumber = inputNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                { Integer.MIN_VALUE, Integer.MIN_VALUE},
                { Integer.MAX_VALUE, Integer.MAX_VALUE},
                {0, 0}
        };
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(inputNumber);
        assertEquals(expected, actual);
    }
}

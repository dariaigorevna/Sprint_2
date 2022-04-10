package com.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    final List<String> STUB_FELINE_GET_FOOD = List.of("мышка", "норушка");

    @Mock
    Feline feline;

    @Test
    public void hasManeTrueTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void hasManeFalseTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void lionConstructorThrowsExceptionTest() throws Exception {
        Lion lion = new Lion("UndefinedGender", feline);
    }

    @Rule
    public ExpectedException thrownLion = ExpectedException.none();

    @Test
    public void lionConstructorThrowsExceptionTextTest() throws Exception {
        thrownLion.expect(Exception.class);
        thrownLion.expectMessage("Используйте допустимые значения пола животного - самей или самка");
        Lion lion = new Lion("UndefinedGender", feline);
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }


    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(STUB_FELINE_GET_FOOD);
        assertEquals(STUB_FELINE_GET_FOOD, lion.getFood());
    }
}
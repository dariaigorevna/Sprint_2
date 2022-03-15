package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals( List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String result = feline.getFamily();
        assertEquals("Кошачьи", result);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int result = feline.getKittens();
        assertEquals(1,result);
    }

}
package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void animalGetFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String>  result = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), result);
    }

    @Test
    public void animalGetFoodPredator() throws Exception {
        Animal animal = new Animal();
        List<String>  result = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), result);
    }

    @Test(expected = Exception.class)
    public void animalGetFoodThrowsExceptionTest() throws Exception {
        Animal animal = new Animal();
        animal.getFood("UndefinedAnimal");
    }

    @Rule
    public ExpectedException thrownAnimal = ExpectedException.none();

    @Test
    public void animalGetFoodThrowsExceptionTextTest() throws Exception {
        Animal animal = new Animal();
        thrownAnimal.expect(Exception.class);
        thrownAnimal.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        animal.getFood("UndefinedAnimal");
    }

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String result = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", result);
    }
}
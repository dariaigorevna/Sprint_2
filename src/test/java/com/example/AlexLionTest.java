package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlexLionTest {

    @Test
    public void getFriendsTest() throws Exception {
        Feline feline = new Feline();
        AlexLion alexLion = new AlexLion(feline);
        List<String> result = alexLion.getFriends();
        assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), result);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Feline feline = new Feline();
        AlexLion alexLion = new AlexLion(feline);
        String result = alexLion.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", result);
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        AlexLion alexLion = new AlexLion(feline);
        int result = alexLion.getKittens();
        assertEquals(0,result);
    }
}
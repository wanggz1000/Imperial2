package com.example.imperial2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Imperial2Test {
    Imperial2Calculator exp = new Imperial2Calculator();

    @Test
    void gramTest1(){
        double a = 10;
        double expectedResult = 283.5;
        double result = exp.gram(a);
        assertEquals(expectedResult,result);
    }

    @Test
    void kilogramTest1(){
        double a = 10;
        double expectedResult = 63.5;
        double result = exp.kilogram(a);
        assertEquals(expectedResult,result);
    }
}

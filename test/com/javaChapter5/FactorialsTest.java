package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialsTest {
    Factorials myFactorial;
    @BeforeEach
    void setUp() {
        myFactorial = new Factorials();
        System.out.println("Starting setup.....");
    }

    @AfterEach
    void tearDown() {
        myFactorial = null;
        System.out.println("Ending setup.....");
    }

    @Test
    void testMethodToGenerateFactorial(){
        myFactorial.generateFactorial(5);
        long result = myFactorial.getResult();
        assertEquals(result, 120);
    }
}
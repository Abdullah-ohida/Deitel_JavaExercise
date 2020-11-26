package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingTheProductOfOddIntegersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void findNumberBetweenOneAndFifteen(){
        CalculatingTheProductOfOddIntegers myValue = new CalculatingTheProductOfOddIntegers();
        myValue.getProductOfOdd(15);
        System.out.println(myValue.getResult());
        assertEquals(myValue.getResult(), 135135);
    }
}
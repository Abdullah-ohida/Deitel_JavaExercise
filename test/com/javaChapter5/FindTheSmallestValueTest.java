package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FindTheSmallestValueTest {
    FindTheSmallestValue myValue;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkForSmallestValue(){
        myValue = new FindTheSmallestValue();
        myValue.findSmallest(5);
        int result = myValue.getResult();
        assertEquals(result, 5);
    }


}
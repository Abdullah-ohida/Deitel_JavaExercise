package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedCompoundInterestProgramTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void checkForCompoundInterest(){
        ModifiedCompoundInterestProgram myCompound = new ModifiedCompoundInterestProgram();
        myCompound.compoundInterest(302.0, 3);

        assertEquals(myCompound.getFinalAmount(), 300);
    }

}
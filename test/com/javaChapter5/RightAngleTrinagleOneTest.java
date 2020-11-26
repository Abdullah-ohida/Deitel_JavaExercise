package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightAngleTrinagleOneTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void checkHowManyAsteriskIsPrinted(){
        RightAngleTrinagleOne asterisk = new RightAngleTrinagleOne();
        asterisk.printAsteriskOne(7);
    }

    @Test
    public void checkHowManyAsteriskIsPrintedTwo(){
        RightAngleTrinagleOne asteriskTwo = new RightAngleTrinagleOne();
        asteriskTwo.printAsteriskTwo(7);
    }

    @Test
    public void checkHowManyAsteriskIsPrintedThree(){
        RightAngleTrinagleOne asteriskThree = new RightAngleTrinagleOne();
        asteriskThree.printAsteriskThree(12);
    }

    @Test
    public void checkHowManyAsteriskIsPrintedFour(){
        RightAngleTrinagleOne asteriskFour = new RightAngleTrinagleOne();
        asteriskFour.printAsteriskFour(12);
    }




}

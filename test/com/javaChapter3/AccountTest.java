package com.javaChapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account myAccount;
    String product;
    @BeforeEach
    void setUp() {
        myAccount = new Account();
    }

    @AfterEach
    void tearDown() {
        myAccount = null;
    }

    @Test
    void CheckForProductName(){
        myAccount.setProductName("AbdulAccount");
        product = myAccount.getProductName();
        assertEquals("AbdulAccount", product);
    }
}
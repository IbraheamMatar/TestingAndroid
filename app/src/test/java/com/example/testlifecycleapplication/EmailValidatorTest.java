package com.example.testlifecycleapplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;

public class EmailValidatorTest {

    private ArrayList<String> list;
    EmailValidator emvAL = new EmailValidator();
    // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void initialization() {
        System.out.println("initialization is Done");
    }

    @Before
    public void cycle2() {
        emvAL = new EmailValidator();
    }


    @AfterClass
    public static void cycle3() {
    }


    @After
    public void cycle4() {
    }



    @Test
    public void emailNotValid() {
       assertTrue(emvAL.isValidEmail("name-email.com"));
        System.out.println("Your Email is Filled");
    }

    @Test
    public void emailValid() {
        assertTrue(emvAL.isValidEmail("name@email.com"));
        System.out.println("Your Email is Success");
    }

    @Test
    public void emailEmpty() {
        assertTrue(emvAL.isValidEmail(""));
    }

    @Test
    public void email_isNull() {
        assertTrue(emvAL.isValidEmail(null));
    }


}

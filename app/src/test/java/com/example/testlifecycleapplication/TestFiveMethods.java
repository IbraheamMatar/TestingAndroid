package com.example.testlifecycleapplication;

import org.junit.After;
import static org.junit.After.*;
import org.junit.AfterClass;
import static org.junit.AfterClass.*;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before.*;
import org.junit.BeforeClass;
import static org.junit.BeforeClass.*;
import org.junit.Test;

import java.util.ArrayList;

public class TestFiveMethods {

    private ArrayList<String> list;
    EmailValidator emvAL = new EmailValidator();
    // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void initialization() {
        System.out.println("runOnceBeforeClass");
    }


    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void cycle2() {
        emvAL = new EmailValidator();
        System.out.println(" runBeforeTestMethod");
    }




    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void cycle3() {
        System.out.println("runOnceAfterClass");
    }


    // Should rename to @AfterTestMethod
    @After
    public void cycle4() {
        System.out.println("runAfterTestMethod");
    }


    @Test
    public void cycle5() {
       // assertEquals("Expected resulet not equal 100",100,80);
        //assertTrue(emvAL.isValidEmail("name-email.com"));

        System.out.println(" test_method");
    }

    @Test
    public void cycle6() {
        System.out.println(" test_method_1");
    }

}

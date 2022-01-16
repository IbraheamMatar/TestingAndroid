package com.example.testlifecycleapplication;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EmailValidatorTest.class,
        PrimeNumberCheckerTest.class
})

public class TestSuite {
}

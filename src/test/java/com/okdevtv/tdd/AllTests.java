package com.okdevtv.tdd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.okdevtv.tdd.calculator.ComputerTest;
import com.okdevtv.tdd.hello.HelloWorldTest;
import com.okdevtv.tdd.hello.StringUtilsTest;

@RunWith(Suite.class)
@SuiteClasses({
	ComputerTest.class,
	HelloWorldTest.class,
	StringUtilsTest.class,
})
public class AllTests {

}

package com.object.Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)//to execute one or more classes together
@SuiteClasses({ClassA.class,ClassB.class})

public class TestSuite {

	
}

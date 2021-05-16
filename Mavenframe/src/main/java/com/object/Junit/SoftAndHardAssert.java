package com.object.Junit;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SoftAndHardAssert {

	
	//Assertion --in framework to check the expected and actual result by using assert
	
	//hard assert
	//soft assert
	/*@Test
	public void testCase1(){
		System.out.println("Before Assertion");
		Assert.assertEquals(true, false);
		System.out.println("After Assertion");
	}
	*/
	@Test
	public void testCase2(){
		//soft assert it s a class eventhough if we face exception the next part of execution will happen
		SoftAssert assert1= new SoftAssert();
		System.out.println("Before Assertion");
		assert1.assertEquals(true, false);
		System.out.println("After Assertion");
	}
}

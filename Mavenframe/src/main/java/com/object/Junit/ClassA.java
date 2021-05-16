package com.object.Junit;

import org.junit.Ignore;
import org.junit.Test;

public class ClassA {

	@Test
	public void testCase1(){
		System.out.println("Testing the first testcase");
	}
	
	@Test
	public void testCase2(){
		System.out.println("Testing the second testcase");
	}
	
	@Test(expected= ArithmeticException.class)
	public void testCase3(){
		int a= 10;
		int b= 0;
		int sum = a/b;
		System.out.println(sum);
	}
}

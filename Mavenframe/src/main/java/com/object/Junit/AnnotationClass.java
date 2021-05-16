package com.object.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationClass {

	
		
		//flow chart of junit annotaion
		@Test
		public void testCase1(){
			System.out.println("Test Case1");
		}
		
		@Test
		public void testCase2(){
			System.out.println("Test Case2");
		}
		
		@BeforeClass
		static public void beforeClass(){
			System.out.println("Before testcase");
		}
		
		@Before
		public void before(){
			System.out.println("Before class");
		}
		
		@After
		public void after(){
			System.out.println("After testcase");
		}
		
		@AfterClass
		static public void afterClass(){
			System.out.println("After class");
		}
	}


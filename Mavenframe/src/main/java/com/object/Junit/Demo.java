package com.object.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Demo {

	//verify the testcases
	//using Junit annotation
	
	@Test
	public void testSetup(){
		String str = "Iam testing the Junit!!!";
		//assert equals is one of the function comes from assertclass
		assertEquals("Iam testing the Junit",str);
	}
}

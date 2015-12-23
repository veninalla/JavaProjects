package com.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParanthesisTest {
	@Test
	public void testMethod1(){
		Paranthesis p = new Paranthesis();
		boolean a = p.balParanthesis("Nall)Test(");
		Assert.assertEquals(a, false);
	}
	@Test
	public void testMethod2(){
		Paranthesis p = new Paranthesis();
		boolean a = p.balParanthesis("(())");
		Assert.assertEquals(a, true);
	}
	@Test
	public void testMethod3(){
		Paranthesis p = new Paranthesis();
		boolean a = p.balParanthesis("(()))" );
		Assert.assertEquals(a, false);
	}
	

}

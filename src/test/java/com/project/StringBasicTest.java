package com.project;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StringBasicTest {
	private StringBasic s;
	
	@BeforeClass
	public void setup() {
		s= new StringBasic();
		
	}
	@AfterClass
	public void tearDown() {
		
	}
	@Test
	public void reverseStringTest() {
		String actual = s.reverseStr("Welcome");
		Assert.assertEquals("emocleW", actual);
		

	}
	@Test
	public void replaceStringTest() {
		String s = "Welcome";
		Assert.assertEquals( "Walcoma", s.replace("e", "a"));
		

	}
   @Test
   public void convertStringTest(){
	   String actual = s.convertsString("This is nice");
	   Assert.assertEquals(actual, "This1 is2 nice3");
		

   }
   @Test
   public void reverseSentenceTest(){
	   String actual = s.reverseSentence("This is nice");
	   Assert.assertEquals(actual, "sihT si ecin");
		

   }

	@Test
	public void palindromeTest(){
		boolean actual = s.palindrome("alla");
		Assert.assertEquals(actual, true);
	}

	@Test
	public void palindromeTest1(){
		boolean actual = s.palindrome("Alla");
		Assert.assertEquals(actual, true);
	}

	@Test
	public void palindromeTest2(){
		boolean actual = s.palindrome("nalla");
		Assert.assertEquals(actual, false);
	}
}


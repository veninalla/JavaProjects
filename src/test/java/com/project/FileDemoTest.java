package com.project;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDemoTest {
	

	
	@Test
	public void countWordsTest() throws IOException{
		
		FileDemo fd = new FileDemo("C:\\Users\\nveni\\Documents\\Demo\\demo.txt");
		int wc = fd.wordCount();
		Assert.assertEquals(wc, 17);
		System.out.println("The file " + fd.getFileName() + " has " + wc + " words");
	}
	@Test
	public void countWordsTest1() throws IOException{
		
		FileDemo fd = new FileDemo("C:\\Users\\nveni\\Documents\\Demo\\demo1.txt");
		int wc = fd.wordCount();
		Assert.assertEquals(wc, 0);
	}
	
	@Test
	public void countStringTest(){
		
		FileDemo sc = new FileDemo("C:\\Users\\nveni\\Documents\\Demo\\demo.txt");
		 int tn = sc.stringCount("test");
		 Assert.assertEquals(tn, 3);

	}
	@Test
	public void strReplaceTest() throws IOException{
		
		FileDemo sr = new FileDemo("C:\\Users\\nveni\\Documents\\Demo\\demo.txt" , "C:\\Users\\nveni\\Documents\\Demo\\demo3.txt");
		sr.strReplace("test", "best");
		//Assert.assertEquals(actual, expected);
	}

}

package com.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileWriteTest {
	
	
	@Test
	public void fileWTest() throws IOException{
		String fileName ="C:\\Users\\nveni\\Documents\\Demo\\demo3.txt";
		FileWrite fw = new FileWrite();
		fw.writeFile(fileName);
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		Assert.assertEquals(br.readLine(), "this is the test58");
		br.close();
		
		
	}

}

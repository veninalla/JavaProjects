package com.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScannerExampleTest {
	
	
	@Test
	public void scannertest(){
		ScannerExample se = new ScannerExample();
		//System.out.println("Enter the values: ");
		int c = se.getValue();
	
		Assert.assertEquals(12,c );
		
	}
	
	
	

}

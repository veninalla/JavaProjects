package com.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConsoleDemoTest {
	
	@Test
	public void divTest(){
		
		ConsoleDemo cd = new ConsoleDemo();
		int a = cd.consoleDiv();
		Assert.assertEquals(a, 10);//100/10=10
	}

}

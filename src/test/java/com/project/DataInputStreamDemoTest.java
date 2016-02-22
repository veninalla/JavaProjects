package com.project;

import java.io.DataInputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataInputStreamDemoTest {
	
	
	@Test
	public void DataInStreamtest(){
		
		DataInputStreamDemo ds = new DataInputStreamDemo();
		int n = ds.dataInStream();
		Assert.assertEquals(n, 50);//5*10=50
	}

}

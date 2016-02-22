package com.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BufferedReaderDemoTest {

	@Test
	public void bufftest() {

		BufferedReaderDemo br = new BufferedReaderDemo();
		int c = br.BuffReader();
		Assert.assertEquals(c, 10);//20-10=10

	}

}

package com.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapNumbersTest {
	@Test
	public void method1() {
		SwapNumbers s = new SwapNumbers(6, 5);
		s.swap();
		Assert.assertEquals(s.getX(), 5);
		Assert.assertEquals(s.getY(), 6);
	}

	@Test
	public void NegativeTest1() {
		SwapNumbers s = new SwapNumbers(6, -5);
		s.swap();
		Assert.assertEquals(s.getX(), -5);
		Assert.assertEquals(s.getY(), 6);
	}

	@Test
	public void NegativeTest2() {
		SwapNumbers s = new SwapNumbers(-6, 5);
		s.swap();
		Assert.assertEquals(s.getX(), 5);
		Assert.assertEquals(s.getY(), -6);
	}

	@Test
	public void NegativeTest3() {
		SwapNumbers s = new SwapNumbers(-6, -5);
		s.swap();
		Assert.assertEquals(s.getX(), -5);
		Assert.assertEquals(s.getY(), -6);
	}

	@Test
	public void NegativeTest4() {
		SwapNumbers s = new SwapNumbers(0, 5);
		s.swap();
		Assert.assertEquals(s.getX(), 5);
		Assert.assertEquals(s.getY(), 0);
	}

	@Test
	public void NegativeTest5() {
		SwapNumbers s = new SwapNumbers(6, 0);
		s.swap();
		Assert.assertEquals(s.getX(), 0);
		Assert.assertEquals(s.getY(), 6);
	}

	@Test
	public void NegativeTest6() {
		SwapNumbers s = new SwapNumbers(0, 0);
		s.swap();
		Assert.assertEquals(s.getX(), 0);
		Assert.assertEquals(s.getY(), 0);
	}

	@Test
	public void method2() {
		SwapNumbers s = new SwapNumbers(6, 5);
		s.swap2();
		Assert.assertEquals(s.getX(), 5);
		Assert.assertEquals(s.getY(), 6);
	}

	@Test
	public void NegativeTest7() {
		SwapNumbers s = new SwapNumbers(6, -5);
		s.swap();
		Assert.assertEquals(s.getX(), -5);
		Assert.assertEquals(s.getY(), 6);
	}

	@Test
	public void NegativeTest8() {
		SwapNumbers s = new SwapNumbers(-6, 5);
		s.swap();
		Assert.assertEquals(s.getX(), 5);
		Assert.assertEquals(s.getY(), -6);
	}

	@Test
	public void NegativeTest9() {
		SwapNumbers s = new SwapNumbers(-6, -5);
		s.swap();
		Assert.assertEquals(s.getX(), -5);
		Assert.assertEquals(s.getY(), -6);
	}

	@Test
	public void NegativeTest10() {
		SwapNumbers s = new SwapNumbers(6, 0);
		s.swap();
		Assert.assertEquals(s.getX(), 0);
		Assert.assertEquals(s.getY(), 6);
	}

	@Test
	public void NegativeTest11() {
		SwapNumbers s = new SwapNumbers(0, 5);
		s.swap();
		Assert.assertEquals(s.getX(), 5);
		Assert.assertEquals(s.getY(), 0);
	}

	@Test
	public void NegativeTest12() {
		SwapNumbers s = new SwapNumbers(0, 0);
		s.swap();
		Assert.assertEquals(s.getX(), 0);
		Assert.assertEquals(s.getY(), 0);
	}
}

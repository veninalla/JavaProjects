package com.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayBasicTest {
	@Test
	public void generateLNtest1() {
		int in[] = { 2, 3, 4, 5, 6, 7, 8 };
		int expected = 8;
		ArrayBasic max = new ArrayBasic(in);
		int actual = max.findMax();
		Assert.assertEquals(actual, expected);;
		;
	}

	@Test
	public void generateLNtest2() {
		int in[] = { 2, 3, 4, 8, 5, 6, 7 };
		int expected = 8;
		ArrayBasic max = new ArrayBasic(in);
		int actual = max.findMax();
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void generateLNtest3() {
		int in[] = { -2, -3, -4, -8, -5, -6, -7 };
		int expected = -2;
		ArrayBasic max = new ArrayBasic(in);
		int actual = max.findMax();
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void generateLNtest4() {
		int in[] = { 77 };
		int expected = 77;
		ArrayBasic max = new ArrayBasic(in);
		int actual = max.findMax();
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void generateLNtest5() {
		int in[] = { 0 };
		int expected = 0;
		ArrayBasic max = new ArrayBasic(in);
		int actual = max.findMax();
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void generateLNtest6() {
		int in[] = { 2, 3, -4, -8, 5, -6, 7 };
		int expected = 7;
		ArrayBasic max = new ArrayBasic(in);
		int actual = max.findMax();
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void existsTest1() {
		int in[] = { 2, 3, 4, 7, 9, 6 };
		int v = 4;
		boolean expected = true;
		ArrayBasic obj = new ArrayBasic(in);
		boolean actual = obj.exists(v);
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void existsTest2() {
		int in[] = { 2, 3, 4, 7, 9, 6 };
		int v = 5;
		boolean expected = false;
		ArrayBasic obj = new ArrayBasic(in);
		boolean actual = obj.exists(v);
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void existsTest3() {
		int in[] = { 2, 3, -4, -7, 9, -6 };
		int v = -4;
		boolean expected = true;
		ArrayBasic obj = new ArrayBasic(in);
		boolean actual = obj.exists(v);
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void existsTest4() {
		int in[] = { 0 };
		int v = 0;
		boolean expected = true;
		ArrayBasic obj = new ArrayBasic(in);
		boolean actual = obj.exists(v);
		Assert.assertEquals(actual, expected);

	}
	@Test
	public void commonNumberTest1(){
		int n[] = {2,3,4,5,66,7,8};
		int m[] = {22,33,44,5,77,88};
		Integer expected =  5;
		ArrayBasic obj = new ArrayBasic(n, m);
		Integer actual = obj.commonNumber();
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void commonNumberTest2(){
		int n[] = {2,3,4,-5,66,7,8};
		int m[] = {22,33,44,5,77,88};
		Integer expected =  null;
		ArrayBasic obj = new ArrayBasic(n, m);
		Integer actual = obj.commonNumber();
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void commonNumberTest3(){
		int n[] = {0,3,4,5,66,7,8};
		int m[] = {22,33,44,0,77,88};
		Integer expected =  0;
		ArrayBasic obj = new ArrayBasic(n, m);
		Integer actual = obj.commonNumber();
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void commonNumberTest4(){
		int n[] = {-8};
		int m[] = {-8};
		Integer expected =  -8;
		ArrayBasic obj = new ArrayBasic(n, m);
		Integer actual = obj.commonNumber();
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void commonNumberTest5(){
		int n[] = {2,3,4,5,66,7,8};
		int m[] = {5,33,4,5,77,88};
		Integer expected =  4;
		ArrayBasic obj = new ArrayBasic(n, m);
		Integer actual = obj.commonNumber();
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void commonNumberTest6(){
		int n[] = {2,3,4,5,66,7,8};
		int m[] = {5,33,4,5,77,88};
		Integer expected =  5;
		ArrayBasic obj = new ArrayBasic(m, n);
		Integer actual = obj.commonNumber();
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void sortTest1(){
		int n[] = {7,99,3,6,124};
		int[] expected = {3,6,7,99,124};
		ArrayBasic obj = new ArrayBasic(n);
		  obj.sort();
		  Assert.assertEquals(obj.getN(), expected);
	}
	@Test
	public void swapTest1(){
		int n[] = {1,2,5,6,4};
		int[] expected = {1,2,4,6,5};
		ArrayBasic obj = new ArrayBasic(n);
		  obj.swap();
		  Assert.assertEquals(obj.getN(), expected);
	}
	@Test
	public void mergeTest(){
		int n[] = {2,4,6,8};
		int m[] = {1,3,5,7,9};
		int expected[] = {2,4,6,8,1,3,5,7,9};
		ArrayBasic obj = new ArrayBasic(n,m);
		int actual[] = obj.merge();
		Assert.assertEquals(actual, expected);
	}
	
}

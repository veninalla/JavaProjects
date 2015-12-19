package JavaProjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciNumberTest {
	@Test
	public void generateFSTest(){
		int[] expected = {0,1,1,2,3};
		FibonacciSeries f = new FibonacciSeries();
		int[] actual = f.generateFS(5);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void generateFSTest1(){
		int[] expected = {0,1};
		FibonacciSeries f = new FibonacciSeries();
		int[] actual = f.generateFS(2);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void generateFSTest2(){
		int[] expected = {0,1,1,2};
		FibonacciSeries f = new FibonacciSeries();
		int[] actual = f.generateFS(4);
		Assert.assertEquals(actual, expected);
	}
}
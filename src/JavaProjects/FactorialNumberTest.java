package JavaProjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialNumberTest {
	@Test
	public void positive1(){
		FactorialNumber obj = new FactorialNumber();
		int actual = obj.findFact(5);
		int expected = 120;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void positive2(){
		FactorialNumber obj = new FactorialNumber();
		int actual = obj.findFact(0);
		int expected = 1;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void positive3(){
		FactorialUsesRecursion obj = new FactorialUsesRecursion();
		int actual = obj.factorial(5);
		int expected = 120;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void positive4(){
		FactorialUsesRecursion obj = new FactorialUsesRecursion();
		int actual = obj.factorial(0);
		int expected = 1;
		Assert.assertEquals(actual, expected);
	}

}

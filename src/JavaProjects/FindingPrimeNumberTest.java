package JavaProjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindingPrimeNumberTest {
	
	//Test case
		@Test
		public void Positive1(){
			int n = 17;
			boolean r = FindingPrimeNumber.PrimeNumber(n);
			Assert.assertEquals(r, true);
			Assert.assertNotEquals(r, false);
		}
		@Test
		public void Positive2(){
			int n = 11;
			boolean r = FindingPrimeNumber.PrimeNumber(n);
			Assert.assertEquals(r, true);
			Assert.assertNotEquals(r, false);
		}
		@Test
		public void Negative1(){
			int n = 20;
			boolean r = FindingPrimeNumber.PrimeNumber(n);
			Assert.assertEquals(r, false);
			Assert.assertNotEquals(r, true);
		}
		@Test
		public void Negative2(){
			int n = 114;
			boolean r = FindingPrimeNumber.PrimeNumber(n);
			Assert.assertEquals(r, false);
			Assert.assertNotEquals(r, true);
		}
		
		@Test
		public void Negative3(){
			int n = 0;
			boolean r = FindingPrimeNumber.PrimeNumber(n);
			Assert.assertEquals(r, false);
			Assert.assertNotEquals(r, true);
		}
	}



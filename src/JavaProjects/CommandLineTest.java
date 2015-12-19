package JavaProjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommandLineTest {

	@Test
	public void test1() {
		CommandLine c = new CommandLine();
		System.out.println("Enter Value: ");
		String s = c.getValue();
		Assert.assertEquals(s, "test");
	}

}

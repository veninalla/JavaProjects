package JavaProjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ForAndWhileLoopstest {
	//test case
  @Test
	public void a(){
		int n =3;
     String r = ForAndWhileLoops.method1(n);
	 Assert.assertEquals(r, "ping");
	}
  @Test
    public void b(){
	    int n = 5;
	 String r = ForAndWhileLoops.method1(n);
	 Assert.assertEquals(r, "pong");
    }
  @Test
    public void c(){
	   int n = 15;
	 String r = ForAndWhileLoops.method1(n);
	 Assert.assertEquals(r, "ping pong");
  }
  @Test
    public void d(){
	   int n = 17;
	 String r = ForAndWhileLoops.method1(n);
	 Assert.assertEquals(r, n+ "");
    }
	
//Negative testcase.
  @Test
  public void Negative1(){
	  int n = 5;
	String r = ForAndWhileLoops.method1(n);
	Assert.assertNotEquals(r, "ping");
	Assert.assertNotEquals(r, "ping pong");
	Assert.assertNotEquals(r, "5");
    }
  @Test
  public void Negative2(){
	  int n = 9;
	String r = ForAndWhileLoops.method1(n);
	Assert.assertNotEquals(r, "pong");
	Assert.assertNotEquals(r, "ping pong");
	Assert.assertNotEquals(r, "9");
	}
  @Test
  public void Negative3(){
	  int n = -1;
	String r = ForAndWhileLoops.method1(n);
	Assert.assertNotEquals(r, "ping pong");
	Assert.assertNotEquals(r, "pong");
	Assert.assertNotEquals(r, "ping");
    }
  @Test
  public void Negative4(){
	  int n = 0;
	String r = ForAndWhileLoops.method1(n);
	Assert.assertNotEquals(r, "ping");
	Assert.assertNotEquals(r, "pong");
	Assert.assertNotEquals(r, "ping pong");
    }
}
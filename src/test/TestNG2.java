package test;

import org.testng.annotations.Test;

public class TestNG2 {
  @Test
  	public void f() 
  	{
	  	System.out.println("Unit Testing");
  	}
  @Test(groups={"first"})
	public void a() 
	{
	  	System.out.println("Integration Testing");
	}
  @Test(groups={"first"})
	public void b() 
	{
	  	System.out.println("System Testing");
	}
  @Test
	public void c() 
	{
	  	System.out.println("Acceptance Testing");
	}
}

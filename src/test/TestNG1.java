package test;

import org.testng.annotations.Test;

public class TestNG1 {
 
	@Test(priority=-2)
		public void welcome()
		{
			System.out.println("Welcome to TestNG");
		}
	@Test(priority=-3)
		public void hello()
		{
			System.out.println("Hello");
		}
	@Test(priority=-1)//(enabled=false)
		public void automation()
		{
			System.out.println("Automation");
		}
}

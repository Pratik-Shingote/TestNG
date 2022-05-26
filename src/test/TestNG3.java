package test;

import org.testng.annotations.Test;

public class TestNG3 {
	@Test(dependsOnMethods="p")
		public void x()
  		{
		  	System.out.println("Smoke Testing");
	  	}
	/*@Test(groups={"first"})
		public void y() 
		{
		  	System.out.println("Sanity Testing");
		}
	@Test(groups={"first"})
		public void z() 
		{
		  	System.out.println("White Box Testing");
		}*/
	@Test
		public void p() 
		{
		  	System.out.println("Black Box Testing");
		}
  
}

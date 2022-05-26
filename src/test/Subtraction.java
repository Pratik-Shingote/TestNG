package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtraction {
  @Test
 
	  @Parameters({"a","b"})
		
		public void subtraction(int a,int b)
		{
			int c=a-b;
			System.out.println("The subtraction is: "+c);
		}
  
}

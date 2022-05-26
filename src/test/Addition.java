package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addition {
  @Test
	  @Parameters({"a","b"})
		
		public void addition(int a,int b) {
			
			int c=a+b;
			System.out.println("The addition is :"+c);
		}	
  
}

package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
		
		@Test(groups={"answer"})
		@Parameters({"a","b"})
		
		public void addition(int a,int b) {
			
			int c=a+b;
			System.out.println("The addition is :"+c);
		}	
		@Test(groups={"answer"})
		@Parameters({"x","y"})
		
		public void subtraction(int x,int y)
		{
			int z=x-y;
			System.out.println("The subtraction is: "+z);
		}
}

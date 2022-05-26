package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider(name="data-provider")
	public Object[][] dpMethod()
	{
		return new Object[][] {{"First-Value"},{"Second-Value"}};
	}
	
	@Test(dataProvider="data-provider")
		public void f(String val) {
			
		System.out.println("Passed Parameter Is :"+val);
	}
}

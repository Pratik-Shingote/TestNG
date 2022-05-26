package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test.Listeners1.class)

	public class TestCase1 {
	@Test
		public void GetGoogleTitle() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		
		}
	@Test(priority=1)
	public void CheckGoogleTitle()
	{
	
		
		System.out.println("Title is matched :");
		Assert.assertTrue(false);
	
	
	}
}

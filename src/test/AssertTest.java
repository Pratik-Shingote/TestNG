package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edubridgeindia.com/");
		
		String actual_tiitle=driver.getTitle();
		String expected_title="Job-Oriented Online Courses in India. Learn Anywhere, Anytime & at Anyplace";
		
		Assert.assertEquals(actual_tiitle, expected_title);
		
  }
}

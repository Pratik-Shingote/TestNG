package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNG4 {
  @Test//(timeOut=5000)
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.quit();
  }
  @AfterTest
  public void a()
  {  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();	
  }
}

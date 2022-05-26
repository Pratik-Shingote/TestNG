package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTesting {
	
	WebDriver driver;
	
  @Test
  @Parameters("browser")
  public void f(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\Selenium Learning\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver","D:\\Selenium Learning\\edgedriver\\msedgedriver.exe");
		  	driver=new EdgeDriver();
			
	  }
	  else
	  {
		  System.out.println("Try Again...!!!");
	  }
	  
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  driver.quit();
  }
}

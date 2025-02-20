package TestNG_Class_AutomateTestcase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GitHubDemo {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.get("https://www.github.com");
  }
  @BeforeTest
  public void beforeTest() {
	  
 driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
  }

}

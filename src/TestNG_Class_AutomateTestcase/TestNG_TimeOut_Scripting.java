package TestNG_Class_AutomateTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_TimeOut_Scripting {
	
	WebDriver driver;
  @Test(timeOut=2000)
  public void google() {
	  
	  driver.get("https://www.google.com/");
  }
  
  @Test
  public void Facebook() {
	  
	  driver.get("https://www.facebook.com/");
  }
  
  @Test
  public void Jpetstore() {
	  
	  driver.get("https://www.jpetstore.aspectran.com/");
  }
  
  
  @Test
  public void OEC() {
	  
	  driver.navigate().to("https://oeconnection.com/products/repairlink/");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  
	  driver.close();
  }

}

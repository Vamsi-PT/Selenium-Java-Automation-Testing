package TestNG_Class_AutomateTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Features_Scripting {
	
	WebDriver driver;
	
	
  @Test (priority=2,description="Oec Application Verification")
  public void OECLogin() throws InterruptedException {
	  
	  
	  driver.navigate().to("https://oeconnection.com/products/repairlink/");
	  
  }
  
  //@Ignore
  @Test (priority=0,description="launching jpet store")
  
  public void JpetStoreLaunch() throws InterruptedException {
	  
  driver.get("https://jpetstore.aspectran.com/");
	  	  
  }
  
@Test (priority=1,description="EnterCredentials jpet store",dependsOnMethods="JpetStoreLaunch")
  
  public void JpetStoreEnterCredentials() throws InterruptedException {
	  
       //driver.get("https://jpetstore.aspectran.com/");
	  
	  driver.findElement(By.xpath("//*[@href=\"/account/signonForm\"]")).click();
	  
	  driver.findElement(By.xpath("//*[@name=\"username\"]")).clear();
		
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("dvr123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).clear();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("DVR@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Signon\"]/form/div/div[1]/button")).click();
	  
	  
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

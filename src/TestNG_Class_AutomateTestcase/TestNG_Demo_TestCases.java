package TestNG_Class_AutomateTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Demo_TestCases {
	
	WebDriver driver;
  @Test
  public void JpetStore() throws InterruptedException {
	  
	 /* driver.get("https://jpetstore.aspectran.com/");
	  
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
		
		*/
	  
	  driver.navigate().to("https://mail.google.com/mail/u/0/?ogbl#inbox");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[1]/div/div")).click();
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  
	  Thread.sleep(3000);
	  driver .close();
  }

}

package TestNG_Class_AutomateTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TestNG_DropDown_Selection_Scripting {
	
	WebDriver driver;
  @Test
  public void Redmine() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  
	 driver.get("https://www.redmine.org/account/register");
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("techlearn.india@gmail.com");
	 
	 Thread.sleep(2000);
	 
	 Select lan = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	 
	//lan.selectByVisibleText("Bulgarian (Български)");
	 
	// lan.selectByValue("id");
	 
	 //lan.selectByIndex(8);
	 
	 lan.selectByContainsVisibleText("Alb");
	 
	
	 
	 
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

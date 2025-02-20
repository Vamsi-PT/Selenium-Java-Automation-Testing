package TestNG_Class_AutomateTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_PopUp_HandlingScripting {
	
	WebDriver driver;
  @Test
  public void PopUp() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Thread.sleep(3000);
		
		/*driver.switchTo().alert().sendKeys("VR");
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();*/
		
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("VR");
		a.accept();
			  
  }
@BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(4000);
	  
	  driver.close();
  }

}

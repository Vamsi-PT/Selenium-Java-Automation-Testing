package TestNG_Class_AutomateTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG_FileUpload_Scripting {
	
	WebDriver driver;
  @Test
  public void fileUpload() throws InterruptedException {
	  
	  driver.get("https://www.gangaaram-tech.com/");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@href=\"http://www.gangaaram-tech.com/registration/\"]")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"text-143958147242\"]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"text-143958147242\"]")).sendKeys("VDR");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"field-LipJA9NICnuV7YK-0\"]")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"text-25287439068\"]")).click();
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"text-25287439068\"]")).sendKeys("dvamsi15pt@gmail.com");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@data-ref-label=\"Phone1\"]")).click();
	  
	  
	  driver.findElement(By.xpath("//*[@data-ref-label=\"Phone1\"]")).sendKeys("8765430123");
	  
	  
	  Thread.sleep(3000);
	  
	  
	 // driver.findElement(By.xpath("//*[@id=\"textarea-23104650921\"]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"textarea-23104650921\"]")).sendKeys("DemoTest");
	  
	  
	  
	 Thread.sleep(3000);
	 
	 
	// driver.findElement(By.xpath("//*[@id=\"field-ioa3T81OSsEXwhP\"]")).sendKeys("E:\\Selenium Java Project Framework Folder Structure.docx");
	 
	 
	 driver.findElement(By.xpath("//*[@id=\"field-ioa3T81OSsEXwhP\"]")).sendKeys("E:\\Demo_Images\\KPI_Metric.png");
	 
	 
	 Thread.sleep(5000);
	 
	 
	 driver.findElement(By.xpath("//*[@id=\"button-21943165207\"]")).click();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}

package junit_class_automatetestcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo_LocatorTestCases {

	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		Thread.sleep(4000);
		
		driver.close();
	}

	@Test
	void test1() throws InterruptedException {
		
		
		/*
		driver.navigate().to("https://oecqa.repairlinkshop.com/Account/Login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("userName")).sendKeys("loadtestshop18");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("loadtestshop18");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button [@id='login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-val-length=\"VIN is invalid select Make / Year / Model\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-val-length=\"VIN is invalid select Make / Year / Model\"]")).sendKeys("1FMEU74886UA06077");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"submitPartsSearch\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class=\"form-control partsHeader__element partsHeader__inputSearch\"]")).sendKeys("brakes");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id=\"btnPartKeywordSearch\"]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"reqQty-G2MZ1V125ANA\"]")).clear();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"reqQty-G2MZ1V125ANA\"]")).sendKeys("10000");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"CatalogParts_oecDataTable\"]/tbody/tr[1]/td/div/div[2]/div[1]/div[2]/a/div")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"minicart-text\"]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"poNumber\"]")).sendKeys("98765");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"btnSubmitCart1\"]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@class=\"btn btn-blue btnYes\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
		
		*/
		
		driver.navigate().to("https://web.whatsapp.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[5]/span/div")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@aria-label=\"Type your phone number.\"]")).sendKeys("7989292542");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@class=\"x889kno x1a8lsjc xbbxn1n xxbr6pl x1n2onr6 x1rg5ohu xk50ysn x1f6kntn xyesn5m x1z11no5 xjy5m1g x1mnwbp6 x4pb5v6 x178xt8z xm81vs4 xso031l xy80clv x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x1v8p93f xogb00i x16stqrj x1ftr3km x1hl8ikr xfagghw x9dyr19 x9lcvmn xbtce8p x14v0smp xo8ufso xcjl5na x1k3x3db xuxw1ft xv52azi\"]")).click();
		
		Thread.sleep(180000);
		
		driver.findElement(By.xpath("//*[@class=\"selectable-text copyable-text x15bjb6t x1n2onr6\"]")).sendKeys("Deepthi");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[2]/div/div/div/div[2]")).click();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span/div/div[2]/div[1]/div[2]/div[1]/p")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span/div/div[2]/div[1]/div[2]/div[1]/p")).sendKeys("HelloSweetPellam");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@data-icon=\"send\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/header/header/div/span/div/div[2]/button/span")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@aria-label=\"Log out\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div[2]/div/button[2]")).click();
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
		
		
	/*	driver.navigate().to("https://jpetstore.aspectran.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name=\"username\"]")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("dvr123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).clear();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("DVR@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Signon\"]/form/div/div[1]/button")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();	
	*/
	}
	

}

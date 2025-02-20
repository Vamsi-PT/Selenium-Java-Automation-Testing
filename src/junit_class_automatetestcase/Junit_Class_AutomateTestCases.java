/**
 * 
 */
package junit_class_automatetestcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
class Junit_Class_AutomateTestCases {

	/**
	 * @throws java.lang.Exception
	 */
	
	
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
		
	

	

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		Thread.sleep(4000);
		
		driver.close();
	}

	@Test
	void LaunchGoogle() {
		
		driver.get("https://www.google.com/");
		
	}
	@Test
    void NavigateToJpetStore() {
	
	driver.navigate().to("https://jpetstore.aspectran.com/");
		
	}
	@Test    void RefreshJpetstore() throws InterruptedException {
		
		Thread.sleep(2000);
	driver.navigate().refresh();
	
}

	
	
	@Test
    void NaviagatetoForward() {
	
	driver.navigate().forward();
	
}


}

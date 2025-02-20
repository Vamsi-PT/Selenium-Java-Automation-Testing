package Java_Class_AutomateTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Class_AUtomateTestCases {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://jpetstore.aspectran.com/");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
		

	}

}

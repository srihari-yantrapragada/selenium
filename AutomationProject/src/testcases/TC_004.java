package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_004 {

	@Test
	public void testcase1() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("srihari");
		driver.findElement(By.id("pass")).sendKeys("srihari");
		driver.quit();

	}

}

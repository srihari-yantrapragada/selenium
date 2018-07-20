package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_004 {

	@Test
	public void testcase1() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://192.168.6.112:8080/iportman_uat3/");
		driver.findElement(By.name("j_username")).sendKeys("srihari");
		driver.findElement(By.name("j_password")).sendKeys("srihari");
		/*driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("srihari");
		driver.findElement(By.id("pass")).sendKeys("srihari");*/
		driver.quit();

	}

}

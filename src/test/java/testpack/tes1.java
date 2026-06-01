package testpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tes1 {

	@Test
	public void loginchk() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Application opened");
		driver.get("https://testautomationpractice.blogspot.com/");
		
      driver.findElement(By.id("name")).sendKeys("Nothing");
      driver.quit();
      System.out.println("Application closed");
	}
}

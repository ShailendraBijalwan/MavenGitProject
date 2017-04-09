package dealDetails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Entry {

	@Test
	public void testEntry(){
		//System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.iobnet.co.in/ibanking/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("loginId")).sendKeys("Shailu123");
		driver.findElement(By.id("password")).sendKeys("Sh1234");
		driver.findElement(By.xpath("//input[@class='button' and @value='Submit']")).click();
		
	}
	
}

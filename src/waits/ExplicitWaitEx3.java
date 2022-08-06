package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitEx3 
{

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
	        driver.get("https://demoqa.com/");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        driver.findElement(By.xpath(""));
	}

}

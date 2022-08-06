package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx1 {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	        
	        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone13"+Keys.ENTER);
	        
	        
	        
	}

}

package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
	        driver.get("https://www.amazon.com/");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        
	        searchbox.sendKeys("iphone"+Keys.ENTER);
	        driver.navigate().back();
	        searchbox.clear();
	}

}

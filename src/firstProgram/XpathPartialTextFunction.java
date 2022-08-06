package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPartialTextFunction {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
	        driver.get("https://www.amazon.com/");
	      //  driver.manage().window().maximize();
	        driver.manage().window().fullscreen();
	        driver.manage().deleteAllCookies();
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[text()='Done']")).click();

	        Thread.sleep(2000);
	      
	        driver.findElement(By.xpath("(//a[contains(text(),'Customer')])[1]")).click();
	        
	}

}

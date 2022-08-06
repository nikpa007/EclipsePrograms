package screenshotExample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws IOException 
	{
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://demoblaze.com/index.html#");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        // takescreenshot
        UtilClass.takeSS(driver, "demoblaze_homepages");
        driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
        
        UtilClass.takeSS(driver,"productPage1");
    //   driver.quit();
        
        
        
        
	}
	

}

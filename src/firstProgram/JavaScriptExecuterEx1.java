package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterEx1
{
	public static void main(String args[]) 
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
  
    //scrolling up about amazon
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,4600)");
    
    driver.findElement(By.xpath("//a[text()='About Amazon']")).click();
    
   // driver.findElement(By.xpath("//a[text()='Help']")).click();
    
	}
}
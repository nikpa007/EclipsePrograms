package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2
{
 public static void main(String args[])
 {
	 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
	    driver.manage().window().maximize();
	  // driver.manage().window().fullscreen();
	    driver.manage().deleteAllCookies();
	    
	  //frame
	    driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
	    //switch to frrame from main page
	    driver.switchTo().frame("classFrame");
	    driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
	    //switch to main page from frame
	    driver.switchTo().parentFrame();
	    
	    //main page switch to frame
	   
	    driver.switchTo().frame("packageListFrame");
	   
	    driver.findElement(By.xpath("(//a[text()='org.openqa.selenium.chrome'])[1]")).click();
	    
	    
 }
}

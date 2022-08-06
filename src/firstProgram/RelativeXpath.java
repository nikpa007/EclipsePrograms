package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
       // driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
      
      //search 
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("waches");
     //  click on search button
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
      
      
     
      
      
      
      
	}

}

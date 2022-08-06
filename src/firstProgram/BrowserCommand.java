package firstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand
{
 public static void main(String args[]) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
      driver.get("https://www.myntra.com/");
      
      Thread.sleep(3000);
      driver.manage().window().maximize();
      
      Thread.sleep(3000);
      driver.manage().window().fullscreen();
      
      Thread.sleep(3000);
      driver.manage().deleteAllCookies();
      
      Thread.sleep(3000);
      driver.manage().window().minimize();
      
   //  driver.quit();
      
      	driver.close();
      
      
      
 }
}

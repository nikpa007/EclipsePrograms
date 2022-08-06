package firstProgram;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	//driver.manage().window().maximize();
  //driver.get("https://vctcpune.com/selenium/practice.html");
  
  //Thread.sleep(1000);
 // driver.findElement(By.id("autocomplete")).sendKeys("Manisha");
  
  //Thread.sleep(1000);
  //WebElement ot = driver.findElement(By.id("opentab"));
  
//  ot.click();
  //Thread.sleep(1000);
  //WebElement en = driver.findElement(By.name("enter-name"));
  //en.sendKeys("Veera");
	
	
  // search button
	
//	driver.get("https://www.amazon.com/");
	//  driver.manage().window().maximize();
      //WebElement searchbtn=driver.findElement(By.name("field-keywords"));
  //Thread.sleep(3000);
   //searchbtn.sendKeys("kurties");
   //Thread.sleep(3000);
    //driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	
			//relative xpath
	driver.findElement(By.xpath("//input[4][@id='search_query_top']")).sendKeys("ladies t shirt");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	
	


			
}
}
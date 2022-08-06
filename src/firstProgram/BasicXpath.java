package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/forms");
        driver.manage().window().maximize();
      // driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        
        //about us
       // Thread.sleep(2000);
     //   driver.findElement(By.xpath("//img[@class='banner-image']")).click();
     //   driver.findElement(By.xpath("(//div[@class='card-up'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
	   //first name 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Manisha");
        //last name
        	Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Patil");
        
        //emailid
    	Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("abc@123");
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9865321456");
    
 //   Thread.sleep(2000);
   // driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__control')]")).sendKeys("Software Testing");
    
        
      
      
       
      

	}

}

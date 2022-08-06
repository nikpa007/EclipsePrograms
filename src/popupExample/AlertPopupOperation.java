package popupExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupOperation {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //click me-1
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(2000);
        //switch from mainpage to popup
        driver.switchTo().alert().accept();
        
        //conformation alert popup
        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
       
        //switch from main page to popup
        driver.switchTo().alert().dismiss();
        
        //prompt popup
       
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(2000);
       
        //switch from main page to popup
        driver.switchTo().alert().sendKeys("manisha");
    
        driver.switchTo().alert().accept();
        
        
        
        
	}

}

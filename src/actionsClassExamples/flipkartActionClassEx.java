package actionsClassExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartActionClassEx {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]")).click();
        
        driver.navigate().refresh();
        //women
        WebElement Women = driver.findElement(By.xpath("//span[text()='Women']"));
        Actions act=new Actions(driver);
        act.moveToElement(Women).build().perform();
      
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//a[@title='Sarees'])[1]")).click();
         
     
	}

}

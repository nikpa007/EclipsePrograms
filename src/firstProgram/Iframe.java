package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe
{
  public static void main(String args[]) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
       driver.get("file:///C://Users//INTEL//Desktop//HTML PROGRAM/iframe.html");
      
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      
      //frist name
      driver.findElement(By.xpath("//input[@id='abc']")).sendKeys("Manisha");
      //switch from main page to frame
    // driver.switchTo().frame(0);
       driver.switchTo().frame("asd");
    //Mobile No.
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='xyz']")).sendKeys("9865321456");
     // switch from main page to frame
      
       driver.switchTo().parentFrame();
       
       //last name
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='ghi']")).sendKeys("Patil");
       
       //switch from main page to frame
       // WebElement frameElemnt = driver.findElement(By.id("sdf"));
        driver.switchTo().frame("asd");
        
        //college
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='hju']")).sendKeys("Garvagre College");
      
        driver.switchTo().parentFrame(); 
        //switch frame to main page
        //email Id
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='jkl']")).sendKeys("manisha@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("mani123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='hij'])")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//option[text()='Pune']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        Thread.sleep(5000);
        //driver.close();
  }
}

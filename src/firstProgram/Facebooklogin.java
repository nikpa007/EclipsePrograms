package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
      // driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Manava");
        
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Patil");
        
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("manava@123");
        
       Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("abc123456");
        
        Thread.sleep(2000);
      WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
        Select sd= new Select(day);
        sd.selectByValue("21");
        
        Thread.sleep(2000);
      WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
             Select sm= new Select(month);
             sm.selectByValue("12");
           
             Thread.sleep(2000);
       WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        Select sy= new Select(year);
        sy.selectByVisibleText("2021");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        
        
        
}
}
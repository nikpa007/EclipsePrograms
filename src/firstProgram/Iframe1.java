package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1
{
	private static Object value;

	public static void main(String agrs[])
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.rediff.com/");
    driver.manage().window().maximize();
  // driver.manage().window().fullscreen();
    driver.manage().deleteAllCookies();
    
    //switch the focus of main page to frame
    
     WebElement frame_web = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
     driver.switchTo().frame(frame_web);
     WebElement bse_value = driver.findElement(By.xpath("//span[text()='BSE']"));
     String value=bse_value.getText();
     System.out.println(value);
            
     driver.switchTo().parentFrame();
     driver.findElement(By.xpath("//a[text()='SPORTS']")).click();
            
            
	}
}
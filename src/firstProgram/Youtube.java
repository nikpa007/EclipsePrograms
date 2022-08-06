package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.youtube.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
      // driver.manage().window().fullscreen();
      //  driver.manage().deleteAllCookies();
        
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("teri metti");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='ad-text:6']")).click();
        
        Thread.sleep(10000);
        driver.close();
	}

}

package actionsClassExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOperation {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //developer
        WebElement element = driver.findElement(By.xpath("//span[@class='nav_item_name']"));
        
        Actions act=new Actions(driver);
        act.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//span[@class='nav_item_name']")).click();
 
	}

}

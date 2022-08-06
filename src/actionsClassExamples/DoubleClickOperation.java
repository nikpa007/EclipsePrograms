package actionsClassExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://api.jquery.com/dblclick/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //switch main page to frame
        driver.switchTo().frame(0);
        WebElement box_ele = driver.findElement(By.xpath("/html/body[1]/div[1]"));
        //actions class
        Actions act =new Actions(driver);
        act.doubleClick(box_ele).build().perform();
        
        
       // driver.findElement(By.xpath("//span[text()='Double click the block']"));
        
       

	}

}

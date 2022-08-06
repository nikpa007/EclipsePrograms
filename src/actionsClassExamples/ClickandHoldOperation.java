package actionsClassExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHoldOperation {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //switch main page to frame
        
        driver.switchTo().frame(0);
        
        WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']"));
      
        //drag and drop
        WebElement element2 = driver.findElement(By.xpath("//div[@id='droppable']"));
        
        Actions act=new Actions(driver);
       
        // act.clickAndHold(element1).moveToElement(element2).release().build().perform();
        
        act.dragAndDrop(element1, element2).build().perform();
        
	}

}

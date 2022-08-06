package actionsClassExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperation {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
	        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	       
	        WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
	        Actions act=new Actions(driver);
	        act.contextClick(element).build().perform();
	        
	        driver.findElement(By.xpath("//span[text()='Copy']")).click();

	}

}

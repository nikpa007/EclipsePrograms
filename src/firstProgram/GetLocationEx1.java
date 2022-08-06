package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationEx1 
{
   public static void main(String args[]) {
	   
   
   System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.myntra.com/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    //contact us particular size of webelement
    WebElement contactUs = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
   
    Point pc=contactUs.getLocation();
    System.out.println(pc);
    
    int x=pc.getX();
    System.out.println(x);
    
    int y=pc.getY();
    System.out.println(y);
}
}
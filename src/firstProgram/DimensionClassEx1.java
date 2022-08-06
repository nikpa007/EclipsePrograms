package firstProgram;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClassEx1 
{
	public static void main(String aggs[]) 
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.com/");
    
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    Dimension c1=driver.manage().window().getSize();
    System.out.println(c1);
    
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    Dimension c2 =driver.manage().window().getSize();
    System.out.println(c2);
    
    Dimension d =new Dimension(400,400);
    driver.manage().window().setSize(d);
}
}
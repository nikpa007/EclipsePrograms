package firstProgram;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointClassEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    Point p1=driver.manage().window().getPosition();
	    System.out.println(p1);
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    Point p=new Point(600,300);
	    driver.manage().window().setPosition(p);
	    
	}

}

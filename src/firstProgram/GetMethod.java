package firstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
                 driver.get("https://www.youtube.com/");
                 
                 String title= driver.getTitle();
                 System.out.println(title);
                 
                String CurrentUrl= driver.getCurrentUrl();
                System.out.println(CurrentUrl);
                 
                String code= driver.getPageSource();
                System.out.println(code);
                
                 
                 
	}
}
package firstProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    //  driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        
       WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
       
       Select s= new Select(drop);
       //using indexing
      // s.selectByIndex(4);
       //using valuse
     // s.selectByValue("search-alias=beauty-intl-ship");
       //using visible Text
   s.selectByVisibleText("Beauty & Personal Care");
       
     // count of option
     List <WebElement> all_options=s.getOptions();
     int count =all_options.size();
     System.out.println(count);
     
     for(int i=0;i<count;i++)
     {
     String	data=all_options.get(i).getText();
     System.out.println(data);
    	
     }
     
      
}
}
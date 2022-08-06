package windowsOperationExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
      
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        //search
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("ladies watches"+Keys.ENTER);
        
        driver.navigate().refresh();
    
        
        driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]")).click();
      
        //parent id
         String parent_id = driver.getWindowHandle();
         System.out.println(parent_id);
         
         //child ids
         Set<String> child_id = driver.getWindowHandles();
         System.out.println(child_id);
         
         for(String a:child_id)
         {
        	 System.out.println(a);
        	 if(parent_id.equals(a))
        	 {
        		 
        	 }
        	 else
        	 {
        		 driver.switchTo().window(a);
        		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        		 System.out.println("product added to card");
                 Thread.sleep(4000);
                 driver.close();
         }
         }
         driver.switchTo().window(parent_id);
         System.out.println(driver.getTitle());
         driver.close();
      	}
	    

}

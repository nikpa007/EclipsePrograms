package windowsOperationExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingMintra
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.myntra.com/shop/women?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Brand_Search_Misspells&gclid=Cj0KCQjwkruVBhCHARIsACVIiOwNcNoaVI9DjF4vBAwei570CSjt8khSa7zsKyjGA7wFE4TSC3h5TKkaAnqrEALw_wcB");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        
        //search
        driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("women handbag"+Keys.ENTER);
        
        driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
        
        //parent id
        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        
        //child id
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
        		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
        		System.out.println("product add to bag");
        		
        		Thread.sleep(6000);
        		driver.close();
        	}
        }
        
        driver.switchTo().window(parent_id);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    
        
        //men
        WebElement element = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
        
        Actions act=new Actions(driver);
        act.moveToElement(element).build().perform();
        
        //formal shrits
        driver.findElement(By.xpath("//a[text()='Formal Shirts']")).click();
        
        //shrit
        driver.findElement(By.xpath("(//h3[text()='English Navy'])[1]")).click();
        
        
        //parent id
        String parent_id1 = driver.getWindowHandle();
        System.out.println(parent_id1);
        
        //child id
       Set<String> child_id1 = driver.getWindowHandles();
       System.out.println(child_id1);
        
       for(String b:child_id1)
       {
    	   System.out.println(b);
    	   if(parent_id1.equals(b))
    	   {
    		   
    	   }
       else
       {
    	   driver.switchTo().window(b);
    	   //size 40
    	   driver.findElement(By.xpath("//p[text()='40']")).click();
    	   driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
    	   System.out.println("product added to card");
           Thread.sleep(6000);
           driver.close();
       }
       }
        
       driver.switchTo().window(parent_id);
       System.out.println(driver.getTitle());
       driver.close();
       } 
}

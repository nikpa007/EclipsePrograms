package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
      //absulute xpath
    	//contact us
    
    	Thread.sleep(2000);
   driver.findElement(By.xpath("html/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/a")).click();
   
    	
    //sign in
   Thread.sleep(2000);
driver.findElement(By.xpath("html/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a")).click();
    		

	}

}

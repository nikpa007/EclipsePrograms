package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatersAboveBelowTorightToleft {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=589460569891&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9062097%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIoJT3zJSW-AIVSg8rCh0YkQPnEAAYASAAEgIbJvD_BwE");
        driver.manage().window().maximize();
    //  driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        
        WebElement FN=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
        		FN.sendKeys("Manisha");
        		Thread.sleep(2000);
        WebElement LN=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(FN));
                LN.sendKeys("Patil");
                
       WebElement email=driver.findElement(RelativeLocator.with(By.tagName("input")).below(FN));
                   email.sendKeys("abc@123"); 	
       WebElement password=driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
                   password.sendKeys("manava123"); 		
	}  

}

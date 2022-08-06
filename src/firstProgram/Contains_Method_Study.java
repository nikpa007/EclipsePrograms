package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_Method_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=589460569891&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9062097%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIoJT3zJSW-AIVSg8rCh0YkQPnEAAYASAAEgIbJvD_BwE");
      //  driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        
        //firstname
        
        driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]")).sendKeys("Manisha");
        
        //last name
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[contains(@id,'u_0_l')])")).sendKeys("Patil");
        

	}

}

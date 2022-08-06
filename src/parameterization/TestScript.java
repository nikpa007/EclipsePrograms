package parameterization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import excelHandling.Util;

public class TestScript 
{
 public static void main(String[] args) throws IOException
 {
   System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
   ChromeDriver driver=new ChromeDriver();
   driver.get("E:\\Selenium\\selenium-java-4.1.4");
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   
   Util ut=new Util();
   String username = ut.getDataFromExcel("Sheet1", 1, 0);
   String password = ut.getDataFromExcel("Sheet", 1, 1);
   //username
   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
   //password
   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
   //login button
   driver.findElement(By.xpath("//button[@name='login']")).click();
   
   
   
 }
}

package screenshotExample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass 
{
 

    public static void takeSS(WebDriver driver1,String filename) throws IOException
 {
    
	 TakesScreenshot ts =(TakesScreenshot)driver1;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 String path="C:\\Screenshot\\";
	 File des=new File(path+filename+"xyzdemoblaze.png");
	 FileHandler.copy(src, des);
     
	 System.out.println("Screen Taken sucessfully");
 }
}

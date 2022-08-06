package firstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlProgram {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjws8yUBhA1EiwAi_tpEYRK2T0PypiyXq6M8D3UJnQDsnNxngjw7YESrspeNcOua6WlyxBBIhoCKWAQAvD_BwE");

	}

}

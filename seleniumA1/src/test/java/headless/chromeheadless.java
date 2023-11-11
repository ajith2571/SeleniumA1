package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeheadless {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		
	 driver.get("https://www.google.com/");
	 
	String pagetitle= driver.getTitle();
	System.out.println(pagetitle);
		
		
	}

}

package excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessbrowser {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		
		
		options.setHeadless(true);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		String titleactual=driver.getTitle();
		System.out.println(titleactual);
		
		String actual="Shop Online for Mobiles";
		
		if(titleactual.contains(actual)) {
			System.out.println("Testpassed");
		}
		else {
		System.out.println("Test failed");
		
		}
		

	}

}

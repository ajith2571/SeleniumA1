package navigationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class randomnavigations {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
	 driver.get("https://milonic.com/");
		 System.out.println(driver.getTitle());
	 
	 driver.navigate().to("https://www.facebook.com/login/");
	 System.out.println(driver.getTitle());

	 //driver.getTitle();

	 driver.navigate().back();
	 System.out.println(driver.getTitle());

	 //driver.getTitle();
	 

	 driver.navigate().forward();
	 System.out.println(driver.getTitle());

	 //driver.getTitle();

	 
	 driver.close();
	 
	}

}

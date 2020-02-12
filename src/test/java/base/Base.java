package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

public static WebDriver driver;
	
	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lap\\eclipse-workspace\\Amazon_Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		return driver;
		
}
}
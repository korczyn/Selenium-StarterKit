package library.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	

	public WebDriver getDriver(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:9000/#/main/welcome");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}
	
}

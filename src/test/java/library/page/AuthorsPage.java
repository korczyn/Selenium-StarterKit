package library.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import library.cssvars.AuthorsCSSSelectors;

public class AuthorsPage {

	WebDriver driver;
	HomePage homePage = new HomePage();
	
	
	public void openAuthorsPage() {
		driver = homePage.getDriver();
		driver.findElement(By.linkText("Authors")).click();
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public int tableSize(){
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> list = table.findElements(By.cssSelector("tr.ng-scope"));
		return list.size();
	}
	
	public WebElement getFindAuthorsButton(){
		return driver.findElement(By.cssSelector(AuthorsCSSSelectors.authorsFindAuthorsButton));
	}
	
	public void quit(){
		driver.quit();
	}
}

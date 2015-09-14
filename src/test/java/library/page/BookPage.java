package library.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import library.cssvars.BookCSSSelectors;

public class BookPage {

	WebDriver driver;
	HomePage homePage = new HomePage();

	public void openBookPage() {
		driver = homePage.getDriver();
		driver.findElement(By.linkText("Book List")).click();
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

	public WebElement getFindBookButton() {
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookFindBookButton));
	}
	
	public WebElement getAddBookButton(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookAddBookButton));
	}
	
	public WebElement getModalSaveButton(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookModalSaveButton));
	}
	
	public WebElement getModalAddAuthorButton(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookModalAddAuthorButton));
	}
	
	public WebElement getModalAuthorFirstNameField(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookModalAuthorFirstNameField));
	}
	
	public WebElement getModalAuthorLastNameField(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookModalAuthorLastNameField));
	}

	public WebElement getModalBookTitleField(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookModalBookTitleField));
	}
	
	public WebElement getChangeTitleButton(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookChangeTitleButton));
	}
	
	public WebElement getDeleteBookButton(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.bookDeleteBookButton));
	}
	
	public WebElement getChangeModalTitleField(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.changeModalTitleField));
	}
	
	public WebElement getChangeModalOKButton(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.changeModalOKButton));
	}
	
	public WebElement getFirstBookTitle(){
		return driver.findElement(By.cssSelector(BookCSSSelectors.firstBookTitle));
	}
	
	public void refresh(){
		driver.navigate().refresh();
	}
	
	public void quit() {
		driver.quit();
	}

}

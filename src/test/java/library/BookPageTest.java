package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import library.page.BookPage;

/**
 * Unit test for simple App.
 */
public class BookPageTest {

	BookPage bookPage = new BookPage();
	
	@Before
	public void setUp(){
		bookPage.openBookPage();
	}
	@Ignore
	@After
	public void tearDown(){
		bookPage.quit();
	}
	
	@Test
	public void testShouldOpenTableOfBooks() {
		bookPage.getFindBookButton().click();
		
		assertTrue(bookPage.isElementPresent(By.tagName("table")));
		assertTrue(bookPage.tableSize() > 0);
	}

	@Test
	public void testShouldNotAddBookWithNothing() {
		bookPage.getAddBookButton().click();
		
		assertFalse(bookPage.getModalSaveButton().isEnabled());
	}
	
	@Test
	public void testShouldNotAddBookWithoutAuthros() {
		bookPage.getAddBookButton().click();
		bookPage.getModalBookTitleField().sendKeys("title");
		
		assertFalse(bookPage.getModalSaveButton().isEnabled());
	}

	@Test
	public void testShouldNotAddBookWithoutTitle(){
		bookPage.getAddBookButton().click();
		bookPage.getModalAuthorFirstNameField().sendKeys("firstName");
		bookPage.getModalAuthorLastNameField().sendKeys("lastName");
		bookPage.getModalAddAuthorButton();
		
		assertFalse(bookPage.getModalSaveButton().isEnabled());
	}

	@Test
	public void testShouldAddBokkIfAuthorDataAndBookTitleArePresent(){
		int sizeBefore = bookPage.tableSize();
		bookPage.getAddBookButton().click();
		bookPage.getModalBookTitleField().sendKeys("title");
		bookPage.getModalAuthorFirstNameField().sendKeys("firstName");
		bookPage.getModalAuthorLastNameField().sendKeys("lastName");
		bookPage.getModalAddAuthorButton().click();
		bookPage.getModalSaveButton().click();
		
		assertEquals(bookPage.tableSize(), sizeBefore + 1);
	}

	@Test
	public void testShouldNotChangeBookTitleIfNewTitleIsEmpty(){
		bookPage.getFindBookButton().click();
		bookPage.getChangeTitleButton().click();
		
		assertFalse(bookPage.getChangeModalOKButton().isEnabled());
	}

	@Test
	public void testShouldBePossiobleToChangeBookTitle(){
		bookPage.getFindBookButton().click();
		bookPage.getChangeTitleButton().click();
		bookPage.getChangeModalTitleField().sendKeys("title");
		
		assertTrue(bookPage.getChangeModalOKButton().isEnabled());
	}
	
	@Test
	public void testShouldChangeBookTitle(){
		String newTitle = Long.toHexString(Double.doubleToLongBits(Math.random()));
		bookPage.getFindBookButton().click();
		bookPage.getChangeTitleButton().click();
		bookPage.getChangeModalTitleField().sendKeys(newTitle);
		bookPage.getChangeModalOKButton().click();
		
		assertEquals(newTitle, bookPage.getFirstBookTitle().getText());
	}
	
	@Test
	public void testShouldDeleteBook(){
		bookPage.getFindBookButton().click();
		int sizeBefore = bookPage.tableSize();
		bookPage.getDeleteBookButton().click();
		bookPage.refresh();
		bookPage.getFindBookButton().click();
		int sizeAfter = bookPage.tableSize();
		assertEquals(sizeBefore - 1, sizeAfter);
	}
}

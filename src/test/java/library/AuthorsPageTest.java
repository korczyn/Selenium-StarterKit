package library;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import library.page.AuthorsPage;

public class AuthorsPageTest {

	AuthorsPage authorsPage = new AuthorsPage();
	
	@Before
	public void setUp(){
		authorsPage.openAuthorsPage();
	}
	
	@After
	public void tearDown(){
		authorsPage.quit();
	}
	
	@Test
	public void testShouldDisplayTable(){
		authorsPage.getFindAuthorsButton().click();
		assertTrue(authorsPage.isElementPresent(By.tagName("table")));
		assertTrue(authorsPage.tableSize() > 0);
	}
	
}

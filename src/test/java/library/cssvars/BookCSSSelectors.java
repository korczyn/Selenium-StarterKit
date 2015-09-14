package library.cssvars;

public class BookCSSSelectors {

	public static String bookFindBookButton = ".searchButton";
	public static String bookAddBookButton = "section.ng-scope > button:nth-child(5)";
	
	public static String bookModalSaveButton = ".modal-footer > button:nth-child(1)";
	public static String bookModalAddAuthorButton = ".modal-body > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(3) > button:nth-child(1)";
	public static String bookModalBookTitleField = ".modal-body > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)";
	public static String bookModalAuthorFirstNameField = ".modal-body > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)";
	public static String bookModalAuthorLastNameField = ".modal-body > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(2) > input:nth-child(1)";
	
	public static String bookChangeTitleButton = "tr.ng-scope:nth-child(2) > td:nth-child(5) > button:nth-child(1)";
	public static String bookDeleteBookButton = "tr.ng-scope:nth-child(2) > td:nth-child(4) > button:nth-child(1)";
	
	public static String changeModalTitleField = "input.ng-pristine:nth-child(2)";
	public static String changeModalOKButton = ".btn-primary";
	public static String firstBookTitle = "tr.ng-scope:nth-child(2) > td:nth-child(2)";
	
}

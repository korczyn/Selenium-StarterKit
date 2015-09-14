package library.cssvars;

public class BookCSSSelectors {

	public static final String bookFindBookButton = ".searchButton";
	public static final String bookAddBookButton = "section.ng-scope > button:nth-child(5)";
	
	public static final String bookModalSaveButton = ".modal-footer > button:nth-child(1)";
	public static final String bookModalAddAuthorButton = ".modal-body > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(3) > button:nth-child(1)";
	public static final String bookModalBookTitleField = ".modal-body > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)";
	public static final String bookModalAuthorFirstNameField = ".modal-body > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)";
	public static final String bookModalAuthorLastNameField = ".modal-body > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(2) > input:nth-child(1)";
	
	public static final String bookChangeTitleButton = "tr.ng-scope:nth-child(2) > td:nth-child(5) > button:nth-child(1)";
	public static final String bookDeleteBookButton = "tr.ng-scope:nth-child(2) > td:nth-child(4) > button:nth-child(1)";
	
	public static final String changeModalTitleField = "input.ng-pristine:nth-child(2)";
	public static final String changeModalOKButton = ".btn-primary";
	public static final String firstBookTitle = "tr.ng-scope:nth-child(2) > td:nth-child(2)";
	
}

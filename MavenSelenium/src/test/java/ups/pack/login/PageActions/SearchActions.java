package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

import ups.pack.login.pageElements.SearchElements;

public class SearchActions {

	SearchElements searchAct;
	
	public SearchActions(WebDriver driver) {
		this.searchAct = searchAct;
	}
	
	public void srcTextBox() {
		searchAct.searchTextBox().sendKeys("shipping");
	}
	
	public void srchIcon() {
		searchAct.searchIcon().click();
	}
	
	public String serchText() {
		String sText = searchAct.searchText().getText();
		return sText;
	}
	
}

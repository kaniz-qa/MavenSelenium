package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

import ups.pack.login.pageElements.QuickAccessElements;

public class QuickAccessAction {

	QuickAccessElements qckAccsEle;
	
	public QuickAccessAction(WebDriver driver) {
		this.qckAccsEle=qckAccsEle;
	}
	
	public void qckAccss() {
		qckAccsEle.qckAcc().click();
		
	}
	
	/*public void trakTxt() {
		
		 * String txt = qckAccs.trackText().getText(); return txt;		
	}	
	 */
	/*
	 * public void qckImage() { qckAccs.qckImg().getText();
	 * 
	 * }
	 */
	
}

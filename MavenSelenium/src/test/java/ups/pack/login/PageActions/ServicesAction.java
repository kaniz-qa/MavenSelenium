package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

import ups.pack.login.pageElements.ServiceElements;

public class ServicesAction {
	ServiceElements servEle ;

	public ServicesAction(WebDriver driver) {
		this.servEle = new ServiceElements(driver);
	}
	
	public void servLink() {
		servEle.service().click();
	}
	public void seeAllLink() {
		servEle.seeAll().click();
	}
	public String txtPage() {
	String txt= servEle.servText().getText();
		return txt;
	}
}

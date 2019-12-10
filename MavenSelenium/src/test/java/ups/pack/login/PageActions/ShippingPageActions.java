package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

import ups.pack.login.pageElements.ShippingPageElements;



public class ShippingPageActions {

	ShippingPageElements shippingPageElement;

	public ShippingPageActions(WebDriver driver) {
		this.shippingPageElement = new ShippingPageElements(driver);
	}
	/*
	public void shippingLink() {
		shippingPageElement.shipping().click();
	}
	
	public void createShippingLink() {
		shippingPageElement.createShipment().click();
	}
	*/
	public void countryTeritory() {
		shippingPageElement.countryTeritory().selectByVisibleText("Spain");
	}
	
	public void orgName() {
		shippingPageElement.orgName().sendKeys("Talen Tech");
	}
	
	public void contName() {
		shippingPageElement.contactName().sendKeys("Simon");
	}
	
	public void addSt() {
		shippingPageElement.addStreet().sendKeys("74 st");
	}
	
	public void addApt() {
		shippingPageElement.addApt().sendKeys("2nd fl");
	}
	
	public void addDpt() {
		shippingPageElement.addDpt().sendKeys("SQA");
	}
	
	public void zip() {
		shippingPageElement.zipCode().sendKeys("11372");
	}
	
	public void city() {
		shippingPageElement.city().sendKeys("New York");
	}
	
	/*
	 * public void state() {
	 * shippingPageElement.state().selectByVisibleText("New York"); }
	 */
	
	public void residentialAdd() {
		shippingPageElement.resAdd().click();
	}
	
	
	public void email() {
		shippingPageElement.email().sendKeys("talentech@gmail.com");
	}
	
	public void phone() {
		shippingPageElement.phone().sendKeys("9294023045");
	}
	
	public void extn() {
		shippingPageElement.extension().sendKeys("123");
	}
	
	public void chkbox() {
		shippingPageElement.chkbox().click();
	}
	
	public void toggleBtn() {
		shippingPageElement.toggleBtn().click();
	}
	
	public void cancelShipment() {
		shippingPageElement.cancelShipment().click();
	}
	
	public void yesBtn() {
		shippingPageElement.yesBtn().click();
	}
	
}

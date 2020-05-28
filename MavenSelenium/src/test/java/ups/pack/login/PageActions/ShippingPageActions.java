package ups.pack.login.PageActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	public void countryTeritory(String country) {
		shippingPageElement.countryTeritory().selectByVisibleText(country);
	}
	
	public void orgName(String companyName) {
		shippingPageElement.orgName().sendKeys(companyName);
	}
	
	public void contName(String contactName) {
		shippingPageElement.contactName().sendKeys(contactName);
	}
	
	public void addSt(String strAddress) {
		shippingPageElement.addStreet().sendKeys(strAddress);
	}
	
	public void addApt(String aptAddress) {
		shippingPageElement.addApt().sendKeys(aptAddress);
	}
	
	public void addDpt(String dptAddress) {
		shippingPageElement.addDpt().sendKeys(dptAddress);
	}
	
	public void zip(String zipCode) {
		shippingPageElement.zipCode().sendKeys(zipCode);
	}
	
	public void city(String city) {
		shippingPageElement.city().sendKeys(city);
	}
	
	public void otherAddress(String otherAdd) {
		shippingPageElement.otherAdd().sendKeys(otherAdd);
	}
	
	
	/*
	 * public void state() {
	 * shippingPageElement.state().selectByVisibleText("New York"); }
	 */
	
	public void residentialAdd() {
		//shippingPageElement.resAdd().click();
		//shippingPageElement.resAdd().equals("true");
		//shippingPageElement.resAdd().getAttribute(resAddress).equals("true");
	}
	
	
	public void email(String email) {
		shippingPageElement.email().sendKeys(email);
	}
	
	public void phone(String phone) {
		shippingPageElement.phone().sendKeys(phone);
	}
	
	public void extn(String extn) {
		shippingPageElement.extension().sendKeys(extn);
	}
	
	
	public void shippingForm() throws IOException {
		File file = shippingPageElement.shippingForm().getScreenshotAs(OutputType.FILE);
		File destFile = new File("form.png");
		FileUtils.copyFile(file, destFile);
	
	}
	
	
	public void chkbox() {
		
	shippingPageElement.chkbox().click();
		
			
		//shippingPageElement.chkbox().getAttribute(chk).equals("true");
	}
	
	public void toggleBtn() {
		shippingPageElement.toggleBtn().click() ;
	//shippingPageElement.toggleBtn().getAttribute(tgltn).equals("false");
	}
	
	public void cancelShipment() {
		shippingPageElement.cancelShipment().click();
		//shippingPageElement.cancelShipment().getAttribute(cancelShip).equals("true");
	}
	
	public void yesBtn() {
		shippingPageElement.yesBtn().click();
		//shippingPageElement.yesBtn().getAttribute(yesBtn).equals("true");
	}
	
}

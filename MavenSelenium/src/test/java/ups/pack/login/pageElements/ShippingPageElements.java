package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingPageElements {

	WebDriver driver;

	public ShippingPageElements(WebDriver driver) {
		this.driver = driver;
	}
	/*
	public WebElement shipping() {
		WebElement shipping = driver.findElement(By.xpath("//*[@id=\"ups-menuLinks1\"]"));
		return shipping;
	}
	
	public WebElement createShipment() {
		WebElement createShipment = driver.findElement(By.xpath("//*[@id=\"ups-menuPanel1\"]/div[1]/div[1]/ul/li[1]/a"));
		return createShipment;
	}
	*/
	public Select countryTeritory() {
		Select counTeri = new Select(driver.findElement(By.name("countryDropdown")));
		//counTeri.selectByVisibleText("United States");
		return counTeri;
	}
	
	public WebElement orgName() {
		WebElement orgname = driver.findElement(By.name("organization"));
		return orgname;
	}
	
	public WebElement contactName() {
		WebElement contactName = driver.findElement(By.xpath("//*[@id=\"origincontactName\"]"));
		return contactName;
	}
	
	public WebElement addStreet() {
		WebElement addStreet = driver.findElement(By.xpath("//*[@id=\"originaddress1\"]"));
		return addStreet;
	}
	
	public WebElement addApt() {
		WebElement addApt = driver.findElement(By.xpath("//*[@id=\"originaddress2\"]"));
		return addApt;
	}
	
	public WebElement addDpt() {
		WebElement addDpt = driver.findElement(By.xpath("//*[@id=\"originaddress3\"]"));
		return addDpt;
	}
	
	public WebElement zipCode() {
		WebElement zipCode = driver.findElement(By.xpath("//*[@id=\"originpostal\"]"));
		return zipCode;
	}
	
	public WebElement city() {
		WebElement city = driver.findElement(By.xpath("//*[@id=\"origincity\"]"));
		return city;
	}
	
	public WebElement resAdd() {
		WebElement resedentialAdd = driver.findElement(By.xpath("//*[@id=\"originisResidentialLabel\"]/span/span[3]"));
		return resedentialAdd;
	}
	
	
	/*
	 * public Select state() { Select state = new
	 * Select(driver.findElement(By.name("stateDropdown")));
	 * //state.selectByVisibleText("New York"); return state; }
	 */
	
	public WebElement email() {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"originemail\"]"));
		return email;
	}
	
	public WebElement phone() {
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"originphone\"]"));
		return phone;
	}
	
	public WebElement extension() {
		WebElement extension = driver.findElement(By.xpath("//*[@id=\"originextension\"]"));
		return extension;
	}
	
	public WebElement chkbox() {
		WebElement chkbox = driver.findElement(By.className("ups-checkbox-custom-label"));
		return chkbox;
	}
	
	
	
	public WebElement toggleBtn() {
		WebElement toggleBtn = driver.findElement(By.xpath("//*[@id=\"returnAddressForm_label\"]/common-switch/label/span/span[3]"));
		return toggleBtn;
	}
	
	
	
	/*
	 * public WebElement toggleBtn() { WebElement toggleBtn =
	 * driver.findElement(By.className("ups-lever_switch_bg")); return toggleBtn; }
	 */
	
	public WebElement cancelShipment() {
		WebElement cancelShipment = driver.findElement(By.xpath("//*[@id=\"nbsBackForwardNavigationCancelShipmentButton\"]"));
		return cancelShipment;
	}
	
	public WebElement yesBtn() {
		WebElement yesBtn = driver.findElement(By.xpath("//*[@id=\"nbsCancelShipmentWarningYes\"]"));
		return yesBtn;
	}
	
}

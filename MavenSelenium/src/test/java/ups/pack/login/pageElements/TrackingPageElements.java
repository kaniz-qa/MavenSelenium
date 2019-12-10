package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrackingPageElements {

	WebDriver driver;

	public TrackingPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement trackingNumber() {
		WebElement trackingNumber = driver.findElement(By.id("stApp_trackingNumber"));
		return trackingNumber;
	}

	public WebElement trackingSubmitBtn() {
		WebElement trackingSubmitBtn = driver.findElement(By.id("stApp_btnTrack"));
		return trackingSubmitBtn;
	}

	public WebElement trackingErrorMsg() {
		WebElement trackingErrorMsg = driver.findElement(By.id("stApp_statusErrorText"));
		return trackingErrorMsg;
	}
}

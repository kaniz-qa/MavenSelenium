package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

import ups.pack.login.pageElements.TrackingPageElements;

public class TrackingPageActions {

	TrackingPageElements trackingPage;

	public TrackingPageActions(WebDriver driver) {
		trackingPage = new TrackingPageElements(driver);
	}

	public void inputTrackingNumber(String track) {
		trackingPage.trackingNumber().sendKeys(track);
	}

	public void trackingSubmit() {
		trackingPage.trackingSubmitBtn().click();
	}

	public String getTrackingErrorMsg() {
		String errorMsg = trackingPage.trackingErrorMsg().getText();
		return errorMsg;

	}

}

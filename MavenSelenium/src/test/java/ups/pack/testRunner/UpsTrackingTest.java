package ups.pack.testRunner;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.TrackingPageActions;
import utility.ReadExcelData;

public class UpsTrackingTest extends BaseDriverClass {

	WebDriver driver = getFirefoxDriver();
	TrackingPageActions trackingAction = new TrackingPageActions(driver);

	@BeforeClass(alwaysRun = true)
	public void beforeTestClass() {
		driver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "testdata")
	public void trackingTest(String track) {
		
		trackingAction.clearTrack();
		trackingAction.inputTrackingNumber(track);
		trackingAction.trackingSubmit();
		String actualErrorMsg = trackingAction.getTrackingErrorMsg();

		if (actualErrorMsg.contains("not valid")) {
			System.out.println("PASSED!");
		} else {
			System.out.println("FAILED");
			fail();
		}

	}
	
	@DataProvider(name = "testdata")
	public Object[][] getExcelData() throws IOException {

		return ReadExcelData.readExcel("trackNum.xlsx", "track");

	}
	
	@AfterClass
	public void afterTestClass(){
		System.out.println(">> Closing Driver");
		driver.close();
	}

}

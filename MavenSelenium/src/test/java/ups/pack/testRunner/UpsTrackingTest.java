package ups.pack.testRunner;

import static org.testng.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.TrackingPageActions;

public class UpsTrackingTest extends BaseDriverClass {

	WebDriver driver = getFirefoxDriver();
	TrackingPageActions trackingAction = new TrackingPageActions(driver);

	@BeforeTest
	public void beforeTestMethod() {
		driver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void trackingTest() {
		trackingAction.inputTrackingNumber("123123kjashgdkuasdahs");
		trackingAction.trackingSubmit();
		String actualErrorMsg = trackingAction.getTrackingErrorMsg();

		if (actualErrorMsg.contains("not valid")) {
			System.out.println("PASSED!");
		} else {
			System.out.println("FAILED");
			fail();
		}

	}
	
	@AfterTest
	public void afterTestMethod(){
		System.out.println(">> Closing Driver");
		driver.close();
	}

}

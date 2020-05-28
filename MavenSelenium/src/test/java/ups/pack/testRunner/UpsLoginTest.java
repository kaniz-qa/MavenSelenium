package ups.pack.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.LoginPageActions;
import ups.pack.login.PageActions.QuickAccessAction;

public class UpsLoginTest extends BaseDriverClass {
	WebDriver driver = getChromeDriver();
	
 
	LoginPageActions loginAction = new LoginPageActions(driver);
	QuickAccessAction qckAction = new QuickAccessAction(driver);

	@BeforeTest
	public void beforeTest() {
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("two test execution start");
	}

	@Test
	public void loginTest() {
		loginAction.inputUserId();
		loginAction.inputPassword();
		loginAction.submit();

		String msg = loginAction.readErrorText();
		System.out.println();
		System.out.println(msg);

		if (msg.contains("The information that you have entered does not match any ups.com profile.")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			fail();
		}

	}

	@Test
	public void quickAccessTest() {
		qckAction.qckAccss();
		// qckAction.qckImage();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("two test execution end");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

package ups.pack.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.LoginPageActions;

public class UpsLoginTest extends BaseDriverClass {
	WebDriver driver = getChromeDriver();
	LoginPageActions loginAction = new LoginPageActions(driver);

	@BeforeTest
	public void beforeMethod() {
		driver.get(
				"https://www.ups.com/lasso/login?loc=en_US&returnto=https%3A%2F%2Fwww.ups.com%2Fus%2Fen%2FHome.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

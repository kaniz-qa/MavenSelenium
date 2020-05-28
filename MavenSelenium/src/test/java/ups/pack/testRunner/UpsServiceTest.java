package ups.pack.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.ServicesAction;

public class UpsServiceTest extends BaseDriverClass{

	WebDriver driver = getChromeDriver();
	ServicesAction servAct = new ServicesAction(driver);
	
	@BeforeTest
	public void beforeMethod() {
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void serviceTest() {
		servAct.servLink();
		servAct.seeAllLink();
		String text = servAct.txtPage();
		System.out.println(text);
		
		if(text.equalsIgnoreCase("Services")) {
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
			fail();
			
		}
	}
	
	@AfterTest
	
	public void afterTest() {
		driver.close();
	}
	
}

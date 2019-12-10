package ups.pack.testRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.ShippingPageActions;


public class UpsShippingTest extends BaseDriverClass{

	WebDriver driver = getChromeDriver();	
	ShippingPageActions shipAction = new ShippingPageActions(driver);

	//WebDriver driver = getFirefoxDriver();
	//ShippingPageActions shipAction = new ShippingPageActions(driver);
	
	@BeforeTest
	public void beforeMethod() {
		driver.get(
				"https://www.ups.com/ship/guided/origin?tx=5614715613706317&loc=en_US ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	

	@Test
	public void shippingTest() {
		//shipAction.shippingLink();
		//shipAction.createShippingLink();
		shipAction.countryTeritory();
		shipAction.orgName();
		shipAction.contName();
		shipAction.addSt();
		shipAction.addApt();
		shipAction.addDpt();
		shipAction.zip();
		shipAction.city();
		shipAction.residentialAdd();
		//shipAction.state();
		shipAction.email();
		shipAction.phone();
		shipAction.extn();
		shipAction.chkbox();
		shipAction.toggleBtn();
		shipAction.cancelShipment();
		shipAction.yesBtn();

		WebElement submitMsg = driver.findElement(By.xpath("//*[@id=\"ups-main\"]/div[8]/app/ng-component/div/div/div/div/ng-component/section/h2"));
		String msg = submitMsg.getText();
		System.out.println();
		System.out.println(msg);

		if (msg.contains("Hello. Where are you shipping from?")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		
		
		
	}

	

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}

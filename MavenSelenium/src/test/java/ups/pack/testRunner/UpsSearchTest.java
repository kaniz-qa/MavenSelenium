package ups.pack.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.SearchActions;

public class UpsSearchTest extends BaseDriverClass {

	WebDriver driver = getChromeDriver();
	
	SearchActions srcAct = new SearchActions(driver);
	
	@BeforeTest
	public void beforeTest() {
		
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void search() {
		srcAct.srcTextBox();
		srcAct.srchIcon();
		String text = srcAct.serchText();
		System.out.println(text);
		
		/*
		 * if(text.equalsIgnoreCase("Search")) { System.out.println("test pass"); }else
		 * { System.out.println("failed"); fail(); }
		 */
		
	}
	
	/*
	 * @AfterTest public void afterTest() { driver.close(); }
	 */
	
}

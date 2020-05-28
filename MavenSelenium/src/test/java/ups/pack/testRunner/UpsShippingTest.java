package ups.pack.testRunner;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.ShippingPageActions;
import utility.ReadExcelData;



public class UpsShippingTest extends BaseDriverClass{
	
	
	
	  WebDriver driver = getChromeDriver(); 
	  ShippingPageActions shipAction = new  ShippingPageActions(driver);

	  
	  //WebDriver driver = getFirefoxDriver(); 
	  //ShippingPageActions shipAction = new ShippingPageActions(driver);
	  
	  @BeforeClass(alwaysRun = true)
	  public void beforeClass() {
	  //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  driver.get(
	  "https://www.ups.com/ship/guided/origin?tx=5614715613706317&loc=en_US ");
	  
	  driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  }
	 
	  
 
	  
	  @Test(dataProvider = "testdata")
	public void shippingTest(String country,String companyName,String contactName,String strAddress,
			String aptAddress,String dptAddress,String zipCode,String city,String otherAdd,String email,
			String phone,String extn) throws InterruptedException, IOException{
		
		
		shipAction.countryTeritory(country);
		shipAction.orgName(companyName);
		shipAction.contName(contactName);
		shipAction.addSt(strAddress);
		
		shipAction.addApt(aptAddress);
		shipAction.addDpt(dptAddress);
		shipAction.zip(zipCode);
		shipAction.city(city);
		
		shipAction.otherAddress(otherAdd);
		
		shipAction.residentialAdd();
		//shipAction.state();
		shipAction.email(email);
		shipAction.phone(phone);
		shipAction.extn(extn);
		
		shipAction.shippingForm();
		
		
		
		shipAction.chkbox();
		
		//shipAction.toggleBtn();
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

	  @DataProvider(name = "testdata") 
	  
	  public Object[][] getExcelData() throws IOException {
		 
		  return ReadExcelData.readExcel("ShippingForm.xlsx", "shippingForm1");
		  
		  }
	  @AfterClass
	  public void afterTestClass() { 
		  driver.close();
		  }
}

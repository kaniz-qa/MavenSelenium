package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServiceElements {
	

	 WebDriver driver;

	public ServiceElements(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement service()	{
		WebElement serv = driver.findElement(By.xpath("//*[@id=\"ups-menuLinks2\"]"));
		return serv;
	}	
	public WebElement seeAll()	{
		WebElement seeAll = driver.findElement(By.linkText("See All"));
		return seeAll;
	}
	public WebElement servText()	{
		WebElement servText = driver.findElement(By.xpath("//*[@id=\"iw_comp1478104141956\"]/div/div/div/div[1]/h1/span"));
		return servText;
	}
	
}

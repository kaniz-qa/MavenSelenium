package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchElements {

	WebDriver driver;
	public SearchElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement searchTextBox() {
		WebElement searchTextBox = driver.findElement(By.xpath("//*[@id=\"ups-mainNav-search\"]"));
		return searchTextBox;
	}
	
	public WebElement searchIcon() {
		WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"ups-mainNav_search_submit\"]/i"));
		return searchIcon;
	}
	
	public WebElement searchText() {
		WebElement searchText = driver.findElement(By.xpath("//*[@id=\"iw_comp1477044548137\"]/section/div[2]/div/h2"));
		return searchText;
	}
	
	
}

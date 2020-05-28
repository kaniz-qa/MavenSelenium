package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuickAccessElements {

	WebDriver driver;

	public QuickAccessElements(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement qckAcc() {
		WebElement qckAcc = driver.findElement(By.xpath("//*[@id=\"ups-quickStartMenu\"]"));
		return qckAcc;
	}

	/*
	 * public WebElement toolList() { WebElement toolList=
	 * driver.findElement(By.className("ups-headerTools_list")); return toolList; }
	 */

	/*
	 * public WebElement qckImg() { WebElement qckImg=
	 * driver.findElement(By.xpath("//*[@id=\"video-container-large\"]/div/img"));
	 * return qckImg; }
	 */
}

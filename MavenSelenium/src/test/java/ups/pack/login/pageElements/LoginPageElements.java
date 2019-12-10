package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {

	WebDriver driver;

	public LoginPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement userID() {
		WebElement userID = driver.findElement(By.name("userID"));
		return userID;
	}

	public WebElement password() {
		WebElement password = driver.findElement(By.name("password"));
		return password;
	}

	public WebElement submitButton() {
		WebElement submitButton = driver.findElement(By.id("submitBtn"));
		return submitButton;
	}

	public WebElement errorText() {
		WebElement errorMsg = driver.findElement(By.id("errorMessages"));
		return errorMsg;

	}
}

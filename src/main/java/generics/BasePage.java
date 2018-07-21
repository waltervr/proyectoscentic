package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public void typeOnElement(WebElement element, String text) {
		element.sendKeys(text);
	}

	public String getTextFromElement(WebElement element) {
		return element.getText();
	}
}

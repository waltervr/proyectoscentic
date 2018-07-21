package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver= driver;
		wait = new WebDriverWait(driver, 10);
	}
	
	//todos los metodos deben devolver algo
	//OnClick
	public boolean clickOnElement(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			return true;
		}catch(Exception e){
			return false;
		}	
	}
	
	
	//sendkeys
	public void typeOnElement(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public String getTextFromElement(WebElement element) {
		return element.getText();
	}

	
	
	
}//FIN CLASS


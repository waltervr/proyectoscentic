package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class LoginAdminPage extends BasePage {

	@FindBy(xpath = "//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement txtPass;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;

	public LoginAdminPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public StartAdminPage goToStartPage2(String email, String password) {
		typeOnElement(txtEmail, email);
		typeOnElement(txtPass, password);
		clickOnElement(btnLogin);
		return new StartAdminPage(driver);
	}

}

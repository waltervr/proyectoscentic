package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement txtTitleError;

	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement txtTitleLogin;

	@FindBy(xpath = "//div[@class='panel-body']//div[1]//input[1]")
	private WebElement txtEmail;

	@FindBy(xpath = "//div[@class='panel-body']//div[2]//input[1]")
	private WebElement txtPass;

	@FindBy(xpath = "//button[@class='btn btn-action btn-lg btn-block loginbtn']")
	private WebElement btnLogin;

	@FindBy(xpath = "//h3[@class='RTL']")
	private WebElement appBienvenida;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public String getTitleMensaje() {
		return getTextFromElement(txtTitleError);
	}

	public String getTitleLogin() {
		return getTextFromElement(txtTitleLogin);
	}

	public void goToStartPage(String email, String password) {
		typeOnElement(txtEmail, email);
		typeOnElement(txtPass, password);
		clickOnElement(btnLogin);
		// return new StartPage(driver);
	}

	public StartPage goToStartPage2(String email, String password) {
		typeOnElement(txtEmail, email);
		typeOnElement(txtPass, password);
		clickOnElement(btnLogin);
		return new StartPage(driver);
	}

	public String getTitleText() {
		return getTextFromElement(appBienvenida);
	}

}

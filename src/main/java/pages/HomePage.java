package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public LoginPage goToLogin() {
		clickOnElement(btnDropdown);
		clickOnElement(btnLogin);
		return new LoginPage(driver);
	}

	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//li[@id='li_myaccount']//a[@class='dropdown-toggle go-text-right']")
	private WebElement btnDropdown;

	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]")
	private WebElement btnLogin;

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class StartPage extends BasePage {

	public StartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[@class='RTL']")
	private WebElement appBienvenida;

	@FindBy(xpath = "//a[@href='#profile']")
	private WebElement btnOptionProfile;

	@FindBy(xpath = "//a[@href='#bookings']")
	private WebElement btnOptionBookings;

	@FindBy(xpath = "//div[@class='form-horizontal']//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement txtPhone;

	@FindBy(xpath = "//button[@class='btn btn-action btn-block updateprofile']")
	private WebElement btnSubmit;

	public void ModificarPerfil(String phone) {
		clickOnElement(btnOptionProfile);
		typeOnElement(txtPhone, phone);
		clickOnElement(btnSubmit);
		clickOnElement(btnOptionBookings);
		clickOnElement(btnOptionProfile);
	}

	public String getTitleText() {
		return getTextFromElement(appBienvenida);
	}

	public String getTextPhone() {
		return getTextFromElement(txtPhone);

	}
}

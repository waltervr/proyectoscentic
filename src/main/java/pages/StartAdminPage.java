package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class StartAdminPage extends BasePage {

	public StartAdminPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='#Hotels']")
	private WebElement btnHotels;

	@FindBy(xpath = "//a[@href='https://www.phptravels.net/admin/hotels']")
	private WebElement optionHotels;

	@FindBy(xpath = "//tr[@class='xcrud-th']//th[1]")
	private WebElement btnSelect;

	@FindBy(xpath = "//a[contains(@class,'delete_button btn btn-danger btn-xs')]")
	private WebElement btnDelete;

	@FindBy(xpath = "//td[@colspan='11']")
	private WebElement tltTable;

	public void DeleteHotels() {
		clickOnElement(btnHotels);
		clickOnElement(optionHotels);
		clickOnElement(btnSelect);
		clickOnElement(btnDelete);
	}

	public String getTitleText() {
		return getTextFromElement(tltTable);
	}

}

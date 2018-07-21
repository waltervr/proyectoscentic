package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class FrontendPage extends BasePage {

	
	@FindBy(css = "body > nav > div > div.navbar-header > a > img")
	private WebElement titulo_PHPTRAVESL;
	
	//@FindBy(css = "#body-section > div.container.mt35.promotions.hidden-xs > a:nth-child(3) > div > div > img")
	//private WebElement opcion_WorldCup;
	
	@FindBy(css = "#body-section > div.container.mt35.promotions.hidden-xs > a:nth-child(3) > div > div > img")
	private WebElement opcion_WorldCup;
	
	public FrontendPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WorldCup_Page goToWorldCup_Page() {
		clickOnElement(opcion_WorldCup);
		return new WorldCup_Page(driver);
	}
}


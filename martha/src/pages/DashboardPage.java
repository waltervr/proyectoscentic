package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class DashboardPage extends BasePage {
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[1]")
	private WebElement titulo_BOOKING_SUMMARY;

	@FindBy(css = "#social-sidebar-menu > li.active > a")
	private WebElement opcionFrontend;
	
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public FrontendPage vamosAlFrontend() {
		clickOnElement(opcionFrontend);
		return new FrontendPage(driver);
	}

}

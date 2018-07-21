package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class WorldCup_Page extends BasePage {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div/div/div[1]/div/div/div/h3")
	private WebElement titulo_PeaceTrainALongTimeComing;            
	
	
	public WorldCup_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}

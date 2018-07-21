package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class LoginPage extends BasePage {

	
	@FindBy(name  = "form-signin")
	private WebElement formularioInicioSesion;
	
	@FindBy(name  = "email")
	private WebElement correo;
	
	@FindBy(name  = "password")
	private WebElement pass;
	
	@FindBy(css = "button.btn[type='submit']")
	private WebElement botonInicioSesion;
	

	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	
	public DashboardPage vamosAlHome() {
		//invocar al metodo p q haga click
		clickOnElement(correo);
		typeOnElement(correo, "admin@phptravels.com");
		clickOnElement(pass);
		typeOnElement(pass, "demoadmin");
		clickOnElement(botonInicioSesion);
		return new DashboardPage(driver);
	}
}//FIN CLASS

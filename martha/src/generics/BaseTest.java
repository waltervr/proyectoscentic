package generics;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest { // ES EL PAPA DE TODO

	protected WebDriver driver;
	private String url = "http://www.phptravels.net/admin";
	protected Logger log = Logger.getLogger(getClass());// pra q cada vez q entre a una clase obtenga el nombre de esa
	// clase
	private String gridIP = "http://www.phptravels.net/admin";
	private DesiredCapabilities capability = null;

	@BeforeMethod
	public void precondiciones() throws MalformedURLException {

		String mode = "local";
		String browser = "chrome";

		
		if (mode.equalsIgnoreCase("local")) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) 
				driver = new FirefoxDriver();
		} else {
			if (browser.equalsIgnoreCase("chrome"))
				capability = DesiredCapabilities.chrome();
			else if (browser.equalsIgnoreCase("firefox"))
				capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL(gridIP), capability);
		}
			
		driver.manage().window().maximize();
		driver.get(url);
		DOMConfigurator.configure("log4j.xml");
		
			
	}// fin_metodo

	

	
	@AfterMethod
	public void salir() {
		driver.quit();
	}// fin_metodo

}// FIN_CLASS
/* COMENTARIOS
1. No deben haber comentarios en las clases.
2. Hay muchos espacios. Se debió formatear correctamente.
*/

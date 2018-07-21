package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;
	private String url = "https://www.phptravels.net/";

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Programas\\Curso de automatización\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	@AfterMethod
	public void salir() {
		driver.quit();
	}

}

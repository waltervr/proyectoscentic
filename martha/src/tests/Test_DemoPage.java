package tests;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.DashboardPage;
import pages.FrontendPage;
import pages.LoginPage;
import pages.WorldCup_Page;


public class Test_DemoPage extends BaseTest {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private FrontendPage frontendPage;
	private WorldCup_Page worldCupPage;
	

	
	
	@Test
	public void verificarClick() {
		loginPage = new LoginPage(driver);
		dashboardPage = loginPage.vamosAlHome();
		
		frontendPage = dashboardPage.vamosAlFrontend();
		frontendPage = new FrontendPage(driver);
		
		worldCupPage = frontendPage.goToWorldCup_Page();
		worldCupPage = new WorldCup_Page(driver);
		}

}//FIN

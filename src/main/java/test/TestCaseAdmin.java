package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import generics.BaseTestAdmin;
import pages.LoginAdminPage;
import pages.StartAdminPage;

public class TestCaseAdmin extends BaseTestAdmin {

	private LoginAdminPage loginAdminPage;
	private StartAdminPage startAdminPage;

	@Test
	public void verificarIngresoValido() {
		String email = "admin@phptravels.com";
		String password = "demoadmin";
		String textoEsperado = "Entries not found.";
		String textoOptenido = "";

		loginAdminPage = new LoginAdminPage(driver);
		startAdminPage = loginAdminPage.goToStartPage2(email, password);
		startAdminPage.DeleteHotels();
		driver.switchTo().alert().accept();
		textoOptenido = startAdminPage.getTitleText();
		Assert.assertEquals(textoEsperado, textoOptenido);
	}
}

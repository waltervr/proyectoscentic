package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import generics.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.StartPage;

public class TestCasesUser extends BaseTest {

	private HomePage homePage;
	private LoginPage loginPage;
	private StartPage startPage;

	@Test
	public void verificarIngresoInvalido() {
		String email = "error";
		String password = "error";
		// String textoEsperado = "Invalid Email or Password";
		String textoEsperado = "LOGIN";
		String textoOptenido = "";

		homePage = new HomePage(driver);
		loginPage = homePage.goToLogin();
		loginPage.goToStartPage(email, password);

		textoOptenido = loginPage.getTitleLogin();
		Assert.assertEquals(textoEsperado, textoOptenido);
	}

	@Test
	public void verificarIngresoValido() {
		String email = "user@phptravels.com";
		String password = "demouser";
		String textoEsperado = "Hi, Johny Smith";
		String textoOptenido = "";

		homePage = new HomePage(driver);
		loginPage = homePage.goToLogin();
		loginPage.goToStartPage2(email, password);

		textoOptenido = loginPage.getTitleText();
		Assert.assertEquals(textoEsperado, textoOptenido);
	}

	@Test
	public void verificarModificacion() {
		String email = "user@phptravels.com";
		String password = "demouser";
		String telefono = "86667679";
		String telefonoOptenido = "";

		homePage = new HomePage(driver);
		loginPage = homePage.goToLogin();
		startPage = loginPage.goToStartPage2(email, password);
		startPage.ModificarPerfil(telefono);

		telefonoOptenido = startPage.getTextPhone();
		Assert.assertEquals(telefono, telefonoOptenido);
	}

}
/* COMENTARIOS
1. No deberían haber comentarios en la clase, si no lo necesitas se puede borrar.
*/

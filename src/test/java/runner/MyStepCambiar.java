package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.UpdateModal;
import session.Session;

import java.util.Map;

public class MyStepCambiar {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection= new MenuSection();

    UpdateModal updateModal= new UpdateModal();
    @Given("la paginacambiarweb {string} este abierta")
    public void laPaginacambiarwebEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("yo quiero iniciar el login y cambiar Clave")
    public void yoQuieroIniciarElLoginYCambiarClave(Map<String,String> credential)
    {
        //INICIAR SESSION
        mainPage.loginButton.click();
        loginModal.emailTextBox.writeText(credential.get("email"));
        loginModal.passwordTextBox.writeText(credential.get("password"));
        loginModal.loginButton.click();

        // CAMBIAR DE CLAVE
        updateModal.settingButton.click();
        updateModal.claveActualTextBox.writeText(credential.get("password"));
        updateModal.claveNuevaTextBox.writeText(credential.get("newpassword"));
        updateModal.okButton.click();
        updateModal.cerrarButton.click();

        //VOLVER A INICIAR SESSION
        mainPage.loginButton.click();
        loginModal.emailTextBox.writeText(credential.get("email"));
        loginModal.passwordTextBox.writeText(credential.get("newpassword"));
        loginModal.loginButton.click();
    }

    @Then("yo deberia acceder a la app web y cambiar de clave")
    public void yoDeberiaAccederALaAppWebYCambiarDeClave()
    {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }
}

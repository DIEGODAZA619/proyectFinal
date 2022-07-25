package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.CrearModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

import java.util.Map;

public class MyStepCrear {

    MainPage mainPage = new MainPage();
    MenuSection menuSection = new MenuSection();
    CrearModal crearModal = new CrearModal();
    @Given("la paginaweb {string} este abierta")
    public void laPaginawebEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("yo quiero iniciar el login")
    public void yoQuieroIniciarElLogin(Map<String,String> credential) {

        mainPage.crearButton.click();
        crearModal.nombreTextBox.writeText(credential.get("nombre"));
        crearModal.emailTextBox.writeText(credential.get("email"));
        crearModal.passwordTextBox.writeText(credential.get("password"));
        crearModal.confirmarButton.click();
        crearModal.guardarButton.click();
    }

    @Then("yo deberia acceder a la app web")
    public void yoDeberiaAccederALaAppWeb() {
        Assertions.assertTrue(
                menuSection.logoutButton.isControlDisplayed(),
                "ERROR, login failed"
        );
    }
}

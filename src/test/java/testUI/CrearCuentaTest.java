package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.CrearModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

public class CrearCuentaTest {
    MainPage mainPage = new MainPage();
    MenuSection menuSection = new MenuSection();
    CrearModal crearModal = new CrearModal();

    @BeforeEach
    public void goWebApp()
    {
        Session.getInstance().getBrowser().get("http://todo.ly");
    }

    @AfterEach
    public void closeWebApp()
    {
        Session.getInstance().closeSession();
    }

    @Test
    public void verificarCrearCrearCuenta()
    {
        mainPage.crearButton.click();
        crearModal.nombreTextBox.writeText("PRUEBAS");
        crearModal.emailTextBox.writeText("alvarod2@gmail.com");
        crearModal.passwordTextBox.writeText("123456");
        crearModal.confirmarButton.click();
        crearModal.guardarButton.click();
        Assertions.assertTrue(
                menuSection.logoutButton.isControlDisplayed(),
                "ERROR, login failed"
        );
    }
}

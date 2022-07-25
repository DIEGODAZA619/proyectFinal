package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

public class LoginTest
{
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();

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
    public void verificarLoginExitoso()
    {
        mainPage.loginButton.click();
        loginModal.emailTextBox.writeText("alvarod745@gmail.com");
        loginModal.passwordTextBox.writeText("a1b2c3");
        loginModal.loginButton.click();
        Assertions.assertTrue(
                menuSection.logoutButton.isControlDisplayed(),
                "ERROR, login failed"
        );
    }
}

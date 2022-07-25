package session;

import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session
{
    private static Session session = null;
    private WebDriver browser;

    // have a private constructor
    private Session()
    {
        browser = FactoryBrowser.make("chrome").create();
    }

    // have a public static method that controls/returns the instance¿
    public static Session getInstance()
    {
        if (session == null)
            session = new Session();
        return session;
    }

    public void closeSession()
    {
        browser.quit();
        session = null;
    }

    public WebDriver getBrowser()
    {
        return browser;
    }
}

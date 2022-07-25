package basicSelenium;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicSelenium {

    //inicializando el drive de google
    ChromeDriver driver;

    @BeforeEach
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //pagina a testear
        driver.get("http://todo.ly/");
    }

    @AfterEach
    public void closeBrowser() throws InterruptedException {

        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void testSomeThing() {

        /*driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("maestria@maestria.com");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("a1b2c3");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Assertions.assertTrue(
                driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed(),
                "ERROR, el usuario no pudo iniciar session"
        );*/
    }
}

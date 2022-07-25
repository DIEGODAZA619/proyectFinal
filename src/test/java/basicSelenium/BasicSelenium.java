package basicSelenium;
/*AUTHOR: ALVARO DIEGO DAZA ALCARAZ*/


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
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //pagina a testear
        driver.get("http://todo.ly/");
    }

    @AfterEach
    public void closeBrowser() throws InterruptedException
    {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void verificarLoginExitoso()
    {
        /*driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("alvarod745@gmail.com");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("a1b2c3");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();*/
        String correo = "alvaro1@gmail.com";
        driver.findElement(By.xpath("//img[@src='/Images/design/pagesignup.png']")).click();
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName")).sendKeys("PRUEBAS OFICIALES");
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail")).sendKeys(correo);
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword")).sendKeys("a1b2c3");
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms")).click();
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_ButtonSignup")).click();


        Assertions.assertTrue(
                driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed(),
                "ERROR, al crear cuenta"
        );
    }
}

package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class CrearModal {


    public TextBox nombreTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button confirmarButton = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button guardarButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}

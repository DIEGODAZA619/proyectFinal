package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class UpdateModal {

    public Button settingButton = new Button(By.xpath("//a[text()='Settings']"));

    public TextBox claveActualTextBox = new TextBox(By.id("TextPwOld"));
    public TextBox claveNuevaTextBox = new TextBox(By.id("TextPwNew"));
    public Button okButton = new Button(By.xpath("//span[text()='Ok']"));
    public Button cerrarButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));



}

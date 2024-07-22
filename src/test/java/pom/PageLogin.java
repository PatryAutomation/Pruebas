package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin extends BasePage{

    private static final By txtUsername = By.name("username");
    private static final By txtPassword = By.name("password");
    private static final By btnLogin = By.cssSelector("button.oxd-button");
    public PageLogin(WebDriver driver){
        super(driver);
    }
    public static void login(String username, String password) throws Exception {
        sendKeys(txtUsername, username);
        sendKeys(txtPassword, password);
        click(btnLogin);
    }

}

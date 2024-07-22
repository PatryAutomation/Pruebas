package seleniumGlueCode;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.PageAdmin;
import pom.PageIndex;
import pom.PageLogin;

public class TestBase {

    protected ChromeDriver driver = Hooks.getDriver();
    protected PageAdmin pageAdmin =new PageAdmin(driver);
    protected PageIndex pageIndex= new PageIndex(driver);
    protected PageLogin pagelogin = new PageLogin(driver);
}

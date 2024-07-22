package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageIndex extends BasePage{
    private static final By btnAdmin = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    public PageIndex(WebDriver driver){
        super(driver);
    }
    public static void irAdminPage() throws Exception{
        click(btnAdmin);
    }
}

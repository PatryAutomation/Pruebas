package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAdmin extends BasePage{

    private By btnAdd = By.xpath("//div[@class='orangehrm-header-container']//child::button");
    private By cmbUserRole = By.xpath("//label[contains(text(),'User Role')]/following::div[1]");
    private By selectRole = By.xpath("(//div[@role='listbox']//child::div)[2]");
    public static By employee = By.xpath("//p[@class='oxd-userdropdown-name']");
    private By txtEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    private By selectEmployee = By.xpath("(//div[@role='listbox']//child::div)[1]");
    private By cmbStatus = By.xpath("//label[contains(text(),'Status')]/following::i");
    private By selectStatus = By.xpath("(//div[@role='listbox']//child::div)[2]");
    private By txtUsernameEmployee =By.xpath("//label[contains(text(),'Username')]/following::input[1]");
    private By txtPasswordEmployee =By.xpath("(//input[@type='password'])[1]");
    private By txtConfirmacion =By.xpath("(//input[@type='password'])[2]");
    private By btnSave = By.xpath("//button[@type='submit']");
    private String tituloSuccess = "Success\n" +
            "Successfully Saved\n" +
            "×";
    private By txtSuccess = By.id("oxd-toaster_1");

    public static By getEmployee() {
        return employee;
    }
    public PageAdmin(WebDriver driver){
        super(driver);
    }

    public void addNewUser(String employeeName, String username, String password) throws Exception {
        click(btnAdd);
        click(cmbUserRole);
        click(selectRole);

        sendKeys(txtEmployeeName, employeeName + " ");
        Thread.sleep(2000);
        waitForElement(selectEmployee, 10).click();

        click(cmbStatus);
        click(selectStatus);

        sendKeys(txtUsernameEmployee, username);
        sendKeys(txtPasswordEmployee, password);
        sendKeys(txtConfirmacion, password);

        click(btnSave);
    }

    public boolean userAddOk() throws Exception {
        WebElement successMessage = waitForElement(txtSuccess, 10);
        return isDisplayed(txtSuccess) && getText(txtSuccess).contains("Successfully Saved");
    }
}

package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public static void click(By element) throws Exception{
        try{
            driver.findElement(element).click();
        }catch(Exception e){
            throw new Exception("No se pudo clickear el elemento: "+element);
        }
    }

    public boolean isDisplayed(By element) throws Exception{
        try{
            return driver.findElement(element).isDisplayed();
        }catch(Exception e){
            throw new Exception("No se pudo encontrar el elemento: "+element);
        }
    }

    public String getText(By element) throws Exception{
        try{
            return driver.findElement(element).getText();
        }catch(Exception e){
            throw new Exception("No se pudo obtener el elemento: "+element);
        }
    }
    public static void sendKeys(By element, String text) throws Exception {
        try {
            driver.findElement(element).sendKeys(text);
        } catch (Exception e) {
            throw new Exception("No se pudo enviar texto al elemento: " + element);
        }
    }

    public WebElement waitForElement(By element, int timeout) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(ExpectedConditions.presenceOfElementLocated(element));
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el elemento: " + element);
        }
    }
}

package seleniumGlueCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pom.PageIndex;
import pom.PageLogin;
import utils.creaNombreUsuario;

public class Test extends TestBase {

    @Given("que el usuario se loguea e ingresa en Admin")
    public void queElUsuarioSeLogueaEIngresaEnAdmin() throws Throwable {

        PageLogin.login("Admin","admin123");
        PageIndex.irAdminPage();
    }

    @When("el usuario intenta registrar un nuevo usuario")
    public void elUsuarioIntentaRegistrarUnNuevoUsuario() throws Throwable {

        WebElement employee = driver.findElement(pageAdmin.getEmployee());
        String employeeName = employee.getText();
        String username = creaNombreUsuario.NombreUsuario();
        String password = "admin123";

        pageAdmin.addNewUser(employeeName, username, password);
    }

    @Then("verificar que se visualiza el mensaje exitoso")
    public void verificarQueSeVisualizaElMensajeExitoso() throws Throwable {
        Thread.sleep(3000);

        Assert.assertTrue("No se visualiza el mensaje Success", pageAdmin.userAddOk());
    }
}

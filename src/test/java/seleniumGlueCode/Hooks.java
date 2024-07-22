package seleniumGlueCode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private static ChromeDriver driver;

    @Before
    public void setUp() throws IOException {
        Properties properties =new Properties();
        properties.load(new FileReader("./src/test/java/resources/config.properties"));
        System.setProperty("webdriver.chrome.driver","./src/test/java/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url_base"));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        if (driver != null) {
            driver.quit();
            System.out.println("Driver quit.");
        }
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}

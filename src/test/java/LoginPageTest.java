import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import resources.Base;
import resources.ConfigFileReader;

import java.io.IOException;

public class LoginPageTest extends Base {
    public WebDriver driver;
    ConfigFileReader configFileReader;

    @BeforeClass
    public void initialize() throws IOException {
        driver=initializeDriver();
        configFileReader = new ConfigFileReader();
    }

    @Test
    public void login() throws IOException {
        LoginPage loginPage=new LoginPage(driver);
        String username=configFileReader.getValue("username");
        String password=configFileReader.getValue("password");
        String url=ConfigFileReader.getInstance().getConfigFileReader().getValue("url");
        loginPage.loginToApplication(url,username,password);
    }
    @AfterClass
    public void tearDown() throws IOException {
        driver.close();
    }
}

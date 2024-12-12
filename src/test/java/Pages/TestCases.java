package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class TestCases extends BaseTest {

    @Test(priority = 0)
    public void LoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginFunction("superadmin@sslwireless.com", "12345678");
    }

    @Test(priority = 1)
    public void customerMenu() throws InterruptedException, AWTException {
        CustomerMenuPage customerMenuPage = new CustomerMenuPage(driver);
        customerMenuPage.customerVehicle();
    }
}

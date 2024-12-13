package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class TestCases extends BaseTest {

    @Test(priority = 1)
    public void LoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginFunction("superadmin@sslwireless.com", "12345678");
    }

    @Test(priority = 2)
    public void customerMenu() throws InterruptedException, AWTException {
        CustomerMenuPage customerMenuPage = new CustomerMenuPage(driver);
        customerMenuPage.customerVehicle();
    }

    @Test(priority = 3)
    public void serviceMenu() throws InterruptedException, AWTException {
        ServiceCenterMenu serviceCenterMenu = new ServiceCenterMenu(driver);

        serviceCenterMenu.setServiceMenu();
    }

    @Test(priority = 4)
    public void testServiceHistory() throws InterruptedException {
        ServiceHistory serviceHistory = new ServiceHistory(driver);

        serviceHistory.setHistory("There is no labor charge in this case");
    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class TestCases extends BaseTest {

<<<<<<< HEAD
    @Test(priority = 1)
=======
    @Test(priority = 0)
>>>>>>> 465e8db6ce9fb964d3127a3fe3ba7fc2758b907d
    public void LoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginFunction("superadmin@sslwireless.com", "12345678");
    }

<<<<<<< HEAD
    @Test(priority = 2)
=======
    @Test(priority = 1)
>>>>>>> 465e8db6ce9fb964d3127a3fe3ba7fc2758b907d
    public void customerMenu() throws InterruptedException, AWTException {
        CustomerMenuPage customerMenuPage = new CustomerMenuPage(driver);
        customerMenuPage.customerVehicle();
    }
<<<<<<< HEAD

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
=======
>>>>>>> 465e8db6ce9fb964d3127a3fe3ba7fc2758b907d
}

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

    @Test(priority = 2)
    public void serviceMenu() throws InterruptedException, AWTException {
        ServiceCenterMenu serviceCenterMenu = new ServiceCenterMenu(driver);
        serviceCenterMenu.setServiceMenu();
    }

    @Test(priority = 3)
    public void testServiceHistory() throws InterruptedException {
        ServiceHistory serviceHistory = new ServiceHistory(driver);
        serviceHistory.setHistory("There is no labor charge in this case");
    }

    @Test(priority = 4)
    public void testServiceType() {
        Configuration_ServiceTypes serviceTypes = new Configuration_ServiceTypes(driver);
        serviceTypes.setConfigServiceType("Automation2", "6", "3596", "28000", "38000", "5", "This is automation");
    }

    @Test(priority = 5)
    public void testServiceParts() {
        ServiceParts partsService = new ServiceParts(driver);
        partsService.setServiceParts("Motor Clean", "850", "Automation description");
    }

    @Test(priority = 6)
    public void testParts() throws InterruptedException, AWTException {
        partsBulk bulkParts = new partsBulk(driver);
        bulkParts.setPartsBulk();
    }

    @Test(priority = 7)
    public void testReportsPayment() throws InterruptedException, AWTException {
        reportsPayment reportsPayment = new reportsPayment(driver);
        reportsPayment.setReportsPayment();
    }

    @Test(priority = 8)
    public void testTokenGeneration() {
        tokenGeneration tokenGeneration = new tokenGeneration(driver);
        tokenGeneration.setTokenGeneration("E003500", "01687663220", "1950");
    }

    @Test(priority = 9)
    public void testUserCreate() {
        userCreate userCreate = new userCreate(driver);
        userCreate.setUserCreate("Automation service center", "automation@gmail.com", "01687663220", "Pass@123");
    }

    @Test(priority = 10)
    public void testLogout() {
        logout logout = new logout(driver);
        logout.setLogout();
    }
}

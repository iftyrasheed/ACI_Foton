package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CustomerMenuPage extends BasePage {
    public CustomerMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Customer')]")
    WebElement customerMenu;

    @FindBy(xpath = "(//a[normalize-space()='Customer/Vehicle'])[1]")
    WebElement customerSubMenu;

    @FindBy(linkText = "Upload Data")
    WebElement uploadCus;

    @FindBy(css = "#uploadPrompt")
    WebElement uploadBtn;

    @FindBy(css = "#uploadUrlButton")
    WebElement submitBtn;

    @FindBy(xpath = "(//span[@class='flex-1 ms-3 text-left rtl:text-right flex-nowrap opacity-50 text-[14px]'])[1]")
    WebElement customerSubMenu2;

    public void customerVehicle() throws InterruptedException, AWTException {
//        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(customerMenu)).click();
//        wait.until(ExpectedConditions.visibilityOf(customerSubMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(uploadCus)).click();
//        wait.until(ExpectedConditions.visibilityOf(customerSubMenu2)).click();
//        uploadBtn.sendKeys("D:\\Automation\\ACI_Foton\\src\\main\\resources\\Latest_customer_vehicle_bulk_upload_template.xlsx");


        wait.until(ExpectedConditions.visibilityOf(uploadBtn)).click();
        Thread.sleep(5000);

        Robot robot = new Robot();
        StringSelection filePath = new StringSelection("D:\\Automation\\ACI_Foton\\src\\main\\resources\\Latest_customer_vehicle_bulk_upload_template.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(1500);

        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1500);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1500);

        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1500);

        robot.keyRelease((KeyEvent.VK_ENTER));
        Thread.sleep(1500);


        submitBtn.click();

    }
}

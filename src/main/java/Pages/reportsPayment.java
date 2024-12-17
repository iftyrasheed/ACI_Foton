package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class reportsPayment extends BasePage{
    public reportsPayment(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//span[normalize-space()='Reports'])[1]")
    WebElement reportsMenu;

    @FindBy(linkText = "Payment Summary")
    WebElement paymentSummaryMenu;

    @FindBy(xpath = "(//a[normalize-space()='Disbursement Upload'])[1]")
    WebElement disbursementMenu;

    @FindBy(id = "uploadPrompt")
    WebElement uploadSelect;

    @FindBy(id = "uploadUrlButton")
    WebElement submitBtn;

    public void setReportsPayment() throws InterruptedException, AWTException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", reportsMenu);

        wait.until(ExpectedConditions.visibilityOf(reportsMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(paymentSummaryMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(disbursementMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(uploadSelect)).click();

        Robot robot = new Robot();
        StringSelection filePath = new StringSelection("D:\\Automation\\ACI_Foton\\src\\main\\resources\\disbursement_demo_file (2).xlsx");
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

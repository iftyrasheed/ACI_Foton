package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ServiceCenterMenu extends BasePage{
    public ServiceCenterMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "span[class='flex-1 ms-3 text-left rtl:text-right flex-wrap opacity-50 text-[14px]']")
    WebElement SCmenu;

    @FindBy(linkText = "Service Center Upload")
    WebElement uploadMenu;

    @FindBy(css = "#uploadPrompt")
    WebElement uploadBtn;

    @FindBy(css = "#uploadUrlButton")
    WebElement submitBtn;

    public void setServiceMenu() throws InterruptedException, AWTException {
        wait.until(ExpectedConditions.visibilityOf(SCmenu)).click();
        wait.until(ExpectedConditions.visibilityOf(uploadMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(uploadBtn)).click();
        Thread.sleep(3000);

        Robot robot = new Robot();
        StringSelection filePath = new StringSelection("G:\\SSL Wireless\\ACI_Foton-main\\src\\main\\resources\\service_center_bulk_upload_template .xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1500);

        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(1500);

        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1500);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1500);

        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1500);

        robot.keyRelease((KeyEvent.VK_ENTER));
        Thread.sleep(2000);

        submitBtn.click();
    }
}

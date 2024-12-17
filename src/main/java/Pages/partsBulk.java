package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class partsBulk extends BasePage{
    public partsBulk(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[normalize-space()='Parts Bulk Upload'])[1]")
    WebElement partsBulkSideMenu;

    @FindBy(id = "uploadPrompt")
    WebElement chooseFileBtn;

    @FindBy(id = "uploadUrlButton")
    WebElement submitBtn;

    public void setPartsBulk() throws InterruptedException, AWTException {
        wait.until(ExpectedConditions.visibilityOf(partsBulkSideMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(chooseFileBtn)).click();
        Thread.sleep(3000);

        Robot robot = new Robot();
        StringSelection filePath = new StringSelection("D:\\Automation\\ACI_Foton\\src\\main\\resources\\spare_parts_bulk_upload_template  (3).xlsx");
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

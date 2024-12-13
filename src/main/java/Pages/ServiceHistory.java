package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ServiceHistory extends BasePage{
    public ServiceHistory(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//span[normalize-space()='History'])[1]")
    WebElement historyMenu;

    @FindBy(linkText = "Service History")
    WebElement historySubMenu;

    @FindBy(css = "a[href='https://aci-service.sslwireless.com/service-histories/37/edit']")
    WebElement editBtn;

    @FindBy(id = "status")
    WebElement status;

    @FindBy(id = "part_13")
    WebElement partsNo1;

    @FindBy(id = "remarks")
    WebElement remarksField;

    @FindBy(css = "button[class='py-2 px-4 bg-[#1792EB] text-white rounded-lg']")
    WebElement saveBtn;

    public void setHistory(String typeRemarks) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(historyMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(historySubMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(editBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(status)).click();

        Select statusDropdown = new Select(driver.findElement(By.id("status")));

        statusDropdown.selectByIndex(2);

        wait.until(ExpectedConditions.visibilityOf(partsNo1)).click();
        remarksField.sendKeys(typeRemarks);

        saveBtn.click();
        Thread.sleep(3000);
    }
}

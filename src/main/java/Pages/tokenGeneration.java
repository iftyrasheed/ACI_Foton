package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class tokenGeneration extends BasePage {
    public tokenGeneration(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//span[contains(@class,'flex-1 ms-3 text-left rtl:text-right whitespace-wrap opacity-50 text-[14px]')])[1]")
    WebElement tokenMenu;

    @FindBy(linkText = "Manual Token")
    WebElement manualTokenSubMenu;

    @FindBy(xpath = "(//a[normalize-space()='Create Token'])[1]")
    WebElement createTokenBtn;

    @FindBy(id = "chassis_number")
    WebElement chassisNo;

    @FindBy(css = "#service_center_code")
    WebElement serviceCenter;

    @FindBy(css = "#msisdn")
    WebElement contactNumber;

    @FindBy(css = "#km_range")
    WebElement drivenKm;

    @FindBy(css = "#service_type")
    WebElement serviceType;

    @FindBy(css = "button[type='submit']")
    WebElement submitBtn;

    public void setTokenGeneration(String chassisNumb, String phoneNumber, String kmRange) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", tokenMenu);
        wait.until(ExpectedConditions.visibilityOf(tokenMenu)).click();

        wait.until(ExpectedConditions.visibilityOf(manualTokenSubMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(createTokenBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(chassisNo)).sendKeys(chassisNumb);
        serviceCenter.click();

        Select dropdownServiceCenter = new Select(serviceCenter);
        dropdownServiceCenter.selectByIndex(10);

        contactNumber.sendKeys(phoneNumber);
        drivenKm.sendKeys(kmRange);

        serviceType.click();
        Select serviceTypeDropdown = new Select(serviceType);
        serviceTypeDropdown.selectByIndex(1);

        submitBtn.click();
    }
}

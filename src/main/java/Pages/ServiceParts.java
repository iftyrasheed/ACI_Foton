package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ServiceParts extends BasePage {
    public ServiceParts(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[normalize-space()='Service Parts'])[1]")
    WebElement servicePartsSubMenu;

    @FindBy(xpath = "(//button[normalize-space()='Add New Service Part'])[1]")
    WebElement AddPartsBtn;

    @FindBy(css = "input[name='name']")
    WebElement name;

    @FindBy(css = "select[name='service_type_id']")
    WebElement serviceType;

    @FindBy(css = "input[name='charge_amount']")
    WebElement charge;

    @FindBy(css = "textarea[name='description']")
    WebElement description;

    @FindBy(css = "button[type='submit']")
    WebElement submitBtn;

    public void setServiceParts(String nameOfServicePart, String chargeAmount, String descriptionValue){
        wait.until(ExpectedConditions.visibilityOf(servicePartsSubMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(AddPartsBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(name)).sendKeys(nameOfServicePart);
        serviceType.click();

        Select serviceTypeDropdown = new Select(serviceType);
        serviceTypeDropdown.selectByIndex(3);

        charge.sendKeys(chargeAmount);
        description.sendKeys(descriptionValue);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        submitBtn.click();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Configuration_ServiceTypes extends BasePage {
    public Configuration_ServiceTypes(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//span[normalize-space()='Configuration'])[1]")
    WebElement configurationMenu;

    @FindBy(linkText = "Service Types")
    WebElement serviceTypeSubMenu;

    @FindBy(xpath = "(//button[normalize-space()='Add New Service'])[1]")
    WebElement addServiceBtn;

    @FindBy(css = "input[placeholder='Enter Service Type Name']")
    WebElement ServiceTypeName;

    @FindBy(css = "input[placeholder='eg. 3, 6']")
    WebElement month;

    @FindBy(css = "input[placeholder='eg. 2000, 3000']")
    WebElement price;

    @FindBy(id = "kmRangeStart")
    WebElement KmRangeStart;

    @FindBy(id = "kmRangeEnd")
    WebElement KmRangeEnd;

    @FindBy(css = "select[name='vehicle_model_id']")
    WebElement vehicleModel;

    @FindBy(css = "input[placeholder='eg. 3,6']")
    WebElement freeService;

    @FindBy(css = "input[placeholder='Fourth service for 1/1.5 Ton']")
    WebElement description;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement createBtn;

    public void setConfigServiceType(String serviceTypeName, String monthNumber, String priceAmount, String startKm, String endKm, String freeServiceNum, String descriptionValue) {
        wait.until(ExpectedConditions.visibilityOf(configurationMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(serviceTypeSubMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(addServiceBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(ServiceTypeName)).sendKeys(serviceTypeName);
        month.sendKeys(monthNumber);
        price.sendKeys(priceAmount);
        KmRangeStart.sendKeys(startKm);
        KmRangeEnd.sendKeys(endKm);
        vehicleModel.click();
        Select dropdownVehicleModel = new Select(driver.findElement(By.cssSelector("select[name='vehicle_model_id']")));
        dropdownVehicleModel.selectByIndex(3);
        freeService.sendKeys(freeServiceNum);
        description.sendKeys(descriptionValue);
        createBtn.click();
    }
}

package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class userCreate extends BasePage{
    public userCreate(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//span[normalize-space()='Users'])[1]")
    WebElement usersMenu;

    @FindBy(linkText = "User List")
    WebElement userListMenu;

    @FindBy(xpath = "(//button[normalize-space()='Add New User'])[1]")
    WebElement userAdd;

    @FindBy(css = "input[placeholder='Enter Full Name']")
    WebElement userName;

    @FindBy(css = "input[placeholder='Enter Email']")
    WebElement email;

    @FindBy(css = "input[placeholder='Enter Mobile Number']")
    WebElement mobile;

    @FindBy(id = "password")
    WebElement passField;

    @FindBy(id = "confirmPassword")
    WebElement passConfirmField;

    @FindBy(css = "#role_id")
    WebElement roleSelect;

    @FindBy(css = "button[type='submit']")
    WebElement createBtn;

    public void setUserCreate(String nameUser, String mail, String number, String pass){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", usersMenu);
        wait.until(ExpectedConditions.visibilityOf(usersMenu)).click();

        wait.until(ExpectedConditions.visibilityOf(userListMenu)).click();

        wait.until(ExpectedConditions.visibilityOf(userAdd)).click();

        wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(nameUser);
        email.sendKeys(mail);
        mobile.sendKeys(number);
        passField.sendKeys(pass);
        passConfirmField.sendKeys(pass);
        roleSelect.click();
        Select dropdown = new Select(roleSelect);
        dropdown.selectByIndex(1);

        createBtn.click();
    }
}

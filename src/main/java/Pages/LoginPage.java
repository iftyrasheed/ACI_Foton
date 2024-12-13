package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-group-1")
    WebElement signInField;

    @FindBy(id = "hs-toggle-password")
    WebElement PassField;

    @FindBy(css = "button[type='submit']")
    WebElement signInBtn;

    public void LoginFunction(String mail, String passWord) throws InterruptedException {
        signInField.sendKeys(mail);
        wait.until(ExpectedConditions.visibilityOf(PassField));
        PassField.sendKeys(passWord);
        wait.until(ExpectedConditions.visibilityOf(signInBtn));
        signInBtn.click();
        Thread.sleep(5000);
    }
}

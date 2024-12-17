package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class logout extends BasePage{
    public logout(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "img[class='profilePic cursor-pointer hover:shadow-lg']")
    WebElement profileImg;

    @FindBy(xpath = "(//li[@class='p-1 cursor-pointer hover:bg-gray-100 text-sm'])[1]")
    WebElement logoutBtn;

    public void setLogout(){
        wait.until(ExpectedConditions.visibilityOf(profileImg)).click();
        wait.until(ExpectedConditions.visibilityOf(logoutBtn)).click();
    }
}

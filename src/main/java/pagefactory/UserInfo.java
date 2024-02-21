package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfo {
    WebDriver driver;

    @FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement userIdInput;

    @FindBy(xpath = "//input[@name='password']")
    WebElement newPasswordInput;

    @FindBy(xpath = "//input[@name='repeatedPassword']")
    WebElement repeatPasswordInput;

    // Constructor
    public UserInfo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void registerProfileInfo(String userId, String newPassword, String repeatPassword) {
        userIdInput.sendKeys(userId);
        newPasswordInput.sendKeys(newPassword);
        repeatPasswordInput.sendKeys(repeatPassword);
    }
}


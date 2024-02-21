package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class regnowbtn {
    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Register Now!']")
    private WebElement registerNowButton;

    // Constructor
    public regnowbtn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRegisterNow() {
        registerNowButton.click();
    }
}


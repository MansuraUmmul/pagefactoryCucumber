package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmPage {
	WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    WebElement signInButton;

    // Constructor
    public HmPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signIn() {
        signInButton.click();
    }

}

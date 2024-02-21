package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProInformation {
    WebDriver driver;

    @FindBy(xpath = "//table[3]/tbody[1]/tr[3]/td[2]/input[1]")
    private WebElement myListCheckbox;

    @FindBy(xpath = "//table[3]/tbody[1]/tr[4]/td[2]/input[1]")
    private WebElement myBannerCheckbox;

    // Constructor
    public ProInformation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMyList() {
        myListCheckbox.click();
    }

    public void clickMyBanner() {
        myBannerCheckbox.click();
    }

    public void updateProfileInfo() {
        clickMyList();
        clickMyBanner();
    }
}

package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccInformation {
    WebDriver driver;

    // Web Elements using Page Factory
    @FindBy(name = "account.firstName")
    WebElement firstName;

    @FindBy(name = "account.lastName")
    WebElement lastName;

    @FindBy(name = "account.email")
    WebElement email;

    @FindBy(name = "account.phone")
    WebElement phone;

    @FindBy(name = "account.address1")
    WebElement address1;

    @FindBy(name = "account.address2")
    WebElement address2;

    @FindBy(name = "account.city")
    WebElement city;

    @FindBy(name = "account.state")
    WebElement state;

    @FindBy(name = "account.zip")
    WebElement zip;

    @FindBy(name = "account.country")
    WebElement country;

    // Constructor
    public AccInformation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize elements using Page Factory
    }

    @Test(dataProvider = "dp")
    public void account_info(String fname, String lname, String eml, String phn, String add1, String add2, String cty, String sta, String zp, String cntry) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(eml);
        phone.sendKeys(phn);
        address1.sendKeys(add1);
        address2.sendKeys(add2);
        city.sendKeys(cty);
        state.sendKeys(sta);
        zip.sendKeys(zp);
        country.sendKeys(cntry);
    }

    @DataProvider(name = "dp")
    String[][] acc_info_Data() {
        String data1[][] = {
                {"First", "Last", "abc@gmail.com", "012345", "Rd no:22", "Apartment:2c", "NYC", "New York", "1234", "USA",}
        };
        return data1;
    }
}

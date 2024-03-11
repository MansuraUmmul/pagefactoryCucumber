package pagefactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @Test
    public void account_info() {
        // You can modify the data array as per your test cases
        String[][] data = acc_info_Data();

        for (String[] row : data) {
            firstName.sendKeys(row[0]);
            lastName.sendKeys(row[1]);
            email.sendKeys(row[2]);
            phone.sendKeys(row[3]);
            address1.sendKeys(row[4]);
            address2.sendKeys(row[5]);
            city.sendKeys(row[6]);
            state.sendKeys(row[7]);
            zip.sendKeys(row[8]);
            country.sendKeys(row[9]);

            // Add any assertions or verification steps as needed
        }
    }

    private String[][] acc_info_Data() {
        String[][] data1 = {
                {"First", "Last", "abc@gmail.com", "012345", "Rd no:22", "Apartment:2c", "NYC", "New York", "1234", "USA"}
        };
        return data1;
    }
}

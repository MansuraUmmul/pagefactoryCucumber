package pagefactory;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationValidation {
    private WebDriver driver;

    @FindBy(xpath = "(//input[@name='newAccount'])[1]")
    private WebElement saveAccountButton;

    // Constructor
    public RegistrationValidation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Test
    public void registration_btn() 
    {
        saveAccountButton.click();
    }
    public void registration_validation() 
    {

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://petstore.octoperf.com/actions/Account.action");
    }

        
    
    public void capture_screenshot() throws IOException
    {
    	driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\mummu\\eclipse-workspace\\PageFactory_cucumber\\Screenshot\\fullpage.png");
        FileUtils.copyFile(src, trg);
    }
}


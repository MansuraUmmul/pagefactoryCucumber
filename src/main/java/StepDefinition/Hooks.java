package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.crossBrowser;

import java.io.IOException;

import org.openqa.selenium.WebDriver;




public class Hooks {

    WebDriver driver;

    @Before
    public void setUp() throws IOException {        
        
    	crossBrowser br = new crossBrowser();            
        driver = br.browserInitiate();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}

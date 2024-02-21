package StepDefinition;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HmPage;
import pagefactory.regnowbtn;
import utilities.crossBrowser;

public class LoginStepDefinition {

	private WebDriver driver;
    


    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    WebElement signInLink;

    @FindBy(name = "username")
    WebElement usernameInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(name = "signon")
    WebElement signInButton;  

    @Given("the user enters the url")
    public void the_user_enters_the_url() throws IOException {
    	HmPage hp=new HmPage(driver);
    	hp.signIn();
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        usernameInput.sendKeys("j2ee");
        passwordInput.clear();
        passwordInput.sendKeys("j2ee");
        signInButton.click();
    }

    @Then("should login to the home page")
    public void should_login_to_the_home_page() {
        String currentUrl = driver.getCurrentUrl();  
	    Assert.assertEquals(currentUrl, "https://petstore.octoperf.com/actions/Catalog.action");
    }
}

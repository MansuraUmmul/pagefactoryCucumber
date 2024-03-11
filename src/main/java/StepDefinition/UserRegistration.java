package StepDefinition;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.AccInformation;
import pagefactory.HmPage;
import pagefactory.regnowbtn;
import pagefactory.ProInformation;
import pagefactory.RegistrationValidation;
import pagefactory.UserInfo;
import utilities.ExcelData;
import utilities.crossBrowser;


public class UserRegistration {
	WebDriver driver;
    String data[];
    ExtentReports report;
    ExtentTest test;
    
	
	

    @Given("url entered by the user")
    public void url_entered_by_the_user() throws IOException {
        crossBrowser br = new crossBrowser();
        driver = br.browserInitiate();
    }
    
    @When("the User clicks on the sign in button")
    public void the_user_clicks_on_the_sign_in_button() {
    	HmPage hp=new HmPage(driver);
    	hp.signIn();
    }
    
    

	@When("the User clicks on the Register Now button")
	public void the_user_clicks_on_the_register_now_button() {
		regnowbtn lgn = new regnowbtn(driver);
		lgn.clickRegisterNow();
        
	}

	@When("the User successfully fills the User Information section")
	public void the_user_successfully_fills_the_user_information_section() throws IOException {
		ExcelData excelData = new ExcelData();
        String[] userData = excelData.readExcel();
        String userid = userData[0];
        String newpassword = userData[1];
        String rptpassword = userData[2];
        UserInfo userinfo = new UserInfo(driver);
        userinfo.registerProfileInfo(userid, newpassword, rptpassword); 
	}

	@When("the User successfully fills the Profile Information section")
	public void the_user_successfully_fills_the_profile_information_section() {
		ProInformation pinfo = new ProInformation(driver);
        pinfo.updateProfileInfo();
	}

	@When("the User successfully fills the Account Information section")
	public void the_user_successfully_fills_the_account_information_section() {
		AccInformation accountInfo = new AccInformation(driver);            
        accountInfo.account_info();
	}

	 @When("the User clicks on the Save Account Information button")
	    public void the_user_clicks_on_the_save_account_information_button() {
	        RegistrationValidation valreg = new RegistrationValidation(driver);
	        valreg.registration_btn();
	    }

	 @Then("the User is redirected to a Broken Link")
	    public void the_user_is_redirected_to_a_broken_link() {
	        RegistrationValidation valreg = new RegistrationValidation(driver);
	        valreg.registration_validation();
	    }

	 @Then("the User captures a screenshot")
	    public void the_user_captures_a_screenshot() throws IOException {
	        RegistrationValidation valreg = new RegistrationValidation(driver);
	        valreg.capture_screenshot();
	    }
	 
	

}

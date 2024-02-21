package Cucumber_framework.PageFactory_cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\mummu\\eclipse-workspace\\PageFactory_cucumber\\src\\test\\resource\\Feature",
        glue = {"StepDefinition"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner {

}

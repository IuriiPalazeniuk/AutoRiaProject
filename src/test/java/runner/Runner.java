package runner;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"},
        features = "src/test/java/features/RiaSimpleTests.feature"
        , glue = {"steps"},
        tags = "@smoke"
)

public class Runner {

    @BeforeClass
    static public void setConfig() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://auto.ria.com";
        Configuration.screenshots = true;
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
    }

}
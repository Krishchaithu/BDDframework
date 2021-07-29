package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/websearch.feature","src/test/java/features/login.feature"},
        glue = {"stepdef","StepDefination"},
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class serachTest {
}

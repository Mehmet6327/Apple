package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        plugin = {"html:target/html-reports/cucumber.html"},
        glue = "stepDefinitions",
        dryRun =false,
        tags = "@wip"
)
public class CukesRunner {

}

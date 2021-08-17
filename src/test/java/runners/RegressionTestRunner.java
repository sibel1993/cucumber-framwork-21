package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
This will run the feature files
@RunWith is used to run the java class. This is a Cucumber-JUnit annotation
@CucumberOptions is used to add features, glue, plugins, tags, dryRun. This is a Cucumber-JUnit annotation
-features : points to the path of the features folder
-glue     : points to the path of the stepdefinitions folder
-tag      : this marks which feature files to run.Tags can be given any value
-dry-run=true:run tests without browser to check if there is missing definition
-dryRun = false run tests on the browser .to run tests we should make dryRun false.
*/
@RunWith(Cucumber.class)
@CucumberOptions(
        //html is the type of the report
        //target is a destination
        //target/default-cucumber-reports

        plugin = {
                "html:target/default-cucumber-reports2",
                "json:target/json-report/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml",
                "rerun:target/failedRerun.txt"
        },
        features = ".\\src\\test\\resources\\features",
        glue = "stepdefinitions",
        tags = "@regression",
        dryRun = false
)

public class RegressionTestRunner {
}

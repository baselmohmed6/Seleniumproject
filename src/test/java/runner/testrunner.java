package runner;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/java/features/UserRegistration.feature",
		glue= {"steps"},
		plugin = { "pretty","html:target/cucumbers-html-report" },
		monochrome = true
	)
public class testrunner extends TestBase {

}

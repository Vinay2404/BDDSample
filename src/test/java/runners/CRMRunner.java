package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//TagFeatures//",
		glue = {"stepDefs"},
		monochrome = true,
//		tags = "@RegressionTest",
//		tags = "@RegressionTest or @SmokeTest",
//		tags = "@RegressionTest and @SmokeTest",
//		tags = "not @IntegartionTest",
//		tags = @RegressionTest and not @SmokeTest,
//		tags = "@PhaseOne and @RegressionTest",
//		tags = "@PhaseOne and not @RegressionTest or @PhaseTwo and @SmokeTest",
		tags = "@PhaseTwo and @RegressionTest or SmokeTest"
		
		)

public class CRMRunner {

}

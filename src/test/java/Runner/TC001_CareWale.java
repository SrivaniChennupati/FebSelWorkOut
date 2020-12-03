package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/Feature/Cucumber.feature" ,glue = "Step" )

public class TC001_CareWale extends AbstractTestNGCucumberTests{

	 
	}



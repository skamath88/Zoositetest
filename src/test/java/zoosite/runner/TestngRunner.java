package zoosite.runner;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.*;
@Test
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json"}, 
				features = {"src/test/java/zoosite/features/"},
				glue ={"zoosite/steps/"},
				tags = {"@Functional"}
					)

public class TestngRunner {

	private TestNGCucumberRunner testNGCucumberRunner;
	 

}


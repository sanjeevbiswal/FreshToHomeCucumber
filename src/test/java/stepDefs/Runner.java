package stepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by SB00430588 on 5/5/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefs",
                format = { "pretty", "html:target/site/cucumber-pretty"},
        monochrome = true,
        tags = "@Search_001"


)
public class Runner {
}

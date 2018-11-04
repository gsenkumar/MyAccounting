package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by aikkiasenthil on 28/10/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        glue= {"src/test/java/step_definitions"},
        format={"pretty","html:target/html/"},
        //plugin={"pretty","html:target/cucumber-html-report"},
        //format={"pretty","json:target/cucumber.json"},
        //plugin = {"pretty","html:target/cucumber-html-report"},
        tags = {"@Smoke1"}
)

public class TestRunner {

}


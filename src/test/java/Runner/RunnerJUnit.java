package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",
        glue = "StepDefinitions"
      )
@RunWith(Cucumber.class)
public class RunnerJUnit {

}

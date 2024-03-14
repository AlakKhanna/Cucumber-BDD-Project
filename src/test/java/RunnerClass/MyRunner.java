package RunnerClass;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Resources/featurefiles",
        glue = "Step.defination",
        plugin = "html:/Users/alak/IdeaProjects/CucumberBDDProject/src/test/java/CucumberReport.html"

)

public class MyRunner {

}

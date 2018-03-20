import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features"
        ,glue={"com.praksa.cucumber.steps"}
        ,format={"json:target/cucumber.json", "html:target/site/cucumber-pretty"}
)
 //,format={"pretty", "html:target/Destination"} ,format={"json:target/cucumber.json", "html:target/site/cucumber-pretty"}
public class TestRunner {
    //mvn clean install -Dintegration-tests -Dbrowser=firefox
}
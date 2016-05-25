package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "json:target/" ,  "html:target/cucumber-html-report"}, features = { "src/cucumber/" })
public class CucumberRunner {


}

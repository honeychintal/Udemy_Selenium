package runnerClasses;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features" //feature contains location to feature files
		,glue={"stepDefinitions"} //glue contains packages to step definition 
		,monochrome=true
		,plugin= {"junit:Reports/xml_report.xml","json:Reports/json_report.json","html:Reports/Html_report.html","pretty"} //plugin contains plugins and locations for reports to be stored
		,tags="" //tags contains @tags, for which tags need to be executed
		)
public class TestRunner {}
//Monochrome:This option can either set as true or false. If it is set as true, it means that the console output for the Cucumber test are much more readable.
//Pretty: Prints the Gherkin source with additional colors and stack traces for errors. Use below code:
//HTML: This will generate a HTML report at the location mentioned in the for-matter itself.
//JSON: This report contains all the information from the gherkin source in JSON Format.
//JUnit: This report generates XML files just like Apache Ant’s JUnit report task. This XML format is understood by most Continuous Integration servers
package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = "stepdef", plugin = { "json:target/json-cucumber-reports/cukejson.json",
		"testng:target/testng-cucumber-reports/cuketestng.xml" }, features = "src/test/resources/features/")
public class Runner extends AbstractTestNGCucumberTests {

	private static long duration;

	@BeforeClass
	public static void before() {
		duration = System.currentTimeMillis();
		System.out.println("Tests started at :"+duration);
	}

	@AfterClass
	public static void after() {
		duration = System.currentTimeMillis() - duration;
		System.out.println("TOTAL DURATION OF RUN - " + duration + "ms");
	}
}

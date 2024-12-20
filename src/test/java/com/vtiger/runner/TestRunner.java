package com.vtiger.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

 features = "src/test/resources/Featuress",
        glue="com.vtiger.stepdefin",
        dryRun = false,
        plugin = {
                "pretty", "html:target/cucumber-html-report.html",
                "json:target/cucumber.json",

        },
        tags = "@Potential",
        monochrome = true

)
public class TestRunner {

}

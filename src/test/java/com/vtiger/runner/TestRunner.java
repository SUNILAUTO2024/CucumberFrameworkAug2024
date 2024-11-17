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
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber.json",

        },
        tags = "@API",
        monochrome = true

)
public class TestRunner {

}

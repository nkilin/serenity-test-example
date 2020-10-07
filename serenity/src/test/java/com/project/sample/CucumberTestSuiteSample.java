package com.project.sample;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-json-report.json", "junit:target/cucumber-junit-report.xml"},
        features = {"classpath:features/sample"},
        glue = {"com.project.sample"}
)
public class CucumberTestSuiteSample {

}
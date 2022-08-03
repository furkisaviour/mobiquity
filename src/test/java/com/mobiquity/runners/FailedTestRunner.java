package com.mobiquity.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "target/rerun.text",
        glue = "com/mobiquity/step_definitions"
)
public class FailedTestRunner {
}

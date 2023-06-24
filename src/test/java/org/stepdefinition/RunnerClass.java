package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefinition",
monochrome = true,
dryRun = false,
tags = "@Feature1",
plugin = {"html:Reports" , "junit:Reports\\junitreport.xml" , "json:Reports\\jsonreport.json" })
public class RunnerClass {
	

}

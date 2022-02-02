package com.codekuul.util;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/resources",glue = {"com.codekuul.stepdefinations"})
public class RunnerTest extends AbstractTestNGCucumberTests{
	

}

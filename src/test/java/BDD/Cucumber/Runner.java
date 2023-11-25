package BDD.Cucumber;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"feature"},
                 glue =     {"StepDefinations"},
                 plugin =    { "pretty",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                // tags="@login",
                  monochrome = true )
public class Runner extends AbstractTestNGCucumberTests{
	
	}	


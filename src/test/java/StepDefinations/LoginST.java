package StepDefinations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginpage;
import Utlities.ReportingManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginST extends loginpage

{


@Given("User should be Facebook")
public void user_should_be_facebook() throws InterruptedException, IOException {
   
	applicationlaunch();
	ExtentCucumberAdapter.addTestStepLog("applications is Lanuched");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
}

@When("^user enter Username as \"([^\\\"]*)\"$")
public void user_enters_username(String emailID) throws IOException {
	Enter_Emaild(emailID);
	ExtentCucumberAdapter.addTestStepLog("User entered username");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
}

@When("^user enters password \"([^\\\"]*)\"$")
public void user_enters_password(String passsword) throws IOException {
	Enter_password(passsword);

	ExtentCucumberAdapter.addTestStepLog("User entered password");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
	
}

@When("clicks on submit")
public void clicks_on_submit() throws IOException {
  
	Login();
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
	closeBrowser();
	ExtentCucumberAdapter.addTestStepLog("application is closed");
	
	
   
}

@Then("user should be on Home page")
public void user_should_be_on_home_page() {
    // Write code here that turns the phrase above into concrete actions
   
}


	
}

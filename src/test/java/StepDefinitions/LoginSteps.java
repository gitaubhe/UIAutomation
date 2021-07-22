package StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import resource.Base;

public class LoginSteps {
	 public static Logger log =LogManager.getLogger(Base.class.getName());
		public WebDriver driver;
		

		@Given("application has been launched")
		public void application_has_been_launched() {
		    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Application launched");
		}

		@When("enter username as {string} and password as {string}")
		public void enter_username_as_and_password_as(String string, String string2) {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Enter username and password");
		}
}

package StepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resource.Base;

public class LoginSteps extends Base{
	 public static Logger log =LogManager.getLogger(Base.class.getName());
			
		@Given("initialize the browser with chrome")
		public void initialize_the_browser_with_chrome() throws IOException {
			driver = InitializeDriver();
		}

		@Given("navigate to QAClickAcademy site")
		public void navigate_to_qa_click_academy_site() {

			driver.get(prop.getProperty("url"));
			
			log.info("Application launched");
			
		}

		@Given("click on login link in home page")
		public void click_on_login_link_in_home_page() {
			LandingPage lp = new LandingPage(driver);
			  Assert.assertEquals(lp.GetTitle().getText(), "ALL ACCESS SUBSCRIPTION");
				log.info("Landing page validated");
				
		    lp.GoToLoginPage();
		  
		}

		@Then("verify that user is successfully login")
		public void verify_that_user_is_successfully_login() {
		   System.out.println("Login successfully");
		}

		@When("enter username as {string} and password as {string}")
		public void enter_username_as_and_password_as(String email, String pwd) {
			LoginPage loginpage = new LoginPage(driver);
			loginpage.GetEmail().sendKeys(email);
			loginpage.GetPassword().sendKeys(pwd);
			loginpage.GetLogin().click();
			
		}
}

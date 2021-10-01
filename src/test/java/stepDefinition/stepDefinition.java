package stepDefinition;

import org.junit.runner.RunWith;
import org.testng.Assert;

import Resources.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
@RunWith(Cucumber.class)

public class stepDefinition extends base{

	
	@Given("^Intililize the browser with chrome$")
	public void intililize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=	initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\"  site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on login link in home page to land on sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		LandingPage land= new LandingPage(driver);
		 land.getLogin().click();
	 
	}

	@When("^User enters (.+) and  (.+) and log in$")
    public void user_enters_and_and_log_in(String username, String password) throws Throwable {
		LoginPage log= new LoginPage(driver);
		log.getEmail().sendKeys(username);
		log.getPassword().sendKeys(password);
		log.getSubmit().click();
    }


	@Then("^Verify that user login successfully$")
	public void verify_that_user_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 PortalHomePage home =new PortalHomePage(driver);
 
// Assert.assertTrue(home.getSearchBox().isDisplayed());
	}
  @And("^Close browsers$")
	public void close_browsers() throws Throwable {
	        driver.close();
	    }
	
}
package steps;

import static org.testng.Assert.assertTrue;

import Pages.HomePage;
import Pages.Userregisterationpage;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration  extends TestBase{
	/*
	 * 
	 * 
	 */
	HomePage home; Userregisterationpage register;
	@Given("The user in the homepage")
	public void the_user_in_the_homepage() {
		home=new HomePage(driver); home.openregisterlink(); 
	   // throw new io.cucumber.java.PendingException();
	}
	@When("I click on register link")
	public void i_click_on_register_link() {
		assertTrue(driver.getCurrentUrl().contains("register"));
	  //  throw new io.cucumber.java.PendingException();
	}

	
	@When("I entered {string},{string},{string},{string}")
	public void i_entered(String firstname, String lastname, String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		register=new Userregisterationpage(driver);
	     register.userregisteration(firstname, lastname, email, password);
	}
	@Then("the registration page displayed succesfully")
	public void the_registration_page_displayed_succesfully() {
		register.logout();
	    //throw new io.cucumber.java.PendingException();
	}
}

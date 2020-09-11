package com.gmail.test.steps;

import com.gmail.test.packagepage.DashBordPage;
import com.gmail.test.packagepage.HomePage;
import com.gmail.test.steps.serenity.EndUserSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class loginapplication {
	@Steps
	HomePage homepage;
	
	@Steps
	DashBordPage dashbordpage;
	

	@Given("^the user is on the Guvi home page$")
	public void the_user_is_on_the_Guvi_home_page() {
	    homepage.OpenApplicatio();
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_smarteye_gmail_com_as_username(String username) {
	    homepage.enterUserName(username);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_satheesh_as_password(String password) {
	    homepage.enterPassword(password);
	    homepage.Clicbutton();
	}

	@Then("^they should able to login$")
	public void they_should_able_to_login() {
		dashbordpage.VerifyAdminLogin();
	}
}

package com.gmail.test.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.gmail.test.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps enduser;
    @Given("^userwant to seach bus$")
    public void userwant_to_seach_bus() {
    	enduser.OpenApplicatio();
    }

    @When("^serach palce from 'Chennai'$")
    public void serach_palce_from_Chennai() {
    	
    	enduser.start_enter();
    }

    @When("^serach palce from 'dhli'$")
    public void serach_palce_from_dhli() {
    	enduser.dest_enter();
        }

    @When("^Set a depature time$")
    public void set_a_depature_time() {
    	enduser.depaturetime();
        }

    @Then("^get the result$")
    public void get_the_result() {
        
    }



}

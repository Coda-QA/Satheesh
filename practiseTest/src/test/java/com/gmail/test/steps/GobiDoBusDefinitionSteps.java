package com.gmail.test.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.gmail.test.steps.serenity.EndUserSteps;

public class GobiDoBusDefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;
    

@Given("^Search bus for given palce$")
public void search_bus_for_given_palce() {
	endUserSteps.is_the_home_page();
}

@When("^Starting area is 'Chennai'$")
public void starting_area_is_Chennai() {
	endUserSteps.startinput();
}

@When("^Destination area is 'Dehli'$")
public void destination_area_is_Dehli() {
	endUserSteps.toInput();
  }

@When("^Depature Time Set$")
public void depature_Time_Set() {
	endUserSteps.depatureTime();
    
}

@Then("^Get a a list from the screen$")
public void get_a_a_list_from_the_screen() {
	endUserSteps.writetheExcel();
}


    

   /* @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anna.is_the_home_page();
    }

    @When("the user looks up the definition of the word '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looks_for(word);
    }

    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        anna.should_see_definition(definition);
    }*/

}

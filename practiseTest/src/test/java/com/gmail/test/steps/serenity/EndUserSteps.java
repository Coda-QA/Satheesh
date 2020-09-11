package com.gmail.test.steps.serenity;

import com.gmail.test.pages.GobiGobusDictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    GobiGobusDictionaryPage dictionaryPage;
    
    @Step
    public void startinput(){
    	dictionaryPage.from_Input();
    }
    
    @Step
    public void toInput(){
    	dictionaryPage.to_Input();
    }
    
    @Step
    public void depatureTime(){
    	dictionaryPage.depature_Input();
    }
    
    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }
    
    @Step
    public Void writetheExcel(){
		return null;
    	
    }
    /*

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }*/
}
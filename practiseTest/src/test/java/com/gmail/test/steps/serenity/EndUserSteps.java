package com.gmail.test.steps.serenity;

import com.gmail.test.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

	DictionaryPage dictionaryPage;

	@Step
	public void OpenApplicatio() {
		dictionaryPage.open();

	}

	@Step
	public void start_enter() {
		dictionaryPage.startpoint();
	}

	@Step
	public void dest_enter() {
		dictionaryPage.endpoint();
	}

	@Step
	public void depaturetime() {
		dictionaryPage.depatureTime();
	}

}
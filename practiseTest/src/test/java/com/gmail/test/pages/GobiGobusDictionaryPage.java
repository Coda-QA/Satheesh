package com.gmail.test.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.goibibo.com/")
public class GobiGobusDictionaryPage extends PageObject {

	
	@FindBy(id="gosuggest_inputSrc")
	@CacheLookup
	WebElement inputSrc;
	
	@FindBy(id="gosuggest_inputDest")
	@CacheLookup
	WebElement inputDest;
	
	@FindBy(id="departureCalendar")
	@CacheLookup
	WebElement departureCalendar;

	@FindBy(id="gi_search_btn")
	@CacheLookup
	WebElement gi_search_btn;

	public void from_Input(){
		inputSrc.sendKeys("Chennai");
	}
	
	public void to_Input(){
		inputDest.sendKeys("Delhi");
	}
	public void depature_Input(){
		String dateinput =dateSelect();
		departureCalendar.sendKeys(dateinput);
		gi_search_btn.click();
	}

	private String dateSelect() {
		Date dt = new Date(); 
		 
		Calendar calendar = Calendar.getInstance(); 
		calendar.setTime(dt); 
		calendar.add(Calendar.DATE, 3); 
		dt = calendar.getTime(); 
		 
		 
		String DepatureDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		
		return DepatureDate;
	}
   /* @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }*/
}
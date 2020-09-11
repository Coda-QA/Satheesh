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
public class DictionaryPage extends PageObject {


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
	
    public void startpoint() {
    	inputDest.sendKeys("Chennai");
    }

    public void endpoint() {
    	departureCalendar.sendKeys("delhi");
    }
  
    
    public void depatureTime(){
    	Date dt = new Date(); 
   	   
    	  Calendar calendar = Calendar.getInstance(); 
    	  calendar.setTime(dt); 
    	  calendar.add(Calendar.DATE, 3); 
    	  dt = calendar.getTime(); 
    	  String wantedDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
  
  departureCalendar.sendKeys(wantedDate);
    	gi_search_btn.click();
    }

   
}
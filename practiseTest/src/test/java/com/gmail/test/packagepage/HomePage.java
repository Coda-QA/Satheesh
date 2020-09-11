package com.gmail.test.packagepage;

import net.thucydides.core.annotations.Step;

public class HomePage {

	GuviHomePage guvipage;
	
	@Step
	public void OpenApplicatio(){
		guvipage.open();
		
	}
	
	@Step
    public void enterUserName(String userName){
		guvipage.enterUserName(userName);
	}
	
	@Step
   public void enterPassword(String password){
	guvipage.enterPassword(password);
     }
	
	@Step
	public void Clicbutton(){
	guvipage.clickLoginButton();
    } 
}

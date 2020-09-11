package com.gmail.test.packagepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.guvi.in/sign-in")
public class GuviHomePage extends PageObject {
	
	public GuviHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "login_email", timeoutInSeconds="10")
	public static WebElement txtEmail;
	
	public void enterUserName(String username){
		typeInto(txtEmail, username);
	}
	
	public void enterPassword(String password){
		$(By.id("login_password")).type(password);
	}
 
	public void clickLoginButton(){
		$(By.id("login_button")).click();
	}

	
}

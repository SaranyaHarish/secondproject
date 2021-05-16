package com.object.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook extends Basepage {

	
	//uisng annotations
	@FindBy(id="email")
	WebElement emaidId;
	
	
	@FindBy(id="pass")
	WebElement pass;
	
	
	@FindBy(name="login")
	WebElement button;
	
	public Facebook(){
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmaidId() {
		return emaidId;
	}

	public void setEmaidId(WebElement emaidId) {
		this.emaidId = emaidId;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}
	
}

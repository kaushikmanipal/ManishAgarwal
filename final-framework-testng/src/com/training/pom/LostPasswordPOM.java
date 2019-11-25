package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostPasswordPOM {
	private WebDriver driver; 
	
	public LostPasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userEmail; 
	
	@FindBy(name="submit")
	private WebElement submitButton;
	
		
	public void EnterEmail(String emailValue) {
		this.userEmail.clear();
		this.userEmail.sendKeys(emailValue);
	}
	
	public void ClickSubmitButton() {
		this.submitButton.click();
	}
}
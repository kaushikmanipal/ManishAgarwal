package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactFormPOM {
	private WebDriver driver; 
	
	public ContactFormPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="name")
	private WebElement nameText; 
	
	@FindBy(name="email")
	private WebElement emailAddress;
	
	@FindBy(name="subject")
	private WebElement subjectText; 
	
	@FindBy(xpath="//textarea[@name='id:comments']")
	private WebElement messageText; 
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sendLink; 
	
	public void EnterName(String nameValue) {
		this.nameText.clear();
		this.nameText.sendKeys(nameValue);
	}
	
	public void EnterEmail(String emailid) {
		this.emailAddress.clear(); 
		this.emailAddress.sendKeys(emailid); 
	}
	
	public void EnterSubject(String subj) {
		this.subjectText.clear(); 
		this.subjectText.sendKeys(subj); 
	}
	
	public void EnterMessage(String msg) {
		this.messageText.clear(); 
		this.messageText.sendKeys(msg); 
	}
	
	public void ClickSendLink() {
		this.sendLink.click();
	}
	
	
}


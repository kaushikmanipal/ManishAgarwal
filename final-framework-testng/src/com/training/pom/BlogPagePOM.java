package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPagePOM {
	private WebDriver driver; 
	
	public BlogPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/contact/']")
	private WebElement contactLink; 
	
	
	public void ClickContactLink() {
		this.contactLink.click();
	}
	
	
	
	
}
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	private WebDriver driver; 
	
	public HomePagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@id='responsive']//a[text()='Blog']")
	private WebElement blogLink; 
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement siginLink;
	
	@FindBy(linkText=" Log In / Register")
	private WebElement siginLink1;
	
	public void ClickBlogLink() {
		this.blogLink.click();
	}
	
	public void ClickSigninLink() {
		this.siginLink.click();
	}
	
	public void ClickSigninLink1() {
		this.siginLink1.click();
	}
}


package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPagePOM {
	
private WebDriver driver; 
	
	public DashboardPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='wrap']/h1")
	private WebElement dashText; 
	
	
	public String GetDashboardText() {
		return(this.dashText.getText());
	}

}

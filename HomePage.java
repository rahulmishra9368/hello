package com.toyota.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toyota.qa.base.ToyotaBase;

public class HomePage extends ToyotaBase {
	
	
	@FindBy(xpath ="//i[@class = 'icon fa fa-plus fa-stack-1x fa-inverse']")
	WebElement icon;
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public String pagetitle() {
		
		String title = driver.getTitle()	;
		return title;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

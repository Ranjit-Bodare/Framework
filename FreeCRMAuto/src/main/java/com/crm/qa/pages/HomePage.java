package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[.='Ranjit Bodare']")
	WebElement UsernameLabel;
	
	@FindBy(xpath = "//span[.='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath = "//span[.='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath = "//span[.='Tasks']")
	WebElement tasksLink;
	
	
	//Initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Verify for the correct User to be logged
	public  boolean verifytheUser() {
		return UsernameLabel.isDisplayed();
	}
	

	//Verify Title of the Homepage
	public String verifyHomepageTitle() {
		return driver.getTitle();
	}
	
	
	//Click on contactPage
	public ContactPage ClickOnContactsLInk() {
		contactsLink.click();
		return new ContactPage();
	}
	
	//Click on DealsPage
	public DealsPage ClickOndealsLInk() {
	    dealsLink.click();
	    return new DealsPage();
		}
		
	//Click on TasksPage
		public TasksPage ClickTasksLInk() {
		    tasksLink.click();
		    return new TasksPage();
			}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

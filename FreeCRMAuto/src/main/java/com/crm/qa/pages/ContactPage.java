package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {
	
	@FindBy(xpath = "//div[contains(text(),'Contacts')]")
	WebElement ContactsLabel;
	

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement Checkboxby;
	

	//Initialization
		public ContactPage() {
			PageFactory.initElements(driver, this);
		}
		
    //Verify contacts Label
		public boolean VerifyContactsLabel() {
			return ContactsLabel.isDisplayed();
		}
		
   //select perticular contact
		//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']
		
		public void Selectcheckboxby() {
			Checkboxby.click();
		}
	

}

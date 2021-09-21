package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class SignOnPage extends Main{
	
		//1. Web Elements in this page are declared
	
	@FindBy (xpath="//input[@name='userName']")
	WebElement username;
	@FindBy (name ="password")
	WebElement password;
	@FindBy (xpath="//input[@name='submit']")
	WebElement  submit;
	@FindBy (xpath="//table[@width='100%']/tbody/tr[2]/td[2]/span")
	WebElement wrongEntryMessage;

		//2. initialize the web elements to driver
	
	public SignOnPage() {
			PageFactory.initElements(drives,this);		
		}
	
	//3. define all functions of the web elements
	
	public String wrongEntryMessageFn() {
			
		return wrongEntryMessage.getText();
	}
	
	public boolean submitDisplayFn() {
		
		return submit.isDisplayed();
	}
	
	public boolean submitEnabledFn() {
			
		return submit.isEnabled();
	}
	
	public void submitButtonClick() {
			
		submit.click();
	}
	
	public boolean passwordDisplayFn() {
		PageFactory.initElements(drives,this);	
		return password.isDisplayed();
	}
	
	public boolean passwordEnabledFn() {
		
		return password.isEnabled();
	}
	
	public void passwordTextEntry(String passwordInput) {
			
		password.sendKeys(passwordInput);
	}
	
	public boolean usernameDisplayFn() {
		
		return username.isDisplayed();
	}
	
	public boolean usernameEnabledFn() {
		
		return username.isEnabled();
	}
	
	public void usernameTextEntry(String usernameInput) {
			
		username.sendKeys(usernameInput);
	}
	
	
	
	
	
}

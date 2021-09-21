package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class HomePage extends Main {

	public String  usernameInput;
	public String passwordInput;
	//WebElements
	
	
	@FindBy(xpath="//table[@border='1']/tbody/tr/td[1]")
	WebElement SignOnLink;
	
	@FindBy (name="userName")
	WebElement hp_UserName;
	
	@FindBy (name ="password")
	WebElement hp_PassWord;
	
	@FindBy (xpath="//table[@border='0'][@cellpadding='3']/tbody/tr[3]/td[2]/span")
	WebElement hp_SignOnErrorMessage;
	
	@FindBy (name="submit")
	WebElement hp_Submit;
	
	//initialization
	
	public HomePage() {
		PageFactory.initElements(drives, this);
	}
	//webElement functions
	
	public boolean signonlinkEnabled() {
		
		return SignOnLink.isEnabled();
	}
	
	public void signonlinkClick() {
		
		SignOnLink.click();
	}
	
	public void usernameTextEntry(String usernameInput) {
		
		hp_UserName.sendKeys(usernameInput);
	}
	
	public void passwordTextEntry(String passwordInput) {
		
		hp_PassWord.sendKeys(passwordInput);
	}
	
	public void submitClick() {
		
		 hp_Submit.click();
	}
	
	
	
	
}

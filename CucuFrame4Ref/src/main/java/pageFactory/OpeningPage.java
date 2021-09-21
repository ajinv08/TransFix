package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.Main;

public class OpeningPage extends Main {
	
	//web elements
	@FindBy(name="userName")
	WebElement hp_username;
	
	@FindBy (name="password")
	WebElement hp_password;
	
	@FindBy (name="submit")
	WebElement hp_submit;
	
	//initialization
	
	public OpeningPage() {
		PageFactory.initElements(drives, this);;
	}
	
	//element functions

	public void hp_username_textEntry() {
		hp_username.sendKeys("firsttestname");
	}
	
	public void hp_password_textEntry() {
		hp_password.sendKeys("firsttestpassword");
		
	}
	
	public void hp_submit_click() {
		hp_submit.click();
	}
	
	
	
}

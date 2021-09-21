package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;


public class HomePage extends Main{
	
	@FindBy (name="userName")
	WebElement  usernameText;
	@FindBy (name="password")
	WebElement  passwordText;
	@FindBy (name="submit")
	WebElement submitBtn;
	
	public HomePage() {
		PageFactory.initElements(drives,this);
	}

	public void userNameTextEntry() {
		PageFactory.initElements(drives,this);
		usernameText.sendKeys("Testg  proj");
	}
	
	public void passwordTextEntry() throws InterruptedException {
		PageFactory.initElements(drives,this);
		passwordText.sendKeys("new proj");
		Thread.sleep(10000);
	}
	
	public void submitBtnClick() {
		PageFactory.initElements(drives,this);
		submitBtn.click();
	}
}

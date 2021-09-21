package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;
import test.HomePageTest;

public class HomePage extends Main {
	public static Main mp;
	public static HomePageTest hpt;

	//web elements
	@FindBy  (name = "userName")
	WebElement username;
	@FindBy (name = "password")
	WebElement password;
	@FindBy (name ="submit")
	WebElement submit;
	@FindBy (xpath="//table[@width='100%']/tbody/tr[3]/td[2]/span")
	WebElement wrongAlertMessage;
	//initialization
public HomePage() {
	PageFactory.initElements(drives, this);
}
	//functionalities
	
public void userNameTextEntry() {
	username.sendKeys("enter name");
}
	
public void passwordEntry() {
	password.sendKeys("enter password");
}
	
public void submitBtnClick() {
	submit.click();
}

public String alertMessageValidation() {
	return wrongAlertMessage.getText();
}

}

package pageFactory;

import org.openqa.selenium.support.PageFactory;

import base.Main;

public class LoginSuccessPage extends Main {
	
		//1. Web Elements in this page are declared
	
		//2. initialize the web elements to driver
	
	public LoginSuccessPage() {
		PageFactory.initElements(drives, this);
	}
		
		//3. define all functions of the web elements
	
	

	public String validateSignOnFunction() {
		return drives.getTitle();
	}
}

package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Main;
import pageFactory.HomePage;

public class HomePageTest extends Main{

	HomePage hp =new HomePage();
	Main mp = new Main();
	
	@BeforeTest
	public void testInitialization() {
		mp.mainInitial();
	}
	
	@AfterTest
	public void testCloseDown() {
		mp.finalClose();
	}
	
	@BeforeMethod
	public void hpMethodInl() {
		
	}
	
	@AfterMethod
	public void hmMethodClose() {
		
	}
	
	@Test
	public void usernameTextEntryTest() {
		hp.userNameTextEntry();
	}
	
	@Test
	public void passwordTextEntryTest() throws InterruptedException {
		hp.passwordTextEntry();
	}
	
	@Test
	public void submitBtnClickTest() {
		hp.submitBtnClick();
	}
	
}

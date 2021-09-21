package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Main;

import pageFactory.HomePage;
import pageFactory.LoginSuccessPage;
import pageFactory.SignOnPage;



public class SignOnPageTest extends Main{
	
	Main mp;
	SignOnPage sp;
	HomePage hp;
	LoginSuccessPage lp;
	
	
	@BeforeTest (alwaysRun=true)
	public void inlBeforeTest() {
		mp=new Main();
		sp=new SignOnPage();
		hp = new HomePage();
		lp = new LoginSuccessPage();
		
		mp.initialization();
	}
	
	@AfterTest (alwaysRun=true)
	public void finalAfterTest() {
		mp.closeDown();
		
	}
	
	
	@BeforeMethod
	public void beforeSignOnPgMethod() {
		mp.spInitial();
	}
	
	@AfterMethod
	public void afterSignOnPgMethod() {
		
	}
	
	@Test (priority=1)
	public void usernameDisplayTest() {
		Assert.assertTrue(sp.usernameDisplayFn());
	}
	
	@Test (priority=1)
	public void usernameEnabledTest() {
		Assert.assertTrue(sp.usernameEnabledFn());
	}

	@Test (priority=1)
	public void passwordDisplayTest() {
		Assert.assertTrue(sp.passwordDisplayFn());
	}
	
	@Test (priority=1)
	public void passwordEnabledTest() {
		Assert.assertTrue(sp.passwordEnabledFn());
	}
	
	
	@Test (priority=1)
	public void submitDisplayTest() {
		Assert.assertTrue(sp.submitDisplayFn());
	}
	
	@Test (priority=1)
	public void sbmitEnabledTest() {
		Assert.assertTrue(sp.submitEnabledFn());
	}
	

	@Test (priority=2, dataProvider ="signOnPageUsernamesPositive")
	public void usernamePasswordTextEntryPositiveTest(String usernameText, String passwordText) {
		sp.usernameTextEntry(usernameText);
		sp.passwordTextEntry(passwordText);
		sp.submitButtonClick();
		Assert.assertEquals(lp.validateSignOnFunction(),props.getProperty("signOnPageValidate"));
		
	}
	
	@Test (priority=2, dataProvider ="signOnPageUsernamesNegative")
	public void usernamePasswordTextEntryNegativeTest(String usernameText, String passwordText) {
		sp.usernameTextEntry(usernameText);
		sp.passwordTextEntry(passwordText);
		sp.submitButtonClick();
		Assert.assertEquals(sp.wrongEntryMessageFn(),props.getProperty("signOnWrongMessage"));
		
	}
	
	
	@Test (enabled=false,priority=3)
	public void submitClick() {
		sp.submitButtonClick();
	}
	
	
	@Test (enabled=false,priority =4)
	public void signOnPageValidateTest() {
		Assert.assertEquals(lp.validateSignOnFunction(),"Login: Mercury Tours");
	}
	
	
	@DataProvider (name ="signOnPageUsernamesPositive")
	public Object[][]getSignOnPageUserNamePositive(){
		return new Object[][]{
				{"spUser11","spPassword11"},{"spUser12","spPassword12"},
				{"spUser13","spPassword13"},{"spUser12","spPassword12"}
	};
	
	}
	
	@DataProvider (name ="signOnPageUsernamesNegative")
	public Object[][]getSignOnPageUserNameNegative(){
		return new Object[][]{
				{"spUser15","spPassword15"},{"spUser16","spPassword16"},{"spUser14","spPassword14"},
				{"spUser16","spPassword16"},{"spUser17","spPassword17"},{"spUser14","spPassword14"}
	};
	
	}
	
	
}

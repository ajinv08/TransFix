package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Main;
import pageFactory.HomePage;

public class HomePageTest extends Main {
	Main mp = new Main();
	HomePage hp = new HomePage();
	
@BeforeTest
public void beforeTestProcess() {
	mp.homePageInitialization();
	}

@AfterTest
public void afterTestCloseDown() {
	mp.testCloseDown();
}
	
@BeforeMethod
public void hpBeforeMethodProcess() {
	
}

@AfterMethod
public void hpAfterMethodProcess() {
	
}

@Test
public void hpUserNameEntryTest() {
	hp.userNameTextEntry();
}

@Test
public void hpPasswordEntryTest() {
	hp.passwordEntry();
}

@Test
public void hpSubmitBtnClickTest() {
	hp.submitBtnClick();
}
@Test
public void hpNegativeEntryTest() {
	Assert.assertEquals(hp.alertMessageValidation(),"Enter your userName and password correct");
	
}
}

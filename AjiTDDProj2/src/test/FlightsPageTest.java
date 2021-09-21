package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Main;
import pageFactory.FlightsPage;


public class FlightsPageTest extends Main {
	
	Main mp ;
	FlightsPage fsp;
	
		
	@BeforeTest
	public void testCurtainRaiser() {
		mp =new Main();
		fsp =new FlightsPage();
		mp.testInitialProcess();
	}
	
	@AfterTest
	public void testOver() {
		mp.testTearDownProcess();
	}
	
	@BeforeMethod
	public void flightsPageInitial() {
		mp.fpInitial();
	}
	
	@AfterMethod
	public void flightsPageCloseDown() {
		
	}
	
	
	@Test (priority =1)
	public void roundTripDisplayEnableTest() {
		Assert.assertTrue(fsp.roundTripDisplayed());
		Assert.assertTrue(fsp.roundTripEnabled());
	}
	
	@Test (priority=1)
	public void oneWayTripDisplayEnableTest() {
		Assert.assertTrue(fsp.oneWayTripDisplayed());
		Assert.assertTrue(fsp.oneWayTripEnabled());
		}
	
	@Test (priority=1)
	public void roundTripSelectedTest() {
		Assert.assertEquals(fsp.roundTripSelected(),"Round Trip");
	}
	
	@Test (priority=1)
	public void oneWayTripSelectedTest() {
		Assert.assertEquals(fsp.oneWayTripSelected(),"One Way");
	}
	

	

}

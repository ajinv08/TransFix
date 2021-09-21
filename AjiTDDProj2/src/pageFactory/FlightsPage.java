package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Main;

public class FlightsPage extends Main {
	
	
	//1. Web Elements in this page are declared
	@FindBy (xpath ="//input[@type='radio'][@value='roundtrip']")
	WebElement tripTypeRound;
	@FindBy (xpath="//input[@type='radio'][@value='oneway']")
	WebElement tripTypeOneWay;
	@FindBy (xpath="//select[@name='passCount']")
	WebElement passCount;
	@FindBy (xpath="//select[@name='fromPort']")
	WebElement departingPort;
	@FindBy (xpath="//select[@name='fromMonth']")
	WebElement departingMonth;
	@FindBy (xpath="//select[@name='fromDay']")
	WebElement departingDate;
	
	@FindBy (xpath="//select[@name='toPort']")
	WebElement arrivingPort;
	@FindBy (xpath="//select[@name='toMonth']")
	WebElement returningMonth;
	@FindBy (xpath="//select[@name='toDay']")
	WebElement returningDate;
	@FindBy (xpath="//input[@type='radio'][@value='Coach']")
	WebElement economyClass;
	@FindBy (xpath="//input[@type='radio'][@value='Business']")
	WebElement businessClass;
	@FindBy (xpath="//input[@type='radio'][@value='First']")
	WebElement firstClass;
	@FindBy (xpath="//select[@name='airline']")
	WebElement airline;
	@FindBy (xpath="//input[@name='findFlights']")
	WebElement continueButton;
	

//2. initialize the web elements to driver
	public FlightsPage() {
	PageFactory.initElements(drives, this);
	}
	
	Select selePassCount = new Select(passCount);
	Select seleDepartingPort = new Select(departingPort);
	Select seleDepartingMonth = new Select(departingMonth);
	Select seleDepartingDate = new Select(departingDate);
	
	Select seleArrivingPort = new Select(arrivingPort);
	Select seleReturningMonth = new Select(returningMonth);
	Select seleReturningDate = new Select(returningDate);
	Select seleAirline = new Select(airline);
	
//3. define all functions of the web elements
	
	public void economyClassSelected() {
		
		economyClass.click();
	}
	
	public void businessClassSelected() {
		PageFactory.initElements(drives, this);
		businessClass.click();
	}
	
	public void firstClassSelected() {
		PageFactory.initElements(drives, this);
		firstClass.click();
	}
	
	public void continueButtonSelected() {
		PageFactory.initElements(drives, this);
		continueButton.click();
	}
	
	
	public void arrivingPortEntry (String arrivingPortText) {
		PageFactory.initElements(drives, this);
		seleArrivingPort.selectByValue(arrivingPortText);
	}
	public void returningMonthEntry (String returningMonthText) {
		PageFactory.initElements(drives, this);
		seleReturningMonth.selectByValue(returningMonthText);
	}
	public void returningDateEntry (String returningDateText) {
		PageFactory.initElements(drives, this);
		seleReturningDate.selectByValue(returningDateText);
	}
	public void airlineEntry (String airlineText) {
		PageFactory.initElements(drives, this);
		seleAirline.selectByValue(airlineText);
	}
	public void departingDateEntry (String departingDateText) {
		PageFactory.initElements(drives, this);
		seleDepartingDate.selectByValue(departingDateText);
	}
	
	public void departingMonthEntry (String departingMonthText) {
		PageFactory.initElements(drives, this);
		seleDepartingMonth.selectByValue(departingMonthText);
	}
	
	public void departingPortEntry(String departingPortText) {
		PageFactory.initElements(drives, this);
		seleDepartingPort.selectByValue(departingPortText);
	}
	
	
	public boolean passCountEnabled() {
		PageFactory.initElements(drives, this);
		return passCount.isEnabled();
	}
	
	
	public void passCountEntry(String passCountText) {
		PageFactory.initElements(drives, this);
		selePassCount.selectByValue(passCountText);
	}
	
	

	public boolean roundTripDisplayed() {
		PageFactory.initElements(drives, this);
		return tripTypeRound.isDisplayed();
	}

	public boolean roundTripEnabled() {
		PageFactory.initElements(drives, this);
		return tripTypeRound.isEnabled();
	}

	public String roundTripSelected() {
		PageFactory.initElements(drives, this);
		tripTypeRound.click();
		return tripTypeRound.getText();
	}

	public boolean oneWayTripDisplayed() {
		PageFactory.initElements(drives, this);
		return tripTypeOneWay.isDisplayed();
	}

	public boolean oneWayTripEnabled() {
		PageFactory.initElements(drives, this);
		return tripTypeOneWay.isEnabled();
	}

	public String oneWayTripSelected() {
		PageFactory.initElements(drives, this);
		tripTypeOneWay.click();
		return tripTypeOneWay.getText();
	}


}

	



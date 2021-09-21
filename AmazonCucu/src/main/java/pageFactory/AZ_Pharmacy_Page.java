package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.Main;

public class AZ_Pharmacy_Page extends Main {
	
	//web element
//	@FindBy (xpath="//a[text()='Pharmacy']")
	@FindBy (xpath="//a[contains(@href,'nav_cs_pharmacy')]")
	WebElement hp_PharmacyLink;
	
	
	//initialize
	public AZ_Pharmacy_Page() {
		PageFactory.initElements(drives, this);
	}
	//web function
	public void hp_PharmacyLinkClick() {
		hp_PharmacyLink.click();
	}
}

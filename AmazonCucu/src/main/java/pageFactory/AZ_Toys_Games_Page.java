package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.Main;

public class AZ_Toys_Games_Page extends Main {

	//Web Elements
	//@FindBy (xpath="//a[contains(@href,'nav_cs_toys')]")
	//@FindBy(linkText="Toys & Games")
	@FindBy (xpath="//a[contains(text(),'Toys & Games')]")
	WebElement hp_Toys_Games_Link;
	
	@FindBy (xpath="//a[contains(@aria-label, '2 to 4 Years')]")
	WebElement tgp_2to4Yrs;
	@FindBy (xpath="//a[contains(@aria-label, 'Birth to 24 Months')]")
	WebElement tgp_birth22Yrs;
	
	
	//Initialize
	public AZ_Toys_Games_Page() {
		PageFactory.initElements(drives, this);
	}
	
	//Web Functions
	
	
	public void hp_Toys_Games_LinkTest() {
		hp_Toys_Games_Link.click();
	}
	
	public void tgp_ToysByAgeLinkTest(String tgp_AgeOption) {
		if (tgp_AgeOption.equals("2 to 4 Years")) {
		tgp_2to4Yrs.click();
		}else if (tgp_AgeOption.equals("Birth to 24 Months")) {
		tgp_birth22Yrs.click();
		}
		}
	
	
}

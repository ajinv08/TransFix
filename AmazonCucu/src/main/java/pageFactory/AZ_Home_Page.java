package pageFactory;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basic.Main;


public class AZ_Home_Page extends Main {
	
	public String searchText = "\"Let me try Cucumber\"";
	
	Actions mkAction = new Actions(drives);
	
	
	//web elements
	@FindBy (id="twotabsearchtextbox")
	WebElement searchTextField;	 
	
	@FindBy (id="nav-search-submit-button")
	WebElement hp_searchButton ;
	
	@FindBy (xpath="//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span[3]")
	WebElement hp_searchResult;
	
	@FindBy (linkText="Customer Service")
	WebElement customerServiceLink;
	
	@FindBy (xpath="//div[@id='nav-search-dropdown-card']/div/select")
	WebElement deptDropDownList;
	
//	@FindBy (xpath="//select[@id='searchDropdownBox']")
//	WebElement deptDropDownList2;
	
	@FindBy (xpath="//div[@class='nav-search-scope nav-sprite']")
	WebElement deptNameDisplay;
	
	//initialization
	
	public AZ_Home_Page() {
		
		PageFactory.initElements(drives, this);
	}
	
	//web functions
	public void searchTextEntry() {
			
	searchTextField.sendKeys(searchText);
	}
	
	public void searchButtonClick() {
		
		hp_searchButton.click();	
	}
	
	public String searchResult() {
		
		return hp_searchResult.getText().toString();
	}
	
	public void customerServiceLinkClick() {
		
		customerServiceLink.click();
	}
	
	public void deptDropDownSelect() {
		deptDropDownList.click();
	}
	
	public void enterButtonforSearch() {
		mkAction.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void deptDropDownIndexInput(String deptIndex) {
		Select selDept = new Select(deptDropDownList);
		selDept.selectByIndex(Integer.parseInt(deptIndex));
	}
	
	public String deptNameDisplay() {
		return deptNameDisplay.getText();
	}
}

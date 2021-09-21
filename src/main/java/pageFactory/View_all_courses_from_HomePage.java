package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class View_all_courses_from_HomePage extends Main {
	
	
	Actions act = new Actions(drives);
	//web elements
	
	@FindBy(xpath="//h4/a[text()='Data Analytics & Visualization'][@tabindex='0']")
	public WebElement hpDataAnalytics_Visualization;
	
	@FindBy(xpath="//h4/a[text()='Full Stack QA Engineering'][@tabindex='0']")
	public WebElement hpFullStackQaEngineering;
	
	@FindBy(xpath="//h4/a[text()='Business Analyst'][@tabindex='0']")
	public WebElement hpBusinessAnalyst;
	
	@FindBy(xpath="//h4/a[text()='Cyber Security Professional'][@tabindex='0']")
	public WebElement hpCyberSecurityProfessional;
	
	@FindBy(xpath="//div/h2[text()='Courses We Offer']")
	public WebElement hpCoursesWeOffer;

	@FindBy(xpath="//strong/u[text()='Explore all Courses']")
	public WebElement hpExploreAllCoursesLink;
	
	@FindBy(xpath="//h4/a[text()='Cloud Engineering']")
	public WebElement hpCloudEngineering;
	
	//initialize
	
	public View_all_courses_from_HomePage() {
		PageFactory.initElements(drives, this);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//web element functions
	public void pagedownfivetimes() {
		act.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean hpFullStackQaEngineering_display() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hpFullStackQaEngineering.isDisplayed();
	}
	
	public boolean hpDataAnalytics_Visualization_display() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hpDataAnalytics_Visualization.isDisplayed();
	}
	
	public boolean hpBusinessAnalyst_display() {
		
		return hpBusinessAnalyst.isDisplayed();
	}
	public boolean hpCyberSecurityProfessional_display() {
		
		return hpCyberSecurityProfessional.isDisplayed();
	}
	public boolean hpCloudEngineering_display() {
		
		return hpCloudEngineering.isDisplayed();
	}
	
	
	public boolean hpExploreAllCoursesLink_enabled() {
		
		return hpExploreAllCoursesLink.isEnabled();
	}
	
	
	public void hpCourseSelection(String course) {
		
		if (course.equals("Data Analytics & Visualization")) {
			hpDataAnalytics_Visualization.click();
		}
		else if (course.equals("Cyber Security Professional")) {
			hpCyberSecurityProfessional.click();
		}
		else if (course.equals("Full Stack QA Engineering")) {
			hpFullStackQaEngineering.click();
		}
		else if (course.equals("Business Analyst")) {
			hpBusinessAnalyst.click();
		}
		else if (course.equals("Cloud Engineering")) {
			
		}
						
	}
	
	public void hpExploreAllCoursesLink_Click() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hpExploreAllCoursesLink.click();
	}
	
	
	
	
	
}

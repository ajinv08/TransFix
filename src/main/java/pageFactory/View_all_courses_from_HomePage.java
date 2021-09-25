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

//	@FindBy(xpath="//h4/a[contains(text(),'Data Analytics & Visualization')]")
	@FindBy(xpath="//h4/a[text()='Data Analytics & Visualization'][@tabindex='0']")
	public WebElement hpDataAnalytics_Visualization;

//	@FindBy(xpath="//h4/a[contains(text(),'Full Stack QA Engineering')]")
	@FindBy(xpath="//h4/a[text()='Full Stack QA Engineering'][@tabindex='0']")
	public WebElement hpFullStackQaEngineering;

//	@FindBy(xpath="//h4/a[contains(text(),'Business Analyst')]")
	@FindBy(xpath="//h4/a[text()='Business Analyst'][@tabindex='0']")
	public WebElement hpBusinessAnalyst;

//	@FindBy(xpath="//h4/a[contains(text(),'Cyber Security Professional')]")
	@FindBy(xpath="//h4/a[text()='Cyber Security Professional'][@tabindex='0']")
	public WebElement hpCyberSecurityProfessional;
	
	@FindBy(xpath="//div/h2[text()='Courses We Offer']")
	public WebElement hpCoursesWeOffer;

	@FindBy(xpath="//strong/u[text()='Explore all Courses']")
	public WebElement hpExploreAllCoursesLink;

//	@FindBy(xpath="//h4/a[contains(text(),'Cloud Engineering')]")
	@FindBy(xpath="//h4/a[text()='Cloud Engineering']")
	public WebElement hpCloudEngineering;
	
	@FindBy(xpath="//h4/a[contains(text(),'Data Analytics & Visualization')]")
//	@FindBy(xpath="//h4/a[text()='Data Analytics & Visualization']")
	public WebElement hpDataAnalytics_Visualization_inall_course;

	@FindBy(xpath="//h4/a[contains(text(),'Full Stack QA Engineering')]")
//	@FindBy(xpath="//h4/a[text()='Full Stack QA Engineering']")
	public WebElement hpFullStackQaEngineering_inall_course;

	@FindBy(xpath="//h4/a[contains(text(),'Cloud Engineering')]")
//	@FindBy(xpath="//h4/a[text()='Cloud Engineering']")
	public WebElement hpCloudEngineering_inall_course;

	@FindBy(xpath="//h4/a[contains(text(),'Business Analyst')]")
//	@FindBy(xpath="//h4/a[text()='Business Analyst']")
	public WebElement hpBusinessAnalyst_inall_course;

	@FindBy(xpath="//h4/a[contains(text(),'Cyber Security Professional')]")
//	@FindBy(xpath="//h4/a[text()='Cyber Security Professional']")
	public WebElement hpCyberSecurityProfessional_inall_course;
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
	
	public void pagedownOnetime() {
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
		
	public boolean hpCloudEngineering_inall_course_display() {
		pagedownOnetime();
		return hpCloudEngineering_inall_course.isDisplayed();
	}
	public boolean hpFullStackQaEngineering_inall_course_display() {
		pagedownOnetime();
		return hpFullStackQaEngineering_inall_course.isDisplayed();
	}
	
	public boolean hpDataAnalytics_Visualization_inall_course_display() {
		pagedownOnetime();
		return hpDataAnalytics_Visualization_inall_course.isDisplayed();
	}
	
	public boolean hpBusinessAnalyst_inall_course_display() {
		pagedownOnetime();
		return hpBusinessAnalyst_inall_course.isDisplayed();
	}
	
	public boolean hpCyberSecurityProfessional_inall_course_display() {
		pagedownOnetime();
		return hpCyberSecurityProfessional_inall_course.isDisplayed();
	}
	
	
	
	
	public boolean hpFullStackQaEngineering_display() {
		
		try {
			Thread.sleep(3000);
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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hpBusinessAnalyst.isDisplayed();
	}
	public boolean hpCyberSecurityProfessional_display() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hpCyberSecurityProfessional.isDisplayed();
	}
	public boolean hpCloudEngineering_display() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hpCloudEngineering.isDisplayed();
	}
	
	
	public boolean hpExploreAllCoursesLink_enabled() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hpExploreAllCoursesLink.isEnabled();
	}
	
	
	public void hpCourseSelection(String course) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
				hpCloudEngineering.click();
			}
		 
	}
	
public void hpCourseSelection_inall_course(String course) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			if (course.equals("Data Analytics & Visualization")) {
				hpDataAnalytics_Visualization_inall_course.click();
			}
			else if (course.equals("Cyber Security Professional")) {
				hpCyberSecurityProfessional_inall_course.click();
			}
			else if (course.equals("Full Stack QA Engineering")) {
				hpFullStackQaEngineering_inall_course.click();
			}
			else if (course.equals("Business Analyst")) {
				hpBusinessAnalyst_inall_course.click();
			}
			else if (course.equals("Cloud Engineering")) {
				hpCloudEngineering_inall_course.click();
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

package pageFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Main;

public class Courses extends Main{

	//general variable if any
	
	
	Select sele;
	Actions act = new Actions(drives);
	
	// web elements
	
	@FindBy(xpath=("//ul/li[@id='menu-item-3850']"))
	public WebElement courselink;
	
	
	@FindBy(xpath=("//ul/li[@id='menu-item-4825']"))
	//@FindBy(linkText="Data Analytics & Visualization")
	public WebElement data_analytic_course;

	@FindBy(xpath=("//ul/li[@id='menu-item-4826']"))
	//@FindBy(linkText="Cyber Security Professional")
	public WebElement cyber_security_course;
	
	
	@FindBy(xpath=("//ul/li[@id='menu-item-4822']"))
	//@FindBy(linkText="Full Stack QA Engineering")
	public WebElement qa_engineer_course;
	

	@FindBy(xpath=("//ul/li[@id='menu-item-4824']"))
	//@FindBy(linkText="Business Analyst")
	public WebElement business_analyst_course;
	

	@FindBy(xpath=("//ul/li[@id='menu-item-4827']"))
	//@FindBy(linkText="Cloud Engineering")
	public WebElement cloud_engineer_course;
	
	
	// initialization
	
	public Courses() {
			PageFactory.initElements(drives, this);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	//web element functions
	
	
	
	public void course_link_enabled_Test() {
		
		Assert.assertTrue(courselink.isEnabled());
	}
	
	public void course_link_click() {
		
		drives.navigate().refresh();
		act.moveToElement(courselink).build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void mouse_hover_course_link()  {
		
		act.moveToElement(courselink).build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void course_selection(String course)  {
		
		drives.navigate().refresh();
		act.moveToElement(courselink).build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			if (course.equals("Data Analytics & Visualization")) {
			act.moveToElement(data_analytic_course).click().build().perform();
		}
		else if (course.equals("Cyber Security Professional")) {
			act.moveToElement(cyber_security_course).click().build().perform();
		}
		else if (course.equals("Full Stack QA Engineering")) {
			act.moveToElement(qa_engineer_course).click().build().perform();
		}
		else if (course.equals("Business Analyst")) {
			act.moveToElement(business_analyst_course).click().build().perform();
		}
		else if (course.equals("Cloud Engineering")) {
			act.moveToElement(cloud_engineer_course).click().build().perform();
		}
		
				
				
	}
	
	public String url_page_display() {
		
		return drives.getCurrentUrl();
	}
	
	
	
}




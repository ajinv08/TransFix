package pageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Mains;
import io.cucumber.core.cli.Main;

public class Course extends Mains {

	Actions act = new Actions(driver);
	Select sele;
	
	//web elements
	
	@FindBy(id="menu-item-3850")
	public WebElement courselink;
	
	
	// driver initialization
	
	public Course() {
		PageFactory.initElements(driver, this);
		sele = new Select(courselink);
		
}
	
	
	//web elements functions
	
	
	public void course_link_enabled_Test() {
		Assert.assertTrue(courselink.isDisplayed());
	}
	
	
	public void course_link_click() {
		courselink.click();
	}
	
	public void mouse_hover_course_link() {
		act.moveToElement(courselink);
		
	}
	
	public void course_selection(String course) {
		sele.selectByValue(course);
	}
	
	public String url_page_display() {
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
	
}

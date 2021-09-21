package pageFactory;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Main;

public class Courses extends Main {

	//general variable if any
	
	
		Select sele;
		Actions act = new Actions(drives);
		
		// web elements
		
		@FindBy(id="menu-item-3850")
		WebElement courselink;
		
		
		
		
		
		// initialization
		
		public Courses() {
				PageFactory.initElements(drives, this);
				sele = new Select (courselink);
		}
				
		//web element functions
		
		public void course_link_enabled_Test() {
			Assert.assertTrue(courselink.isEnabled());
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
			return drives.getCurrentUrl();
		}
		
		
}

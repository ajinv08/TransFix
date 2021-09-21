package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



class WebElementAssignment_050521 {
	
	// declaring an array variable -to be accessed by registration n verification methods
	
	String we[][]= {
			
			{"FirstName1 Happy Test2","LastName1 Happy Test2","Telphone Happy Test2","email@email.com Happy Test2",
			"address Happy Test2","city Happy Test2","state Happy Test2","pcode Happy Test2",
			"India",
			"usernameemail@email.com Happy Test2","Password Happy Test2","Password Happy Test2"},
			
			{"FirstName1 Happy Test3","LastName1 Happy Test3","Telphone Happy Test3","email@email.com Happy Test3",
				"address Happy Test3","city Happy Test3","state Happy Test3","pcode Happy Test3",
				"Azerbaijan",
				"usernameemail@email.com Happy Test3","Password Happy Test3","Password Happy Test3"},
			
			{"FirstName1 Happy Test4","LastName1 Happy Test4","Telphone Happy Test4","email@email.com Happy Test4",
					"address Happy Test4","city Happy Test4","state Happy Test4","pcode Happy Test4",
					"China",
					"usernameemail@email.com Happy Test4","Password Happy Test4","Password Happy Test4"},
			};
	
	// - DECLARING A METHOD TO TEST THE REGN PAGE...
	
	static void regnMethd() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  // - maximize window
		Thread.sleep(5000);
		WebElementAssignment_050521 varInst = new WebElementAssignment_050521();
		
		for (int i=0;i<varInst.we.length;i++) {
				driver.get("http:/demo.guru99.com/test/newtours/index.php");
				driver.findElement(By.linkText("Home")).click();
				driver.findElement(By.linkText("REGISTER")).click();	
				
				driver.findElement(By.name("firstName")).sendKeys(varInst.we[i][0]);
				driver.findElement(By.name("lastName")).sendKeys(varInst.we[i][1]);
				driver.findElement(By.name("phone")).sendKeys(varInst.we[i][2]);
				driver.findElement(By.name("userName")).sendKeys(varInst.we[i][3]);
				driver.findElement(By.name("address1")).sendKeys(varInst.we[i][4]);
				driver.findElement(By.name("city")).sendKeys(varInst.we[i][5]);
				driver.findElement(By.xpath("//input[@maxlength='40'][@name='state']")).sendKeys(varInst.we[i][6]);
				driver.findElement(By.xpath("//input[@maxlength='20'][@name='postalCode']")).sendKeys(varInst.we[i][7]);
				
				Select sel3 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
				sel3.selectByValue(varInst.we[i][8].toUpperCase());
				
				
				driver.findElement(By.name("email")).sendKeys(varInst.we[i][9]);
				driver.findElement(By.name("password")).sendKeys(varInst.we[i][10]);
				driver.findElement(By.name("confirmPassword")).sendKeys(varInst.we[i][11]);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@name='submit'][@type='submit']")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Home")).click();
			}
		
		driver.close();
	}
		// verification method
		
		static void verifyRegn() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();  // - maximize window
			Thread.sleep(2000);	
			driver.get("http:/demo.guru99.com/test/newtours/index.php");
			WebElementAssignment_050521 varInst = new WebElementAssignment_050521();
			
				for (int i=0;i<varInst.we.length;i++) {
					Thread.sleep(2000);	
					driver.findElement(By.linkText("Home")).click();
					Thread.sleep(2000);	
					driver.findElement(By.linkText("SIGN-ON")).click();
					
					driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(varInst.we[i][9]);;
					driver.findElement(By.xpath("//input[@name='password']")).sendKeys(varInst.we[i][10]);;
					driver.findElement(By.xpath("//input[@name='submit']")).click();
					Thread.sleep(5000);	
				}
			driver.close();
		}
			
			// initial web elements -study purpose method
			
			static void inlMethod() throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver", "C:\\QA Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();  // - maximize window
				driver.get("http:/demo.guru99.com/test/newtours/index.php");
				Thread.sleep(1000);
				driver.findElement(By.linkText("Flights")).click();
				Thread.sleep(1000);
				WebElement elestore=driver.findElement(By.name("passCount"));
				Thread.sleep(1000);
				Select sel1= new Select(elestore);
				
				sel1.selectByIndex(3);
				Thread.sleep(1000);
				sel1.selectByValue("3");
				Thread.sleep(1000);
				sel1.selectByVisibleText("2");
				Thread.sleep(1000);
				
				driver.findElement(By.name("fromPort")).click();
				
				Select sel2 = new Select (driver.findElement(By.name("fromPort")));
				sel2.selectByIndex(1);
				Thread.sleep(1000);
				
				sel2.selectByValue("London");
				Thread.sleep(1000);
				sel2.selectByVisibleText("Portland");
				Thread.sleep(1000);
				
				
				
				driver.findElement(By.linkText("Home")).click();
				driver.findElement(By.linkText("REGISTER")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.name("firstName")).sendKeys("FirstName1 Happy Test1");
				driver.findElement(By.name("lastName")).sendKeys("LastName1 Happy Test1");
				driver.findElement(By.name("phone")).sendKeys("Telphone Happy Test1");
				driver.findElement(By.name("userName")).sendKeys("email@email.com Happy Test1");
				driver.findElement(By.name("address1")).sendKeys("Address Happy Test1");
				driver.findElement(By.name("city")).sendKeys("City Happy Test1");
				driver.findElement(By.xpath("//input[@maxlength='40'][@name='state']")).sendKeys("State/Province Happy Test1");
				driver.findElement(By.xpath("//input[@maxlength='20'][@name='postalCode']")).sendKeys("PostCode Happy Test1");
				
				Select sel3 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
				sel3.selectByIndex(2);
				Thread.sleep(1000);
				sel3.selectByIndex(4);
				Thread.sleep(1000);
				sel3.selectByIndex(2);
				sel3.selectByValue("INDIA");
				Thread.sleep(1000);
				
				driver.findElement(By.name("email")).sendKeys("usernameemail@email.com Happy Test1");
				driver.findElement(By.name("password")).sendKeys("Password Happy Test1");
				driver.findElement(By.name("confirmPassword")).sendKeys("Password Happy Test1");
				driver.findElement(By.xpath("//input[@name='submit'][@type='submit']")).click();
				Thread.sleep(1000);
				driver.close();
			}
			
			
	

	public static void main(String[] args) throws InterruptedException {
//		
		
		// calling the initial miscellaneous method
		
		inlMethod();
		
		// CALLING THE ADDITIONAL TEST METHOD
		
		regnMethd();
		
		
		// calling the verification method
		
		verifyRegn();
		

	}

}

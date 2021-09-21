package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterization {

WebDriver drives;

@Parameters ({"chromeKey","QaEnvUrl","chromePath"})
	
	
@BeforeTest (alwaysRun=true)
public void initializationTest(String key ,String url, String path) {
	
	
	System.setProperty(key, path);
	drives = new ChromeDriver();
	drives.get(url);

}

@AfterTest (alwaysRun=true)
public void finalClosure() {
	drives.close();
}


@BeforeMethod (alwaysRun=true)
public void befMethod() {
	//code later

}

@AfterMethod (alwaysRun=true)
public void aftMethod() {
	//code later

}



//1. Test to see how the parameterization + data provider works
@Test (timeOut=5000, groups= {"Reg-Aji-Self-Data"}, dataProvider = "demoSignInNegativeData")
public void simpleCheckSelfData(String loginUserName, String loginPassword) throws IOException {
	
	drives.findElement(By.name("userName")).sendKeys(loginUserName);
	drives.findElement(By.name("password")).sendKeys(loginPassword);
	WebElement negativeMessage = drives.findElement(By.xpath("//table[@width='100%']/tbody/tr[2]/td[2]/span"));
	//System.out.println(loginUserName + " plus result "+negativeMessage.getText());
	//File screenShotNegativeMsg = negativeMessage.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(screenShotNegativeMsg, new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\demoScrnShot.png"));
	Assert.assertTrue(negativeMessage.isDisplayed());
	
}

//2. Test to see how the parameterization + data provider works
@Test (timeOut=5000, groups= {"Regression-Minor"}, dataProvider = "demoSignInNegativeData")
public void simpleCheckRegression(String loginUserName, String loginPassword) throws IOException {
	
	drives.findElement(By.name("userName")).sendKeys(loginUserName);
	drives.findElement(By.name("password")).sendKeys(loginPassword);
	WebElement negativeMessage = drives.findElement(By.xpath("//table[@width='100%']/tbody/tr[2]/td[2]/span"));
	//System.out.println(loginUserName + " plus result "+negativeMessage.getText());
	//File screenShotNegativeMsg = negativeMessage.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(screenShotNegativeMsg, new File("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\testNG\\demoScrnShot.png"));
	Assert.assertTrue(negativeMessage.isDisplayed());
	
}

@DataProvider(name= "demoSignInNegativeData")
public Object[][] demoNegativeData(){
	return new Object[][] {
		{"wrongUserName1","wrongPassword1"},{"wrongUserName2","wrongPassword2"},
		{"wrongUserName3","wrongPassword3"},{"wrongUserName4","wrongPassword4"},
		{"wrongUserName5","wrongPassword5"},{"wrongUserName6","wrongPassword6"},
		{"wrongUserName11","wrongPassword11"},{"wrongUserName21","wrongPassword21"},
		{"wrongUserName31","wrongPassword31"},{"wrongUserName41","wrongPassword41"},
		{"wrongUserName51","wrongPassword51"},{"wrongUserName61","wrongPassword61"}
	};
}

	


	
}

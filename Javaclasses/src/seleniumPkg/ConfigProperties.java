package seleniumPkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigProperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties props = new Properties();
		FileInputStream fiss = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\seleniumPkg\\configaji.properties");
		props.load(fiss);
		
		System.setProperty(props.getProperty("chromeKeya"),props.getProperty("chromePatha"));
		WebDriver drives = new ChromeDriver();
		drives.get(props.getProperty("qaUrla"));
		drives.findElement(By.id("onlineId1")).sendKeys(props.getProperty("onlineidInput"));
		
		Thread.sleep(5000);
		drives.close();
		
		
		
	}

}

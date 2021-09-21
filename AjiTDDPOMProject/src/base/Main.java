package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static Properties props;
	public static WebDriver drives;
	
	// Lets have a constructor to initialize the config.properties file
	public Main()  {
		
		props = new Properties();
		FileInputStream fis;
		
			try {
				fis = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\AjiTDDPOMProject\\src\\properties\\config.properties");
				props.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	        }
	
	// lets have method to initialize the test - like setting system property & browsers etc.
	
	public void initialization() {
		
		System.setProperty(props.getProperty("chromeKey"), props.getProperty("chromePath"));
		drives = new ChromeDriver();
		drives.get(props.getProperty("qaEnvUrl"));
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drives.manage().window().maximize();
	}
	
	//lets have a method to close the test process
	
	public void closeDown() {
		drives.close();
		
	}
	
	// the method to take to sign on page - before each method
	
	public void spInitial()	{
		drives.get("http://demo.guru99.com/test/newtours/login.php");
	}
	
	
	
	
	
	
	
	
}

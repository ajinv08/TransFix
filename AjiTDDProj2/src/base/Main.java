package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static WebDriver drives;
	public static Properties props;
	
	public Main(){
		
		props = new Properties();
		try {
			props.load(new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\AjiTDDProj2\\src\\properties\\config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
					
	}
		
	public void testInitialProcess() {
		System.setProperty(props.getProperty("chromeKey"), props.getProperty("chromePath"));
		drives = new ChromeDriver();
		drives.get(props.getProperty("qaEnvUrl"));
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drives.manage().window().maximize();

	}
	
	
	public void testTearDownProcess() {
		drives.quit();
	}
	
	
	public void fpInitial() {
		drives.get("http://demo.guru99.com/test/newtours/reservation.php");
	}
	
	
	
	
	
	}


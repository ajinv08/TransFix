package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
	
	public static WebDriver drives;
	public static Properties props;
	public static FileInputStream fis;
	

	public Main() {
		props = new Properties();
			
		try {
			fis = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\TransFix\\src\\main\\java\\properties\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			props.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
//		System.setProperty(props.getProperty("chromeKey"), props.getProperty("chromePath"));
//		drives = new ChromeDriver();
//		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		drives.manage().window().maximize();
//		drives.get(props.getProperty("UATurl"));
		
	}

	public void propInitialization() {
		System.setProperty(props.getProperty("chromeKey"), props.getProperty("chromePath"));
		drives = new ChromeDriver();
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drives.manage().window().maximize();
	}
	
	public void trn_HomePage_Initialization() {
		drives.get(props.getProperty("UATurl"));
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void tearDown() {
		drives.close();
		
	}
	
}

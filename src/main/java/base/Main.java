package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static WebDriver drives;
	public static Properties props;
	public static FileInputStream fis;

	public Main() {
		props = new Properties();
		fis = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\TransFix-Aji\\src\\main\\java\\properties\\Config.properties")
		
//		try {
//			fis = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\TransFix-Aji\\src\\main\\java\\properties\\Config.properties");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			props.load(fis);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    
		System.setProperty(props.getProperty("chromeKey"), props.getProperty("chromePath"));
		drives = new ChromeDriver();
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drives.manage().window().fullscreen();
	}

	
	public void trn_HomePage_Initialization() {
		drives.get(props.getProperty("UATurl"));
	}
	
	public void tearDown() {
		drives.close();
	}
	
}
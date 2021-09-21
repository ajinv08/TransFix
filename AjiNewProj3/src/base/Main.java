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
	FileInputStream fis;
	public Main() {
		
			
		try {
			props=new Properties();
			fis = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\AjiNewProj3\\src\\properties\\config.properties");
			try {
				props.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void mainInitial() {
		
		System.setProperty(props.getProperty("chromeKey"),props.getProperty("chromePath") );
		drives = new ChromeDriver();
		drives.manage().window().fullscreen();
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drives.get(props.getProperty("qaEnvUrl"));		
		
	}
	
	
	public void finalClose() {
		drives.close();
	}
	
}

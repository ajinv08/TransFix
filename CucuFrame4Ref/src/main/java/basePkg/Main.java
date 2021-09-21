package basePkg;

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
		
		try {
			fis = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\CucuFrame4Ref\\src\\main\\java\\projVariables\\config.properties");
			props.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.setProperty(props.getProperty("chromeKey"), "chromePath");
		drives = new ChromeDriver();
		drives.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drives.manage().window().fullscreen();
		drives.get("qaOpenUrl");
	}

	public void openPageInitialization() {
		drives.get("qaOpenUrl");
	}
	
	public void closeBrowser() {
		drives.close();
	}
}

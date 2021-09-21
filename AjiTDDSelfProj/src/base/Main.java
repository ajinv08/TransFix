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
	public static FileInputStream fis;
	public static Properties props;
	
public Main() {
		
	try {
		props = new Properties();
		fis = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\AjiTDDSelfProj\\src\\properties\\config.properties");
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
	
	System.setProperty(props.getProperty("chromeKey"), props.getProperty("chromePath"));
	drives=new ChromeDriver();
	drives.get(props.getProperty("qaUrl"));
	drives.manage().window().fullscreen();
	drives.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
public void homePageInitialization() {
	drives.get(props.getProperty("qaUrl"));
}

public void testCloseDown() {
	drives.close();
}

}

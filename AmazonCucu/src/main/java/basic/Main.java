package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public  WebDriver drives;
	public static FileInputStream fis;
	public static Properties props;
	
	public Main()  {
		props = new Properties();
		try {
			fis=new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\AmazonCucu\\src\\main\\java\\properties\\Config.properties");
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
		drives = new ChromeDriver();
	    drives.manage().window().fullscreen();
		drives.manage().window().maximize();
		drives.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}
	
	public void az_Home_Page_Initialization() {
		drives.get(props.getProperty("az_HomePage"));
	}

	
	public void tearDown() {
		//drives.manage().deleteAllCookies();
		//drives.close();
		
		
	}
	
	
	
	
	
	
}

package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mains {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fiss;
	
		public Mains() {
			prop = new Properties();
			
				try {
					fiss = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\TransFixProj\\src\\main\\java\\properties\\Configure.properties");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					prop.load(fiss);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.setProperty(prop.getProperty("chrome_key"), prop.getProperty("chrome_path"));
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().fullscreen();
					
		}
	

		public void HomePage_Initialization() {
			driver.get(prop.getProperty("uaturl"));
		}
		
		public void browserClose() {
			driver.close();
		}


}
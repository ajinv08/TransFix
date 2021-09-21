package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Main {

	public static WebDriver drives;
	public static FileInputStream fis;
	public static Properties props = new Properties();
	
	public Main(){
		try {
			fis = new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\CucuTry6\\src\\main\\java\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		props = new Properties();
		
		
		
	}
	
	
	
	
}

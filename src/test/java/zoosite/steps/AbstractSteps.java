package zoosite.steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AbstractSteps {
	
	protected static WebDriver browser;
	protected Properties prop = new Properties();
	protected FileInputStream fis;
	
	public WebDriver getDriver(){
		
		if (browser==null){
			System.setProperty("webdriver.chrome.driver" ,System.getProperty("user.dir") +"/chromedriver.exe");
			   browser = new ChromeDriver();
			   browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   System.out.println("Browser initiated");
		}
		return browser;
		
	}
	
	public void closeBrowser(){
		browser.quit();
	}
	
	public Properties getProp(){
			
			try {
				fis = new FileInputStream("C:\\Users\\Satish Kamat\\workspace1\\Zoosite\\src\\test\\java\\zoosite\\util\\data.properties");
				prop.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return prop;
	}

}

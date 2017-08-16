package zoosite.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import zoosite.pageelements.AdoptionFailPageLocators;
import zoosite.util.Base;

public class AdoptionFailPage extends Base{
	
	Properties prop;

	public AdoptionFailPage(WebDriver browser, Properties prop) {
		super(browser);
		this.prop = prop;
	}
	
	
	public String getFailMessage(){
		return browser.findElement(AdoptionFailPageLocators.failMessage).getText();
		}
}

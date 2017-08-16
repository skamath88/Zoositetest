package zoosite.util;

import org.openqa.selenium.WebDriver;

public class Base {
	
	protected WebDriver browser;
	
	public Base(WebDriver browser){
		this.browser=browser;
	}

}

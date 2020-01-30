package com.xpath;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoXpath {
	
	
@Test
public void test() {
	String exePath ="C:\\Users\\Jagadeesh\\Desktop\\RAJI PERSONAL\\workspace2020\\com.xpath\\target\\chromedriver.exe";
			
			
			// "F:\\DESKTOP 20\\RAJI PERSONAL\\workspace2020\\webElementHandling\\Driver\\chromedriver.exe";
			
	 System.setProperty("webdriver.chrome.driver", exePath);
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://toolsqa.com");
	 
	 
	
}
	

}

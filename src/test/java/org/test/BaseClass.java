package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nadar\\eclipse-workspace\\SimpleTestNg\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		break;
		/*case "gecko":
			System.setProperty("webDriver.chrome.driver","C:\\Users\\nadar\\eclipse-workspace\\BaseClass\\driver\\chromedriver.exe");
			break;
		case "Ie":
			System.setProperty("webDriver.chrome.driver","C:\\Users\\nadar\\eclipse-workspace\\BaseClass\\driver\\chromedriver.exe");
			break;*/
		default:
			System.err.println("Invalid Browser Name");
		}
		}
		public static void launchUrl(String Url) {
			driver.get(Url);
 			driver.manage().window().maximize();
 			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
public static void fillTextBox(WebElement e,String value) {
	e.sendKeys(value);
}
public static void selectByvisiabletext(WebElement element,String text) {
	Select s=new Select(element);
	s.selectByVisibleText(text);
}
public static void selectByIndex(WebElement element,int Index) {
	Select s=new Select(element);
	s.selectByIndex(Index);
}
public static void btnClick(WebElement e) {
	e.click();
}
/*public void clear(WebElement textBox,String newText){
    textBox.clear();
    textBox.sendKeys(newText);
  }*/
public static String getAttribute(WebElement element) {
	return element.getAttribute("value");
}



}

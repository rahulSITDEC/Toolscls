package seleniumPrac1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlin {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaa.com/");
	Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
//    Set<String> windowHandles0 = driver.getWindowHandles();	
//    for (String string : windowHandles0) {
//		driver.switchTo().window(string);
//	}
//	driver.get("https://www.flipkart.com/");
//	act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
//    Set<String> windowHandles = driver.getWindowHandles();	
//    for (String string : windowHandles) {
//		driver.switchTo().window(string);
//	}
//	driver.get("https://www.spicejet.com/");
//	act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
//    Set<String> windowHandles1 = driver.getWindowHandles();	
//    for (String string : windowHandles1) {
//		driver.switchTo().window(string);
//	}
//	driver.get("https://www.indigo.com/");
//	act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
//    Set<String> windowHandles2 = driver.getWindowHandles();	
//    for (String string : windowHandles2) {
//		driver.switchTo().window(string);
//	}
//	driver.get("https://in.puma.com/in/en");
//	act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
//    Set<String> windowHandles3 = driver.getWindowHandles();	
//    for (String string : windowHandles3) {
//		driver.switchTo().window(string);
//	}
//	
//	driver.get("https://www.reeboksindia.com/");
//	act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
//    Set<String> windowHandles4 = driver.getWindowHandles();	
//    for (String string : windowHandles4) {
//		driver.switchTo().window(string);
//	}
//	
//	driver.get("https://www.reeboksindia.com/");
//	act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
//    Set<String> windowHandles5 = driver.getWindowHandles();	
//    for (String string : windowHandles5) {
//		driver.switchTo().window(string);
//	}
//	
//	driver.get("https://www.tatacliq.com/reebok/c-mbh13a00099/page-1");
//	
//	Thread.sleep(5000);
//	
//	
//	
//	
//	
//	driver.close();
}
}
package seleniumPrac1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkat_WH {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Actions fp= new Actions(driver);
		fp.contextClick(driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']"))).perform();
	    Robot r= new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    fp.contextClick(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(4000);
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> l=new LinkedList<String>(windowHandles);
	    int lastindex=l.size()-1;
	      for(int i=lastindex;i>=0;i--) {
	    	driver.switchTo().window(l.get(i));
	    	Thread.sleep(2000);
	    	driver.close();
	    	
	    }
	    
		
		
		
	}

}

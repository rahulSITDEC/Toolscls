package seleniumPrac1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown {
	       
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).click();
		keyboardinput("Caps Lock");
		keyboardinput("R");
		keyboardinput("A");
		keyboardinput("H");
		keyboardinput("U");
		keyboardinput("L");
		keyboardinput("Space");
		keyboardinput("K");
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		keyboardinput("S");
		keyboardinput("U");
		keyboardinput("C");
		keyboardinput("C");
		keyboardinput("E");
		keyboardinput("S");
		keyboardinput("K");
		
//		JavascriptExecutor j= (JavascriptExecutor)driver;
//		j.executeScript("window.scrollTo(webb)");
//		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Thread.sleep(5000);
//		Point webb = driver.findElement(By.xpath("//*[@id=\"ec175508-b07c-40f7-a09d-5dab28357145\"]/div[2]/div/ul/li[3]/span/a/img")).getLocation();
//		j.executeScript("aruguments[0].scrollIntoView();",webb);
//		j.executeScript("window.scrollBy(0,3000)');
/*		WebElement wee = driver.findElement(By.xpath("//a[text()='Become an Affiliate']"));
		j.executeScript("arguments[0].scrollIntoView()",wee);
*/		
    

    
     
     
     
		
		
	}
		
	 public static void keyboardinput(String key) throws AWTException {
		     Robot a=new Robot();
		     
			for (int i = 0; i < 65535; i++) {
			String s=KeyEvent.getKeyText(i);
			if(!(s.contains("Unknown keyCode: "))) {
			  if(s.equalsIgnoreCase(key)) {
				  a.keyPress(i);
				  a.keyRelease(i);
			  }
			}	
			}
	     
	     
	     }   
		
		
		
		
		
		
		
	}
	


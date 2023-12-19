package seleniumPrac1;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Selenium {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.findElement(By.xpath("(//a[text()='makeup'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		for (String string : windowHandles1) {
			driver.switchTo().window(string);
		}
		driver.findElement(By.xpath("//div[text()='Lipstick']")).click();		
		driver.findElement(By.xpath("(//div[@class='outline-wrapper'])[9]")).click();
		driver.findElement(By.xpath("(//div[text()='Maybelline New York Super Stay Matte Ink Liquid Lipstick - 2...'])[1]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string : windowHandles2) {
			driver.switchTo().window(string);
		}
		driver.findElement(By.xpath("(//button[@type='button'][@class=' css-13zjqg6'])[1]")).click();
		driver.findElement(By.xpath("//button[@type='button'][@class='css-aesrxy']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='css-acpm4k']")));
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		TakesScreenshot screen=(TakesScreenshot)driver;
		File file1 = screen.getScreenshotAs(OutputType.FILE);
		File file0= new File(System.getProperty("user.dir")+"\\Screenshots\\Addtocart.jpg");
		FileHandler.copy(file1, file0);
		driver.quit();
	}

}

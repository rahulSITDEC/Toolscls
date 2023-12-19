package seleniumPrac1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Particularrow_column {
	
	public static void main(String[] args) {
		int index=2;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus");
		System.out.println("please enter the column name to be printed");
		Scanner sc = new Scanner(System.in);
		String col = sc.next();
		int row = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr/td[2]")).size();
		int column=driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[1]/td")).size();
		List<WebElement> headerElements = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead"));
		for(int i=0; i<headerElements.size();i++) {
			if(headerElements.get(i).getText().equalsIgnoreCase(col)) {
				index=i+1;
			}
		}	
		List<WebElement> cntry = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr/td[2]"));
		System.out.println("The Required list is as below\n");
		for(int i=0;i<row;i++) {
		    
			String coll = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr["+i+"td["+index+"]")).getText();
//		  System.out.println(cntry.get(i).getText());
		  System.out.print("          "+coll);
		
		  Alert b = driver.switchTo().alert();
		  
		  
		}
		
		
		
		
	}
	
	

}

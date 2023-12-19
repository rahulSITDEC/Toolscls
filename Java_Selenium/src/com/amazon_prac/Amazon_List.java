package com.amazon_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_List {
	
	public static void main(String[] args) {
		
		int i=0;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("T Shirt for men");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> tprice = driver.findElements(By.xpath("//span[@class='a-price']/span/span[text()<'250']/parent::span/parent::span/following-sibling::div/span[2]/span[@aria-hidden='true']"));
		for (WebElement webElement : tprice) {
			
			System.out.println(i+1+".) "+webElement.getText());
			i++;
		}
          		
		
		
	}

}

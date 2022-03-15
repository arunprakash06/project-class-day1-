package org.product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.baseclass.BaseClass;

public class ProductList extends BaseClass {
	public static void main(String[] args) throws AWTException {
		
		chromeLaunch();
		maximize();
		implicityWait(10);
		urlLaunch("https://www.flipkart.com/");
		escape();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		sendKeys(search, "iphone");
		WebElement btnclick = driver.findElement(By.xpath("//button[@type='submit']"));
		click(btnclick);
		List<WebElement> products = driver.findElements(By.xpath(" //div[@class='_4rR01T']"));
        for (WebElement product : products) {
        	String text = product.getText();
        	System.out.println(text);
		}  
        List<WebElement> prices = driver.findElements(By.xpath(" //div[@class='_30jeq3 _1_WHN1']"));
        for (WebElement price : prices) {
        	String text = price.getText();
        	System.out.println(text);
		}  
        
      
      
		
	
				
			
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}

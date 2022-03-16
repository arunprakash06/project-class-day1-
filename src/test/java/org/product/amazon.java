package org.product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.baseclass.BaseClass;

public class amazon extends BaseClass {
	public static void main(String[] args) throws AWTException {
		
		chromeLaunch();
		maximize();
		implicityWait(10);
		urlLaunch("https://www.amazon.in/");
		escape();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		sendKeys(search, "iphone");
		WebElement btnclick = driver.findElement(By.xpath("//input[@type='submit']"));
		click(btnclick);
		List<WebElement> products = driver.findElements(By.xpath(" //span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement product : products) {
        	String text = product.getText();
        	System.out.println(text);
		}  
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        for (WebElement price : prices) {
        	String text = price.getText();
        
        	if (text.contains(",")) {
        		String re = text.replace(",", "");
        		System.out.println(re);
				
			}
		}  
       
        
       
		
	
			
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}

package org.product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.baseclass.BaseClass;

public class Flipkart extends BaseClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
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
        WebElement btclick = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        click(btclick);
        threadWait(5000);
        List<WebElement> products2 = driver.findElements(By.xpath(" //div[@class='_4rR01T']"));
        for (WebElement pro : products2) {
        	String t = pro.getText();
        	System.out.println(t);
			
		}
        WebElement bttclick = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        click(bttclick);
        threadWait(5000);
        List<WebElement> products3 = driver.findElements(By.xpath(" //div[@class='_4rR01T']"));
        for (WebElement pr : products3) {
        	String tx = pr.getText();
        	System.out.println(tx);
	
        }
		
	
			
		
	
	
		
		
		
		
		
		
		
		
	}
		
		
		
	}



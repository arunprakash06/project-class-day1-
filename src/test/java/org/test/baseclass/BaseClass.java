package org.test.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	//Chromelaunch
	public static WebDriver chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		return driver;	
	}
	//EdgeLaunch
	public static WebDriver edgeLaunch() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		return driver;
	}
	//firefox launch
	public static WebDriver firefoxLaunch() {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		return driver;
	}
	//Url launch
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	//Maximize 
	public static void maximize() {
		driver.manage().window().maximize();
	}
	//Dynamic Wait
	public static void implicityWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);	
	}
	//Static Wait
	public static void threadWait(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}
	//SendKeys
	public static void sendKeys(WebElement e, String data) {
		e.sendKeys(data);
	}
	//click
	public static void click(WebElement e) {
		e.click();
	}
	//closewindow
	public static void closeWindow() {
		driver.close();
	}
	//quit
	public static void quit() {
		driver.quit();
	}
	//getcurrenturl
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
	}
	//navigateforward
	public static void forward() {
		driver.navigate().forward();
	}
	//navigate togoback
	public static void toGoBack() {
		driver.navigate().back();
	}
	//navigate to url
	public static void toUrl(String url) {
		driver.navigate().to(url);
	}
	//getattribute
	public static String getAttribute(WebElement e) {
		String att = e.getAttribute("value");
		return att;
	}
	//gettitle
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	//DragandDrop
	public static void dragAndDrop(WebElement from,WebElement to) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
   //movetoelement
	public static void moveToElement(WebElement move) {
		Actions a= new Actions(driver);
		a.moveToElement(move).perform();
	}
	//contentclick
	public static void contextClick() {
		Actions a= new Actions(driver);
		a.contextClick().perform();
	}
	//contentclicktarget
		public static void contextClickTarget(WebElement click) {
			Actions a= new Actions(driver);
			a.contextClick(click).perform();
		}
	//Doubleclick
	public static void doubleClick() {
		Actions a= new Actions(driver);
		a.doubleClick().perform();
	}
	//Doubleclicktarget
		public static void doubleClickTarget(WebElement click) {
			Actions a= new Actions(driver);
			a.doubleClick(click).perform();
		}
	//clickandhold
	public static void clickAndHold(WebElement move) {
		Actions a= new Actions(driver);
		a.clickAndHold(move).perform();

	}
	//release
	public static void release() {
		Actions a= new Actions(driver);
		a.release().perform();
	}
	//perform
	public static void perform() {
		Actions a= new Actions(driver);
		a.perform();
	}
	//selectallusingrobot
	public static void selectAll() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}
	//copyusingrobot
		public static void copy() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		}
		//enterusingrobot
				public static void enter() throws AWTException {
					Robot r=new Robot();
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
				}		
	//tab
		public static void tab() throws AWTException {
					Robot r=new Robot();
					r.keyPress(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_TAB);
				}
		//paste
		public static void paste() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		}
		//escape
		public static void escape() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
		}
		//selectbyindex
		public static void selectByIndex(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
		}
		//selectbyvalue
				public static void selectByValue(WebElement e,String value) {
					Select s=new Select(e);
					s.selectByValue(value);
				}
		//selectbyvisibletext
				public static void selectByVisibleText(WebElement e,String text) {
					Select s=new Select(e);
					s.selectByVisibleText(text);
				}
		//ismultiple----------------------------------------
		public static void isMultiple(WebElement e) {
			Select s=new Select(e);
			boolean mul = s.isMultiple();
			System.out.println();
		}
		//option-----------------------------------------
		public static void option(WebElement e,int index) {
			Select s=new Select(e);
			List<WebElement> options = s.getOptions();
			WebElement we = options.get(index);
		}
		//deselectbyindex
				public static void deselectByIndex(WebElement e,int index) {
					Select s=new Select(e);
					s.deselectByIndex(index);;
				}
				//deselectbyvalue
				public static void deselectByValue(WebElement e,String value) {
					Select s=new Select(e);
					s.deselectByValue(value);
				}
		//deselectbyvisibletext
				public static void deselectByVisibleText(WebElement e,String text) {
					Select s=new Select(e);
					s.deselectByVisibleText(text);
				}
		//deselectall
				public static void deselectAll(WebElement e) {
					Select s=new Select(e);
					s.deselectAll();
				}
		//accept
				public static void accept() {
					Alert alert = driver.switchTo().alert();
					alert.accept();
				}
		//dismiss
				public static void dismiss() {
					Alert alert = driver.switchTo().alert();
					alert.dismiss();
				}
		//sendkeys
				public static void sendKeyAlt(String text) {
					Alert alert = driver.switchTo().alert();
					alert.sendKeys(text);
				}
		//gettextalert
				public static void getTextAlt() {
				Alert alert = driver.switchTo().alert();
				alert.getText();
				}
		//frameidorname
				public static void frameId(String text) {
					driver.switchTo().frame(text);
				}
	    //frameindex
				public static void frameIndex(int index) {
					driver.switchTo().frame(index);
				}
		//defaultcontent
				public static void defaultContent() {
					driver.switchTo().defaultContent();
				}
		//takescreenshot
				public static void takeScreenshot(String text) throws IOException {
					TakesScreenshot ts=(TakesScreenshot)driver;
					File from = ts.getScreenshotAs(OutputType.FILE);
					File to=new File("C:\\Users\\ASUS\\eclipse-workspace\\Selenium\\screenshots\\"+text);
					FileUtils.copyFile(from, to);
				}
		//jsinsert
			public static void jsInsert(WebElement e, String name) {
				JavascriptExecutor js= (JavascriptExecutor)driver; 
					js.executeScript("arguments[0].setattribute('value','"+name+"')", e);		
			}
		//jsclick
			public static void jsClick(WebElement e) {
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", e);
			}
		//jsgetattribute
			public static void jsGetAttribute(WebElement e) {
				JavascriptExecutor js= (JavascriptExecutor)driver;
				Object script = js.executeScript("return arguments[0].getattribute('value')", e);
			}
		//jsscrollup
			public static void jsScrollUp(WebElement e) {
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("aruguments[0].scrollIntoVeiw(false)", e);
			}
		//jsscrolldown
			public static void jsScrollDown(WebElement e) {
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoVeiw(true)", e);
			}
		//windowhandle--------------------------
			public static void windowsHandle() {
				String handle = driver.getWindowHandle();
			}
		//windowhandles-------------------------
			public static void windowHandles() {
				Set<String> handles = driver.getWindowHandles();
			}
		//excel 
			public static String excel(String filename,String sheetname,int row, int cel) throws IOException {
				File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\Maven\\src\\test\\resources\\"+filename+".xlsx");
				FileInputStream fi=new FileInputStream(f);
				Workbook w=new XSSFWorkbook(fi);
				Sheet s = w.getSheet(sheetname);
				Row r = s.getRow(row);
				Cell cell = r.getCell(cel);
				int type = cell.getCellType();
				String value=null;
				if (type==1) {
					 value = cell.getStringCellValue();
				}else {
					if (DateUtil.isCellInternalDateFormatted(cell)) {
						Date dd = cell.getDateCellValue();
						SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yyyy");
						 value = sd.format(dd);
					}else {
						double db = cell.getNumericCellValue();
						long ln= (long) db;
						 value = String.valueOf(ln);
					}	
				}
				return value;	
			}
		//createexcel
			public static void excelCreate(String filename,String sheet,int row, int cell,String value) throws IOException {
				File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\Maven\\src\\test\\resources\\"+filename+".xlsx");
		        Workbook w=new XSSFWorkbook();
		        Sheet s = w.createSheet(sheet);
		        Row r = s.createRow(row);
		        Cell c = r.createCell(cell);
		        c.setCellValue(value);
		        FileOutputStream fo=new FileOutputStream(f);
		        w.write(fo);
			}
		//change particular name cell
			public static void excelCell(String filename,String sheet,int row,int cell,String name,String value) throws IOException {
				File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\Maven\\src\\test\\resources\\"+filename+".xlsx");
				FileInputStream fi=new FileInputStream(f);
				Workbook w=new XSSFWorkbook(fi);
				Sheet s = w.getSheet(sheet);
				Row r = s.getRow(row);
				Cell c = r.getCell(cell);
				String st = c.toString();
				if (st.equals(name)) {
					c.setCellValue(value);	
				}
				FileOutputStream fo=new FileOutputStream(f);
				w.write(fo);
			}
	  //
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   		
		   

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

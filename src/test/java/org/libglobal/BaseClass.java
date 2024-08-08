package org.libglobal;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	    protected static WebDriver driver;
	    
	    public static WebDriver LaunchEdgeBrowser() {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			return driver;

		}
	    
	    public static WebDriver LaunchFirefoxBrowser() {
	    	WebDriverManager.firefoxdriver().setup();
	    	driver = new FirefoxDriver();
	    	 return driver;

		}
		
		public static WebDriver LaunchChromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			return driver;

		}

		
		public static void elementWait() {
			Timeouts implicitlyWait =  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			
		}
		
		
		
		public static void maximizeWindow() {
			driver.manage().window().maximize();

		}
		public static void openAppUrl(String url) {
			driver.get(url);
			

		}
		public static String getUrl() {
			return driver.getCurrentUrl();

		}
		public static void closeBrowser() {
			driver.close();

		}
		public static void quitBrowser() {
			driver.quit();

		}
		public static void manageElement() {
			driver.manage();

		}
		public static void switchToElement() {
			driver.switchTo();

		}
		public static String windowHandel() {
			String handle = driver.getWindowHandle();
			return handle;

		}
		public static Set<String> windowHandles() {
			Set<String> handles = driver.getWindowHandles();
			return handles;

		}
		public static Navigation elementNavigate(String url) {
			Navigation navigation = driver.navigate();
			return navigation;

		}
		public static void openCurrentUrl() {
			 driver.getCurrentUrl();
			
			}
		
		
		//WebElement interface methods:
		
		public static void enterValue(WebElement e, String Data) {
			e.sendKeys(Data);
			

		}
		public static void elementClick(WebElement e) {
			e.click();
			}
		public static String elementGetText(WebElement e,String Data) {
			String text = e.getText();
			return text;
			

		}
		public static String elementGetAttribute(WebElement e,String Data) {
			String attribute = e.getAttribute(Data);
			return attribute;

		}
		public static boolean elementIsDisplayed(WebElement e) {
			boolean displayed = e.isDisplayed();
			return displayed;
			

		}
		public static boolean elementIsEnable(WebElement e) {
			boolean enabled = e.isEnabled();
			return enabled;
			

		}
		public static boolean elementIsSelected(WebElement e) {
			boolean selected = e.isSelected();
			return selected;
		}
		
		
		//Navigation interface methods:
		
		public static void pageForward() {
			driver.navigate().forward();

		}
		public static void pageBack() {
			driver.navigate().back();

		}
		public static void pageRefresh() {
			driver.navigate().refresh();

		}
		public static void pageTo(String url) {
			driver.navigate().to(url);

		}
		
		//Action class methods:
		
		public static void moveToElement() {
			Actions ac = new Actions(driver);
			ac.moveToElement(null).perform();

		}
		public static void contextClick() {
			Actions ac = new Actions(driver);
			ac.contextClick().perform();
			

		}
		public static void doubleClick() {
			Actions ac = new Actions(driver);
			ac.doubleClick().perform();

		}
		public static void dragAndDrop(WebElement source,WebElement target) {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target);

		}
		public static void perform() {
			Actions ac = new Actions(driver);
			ac.perform();

		}
		public static void keyUp(String data) {
			Actions ac = new Actions(driver);
			ac.keyUp(data).perform();

		}
		public static void keyDown(String data) {
			Actions ac = new Actions(driver);
			ac.keyDown(data).perform();

		}
		
		//Select class methods:
		
		public static void selectByIndex(WebElement e,int index) {
			Select s = new Select(e);
			s.selectByIndex(index);
			}
		
		public static void selectByValue(WebElement e,String Data) {
			Select s = new Select(e);
			s.selectByValue(Data);
			}
		
		public static void selectByVisibleText(WebElement e,String Data) {
			Select s = new Select(e);
			s.selectByVisibleText(Data);

		}
		public static void deselectAll(WebElement e) {
			Select s = new Select(e);
			s.deselectAll();

		}
		
		public static void deselectByIndex(WebElement e,int index) {
			Select s = new Select(e);
			s.deselectByIndex(index);

		}
		public static void deselectByValue(WebElement e,String Data) {
			Select s = new Select(e);
			s.deselectByValue(Data);

		}
		public static void deselectByVisibleText(WebElement e,String Data) {
			Select s = new Select(e);
			s.deselectByVisibleText(Data);

		}
		public static boolean elementIsMultiple(WebElement e) {
			Select s = new Select(e);
			boolean multiple = s.isMultiple();
			return multiple;
			}
		
		public static List<WebElement> getOptions(WebElement e) {
			Select s = new Select(e);
			List<WebElement> options = s.getOptions();
			return options;
			
			

		}
		public static List<WebElement> getAllSelectedOptions(WebElement e) {
			Select s = new Select(e);
			List<WebElement> list = s.getAllSelectedOptions();
			return list;
			

		}
		
		public static WebElement getFirstSelectedOption(WebElement e) {
			Select s = new Select(e);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			return firstSelectedOption;

		}
		//Alert Interface methods:
		
		public static Alert switchToAlert() {
			Alert al = driver.switchTo().alert();
			return al;
			}
		public static Alert acceptAlert() {
			Alert al = driver.switchTo().alert();
			al.accept();
			return al;

		}
		public static Alert denyAlert() {
			Alert al = driver.switchTo().alert();
			al.dismiss();
			return al;
		

		}
		public static Alert sendValueAlert(String Data) {
			Alert al = driver.switchTo().alert();
			al.sendKeys(Data);
			return al;

		}
		
		public static String alertGetText(String text) {
			Alert al = driver.switchTo().alert();
			String text1 = al.getText();
			return text1;
			

		}
		//Frames:
		
		public static WebDriver switchToFrameStringId(String text) {
			   WebDriver frame = driver.switchTo().frame(text);
			   return frame;
		}
		public static WebDriver switchToFrameInt(int index) {
			WebDriver frame = driver.switchTo().frame(0);
			return frame;
			}
		public static WebDriver switchToFrameWebElement(WebElement e) {
			WebDriver frame = driver.switchTo().frame(e);
			return frame;
	  }
		public static WebDriver switchToParentFrame() {
			WebDriver parentFrame = driver.switchTo().parentFrame();
			return parentFrame;
		}
		public static void screenShot() throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			String ss = "Screenshots" +new Random().nextInt(1000);

			FileHandler.copy(screenshotAs, new File("C:\\Users\\Dell\\Desktop\\ss\\'"+ss+"'.png"));
			}
		public static void employeeOrganizationSelect(WebDriver driver,String...Value ) {
			List<WebElement> employeeOrganization = driver.findElements(By.xpath("//ul[@id='select2-emp_orgid-results']"));
			if(!Value[0].equalsIgnoreCase("all")) {
				for (WebElement list : employeeOrganization) {
					String text = list.getText();
					System.out.println(text);
					for (String val : Value) {
						if(text.equals(val)) {
							list.click();
							break;
						}
					}
					
				}
			}
		}
		}
		   
		
		








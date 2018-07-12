package GridCode;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Browser.LaunchBrowser;
import Browser.Property_Lib;

public class Parallel extends LaunchBrowser {

	public WebDriver driver;
	public WebDriver driver2;
	public String pageurl;
	long timeout = 20;

	@Test
	public void Test1() throws MalformedURLException {
		try {
			String home = System.getProperty("user.home");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);
			ChromeOptions option = new ChromeOptions();
			option.setBinary(home
					+ "/AppData/Local/Google/Chrome/Application/chrome.exe");
			option.addArguments("disable-infobars");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			System.out.println("Browser launched and maximized successfully");
			driver.navigate().to(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajakumar").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("searched the keyword in the Browsers");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test2() throws MalformedURLException {
		try {
			String home = System.getProperty("user.home");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);
			ChromeOptions option = new ChromeOptions();
			option.setBinary(home
					+ "/AppData/Local/Google/Chrome/Application/chrome.exe");
			option.addArguments("disable-infobars");
			driver2 = new ChromeDriver();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			System.out.println("Browser launched and maximized successfully");
			driver2.navigate().to(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajakumar").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("searched the keyword in the Browsers");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test3() throws MalformedURLException {
		try {
			String home = System.getProperty("user.home");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);
			ChromeOptions option = new ChromeOptions();
			option.setBinary(home
					+ "/AppData/Local/Google/Chrome/Application/chrome.exe");
			option.addArguments("disable-infobars");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			System.out.println("Browser launched and maximized successfully");
			driver.navigate().to(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajakumar").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("searched the keyword in the Browsers");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test4() throws MalformedURLException {
		try {
			String home = System.getProperty("user.home");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);
			ChromeOptions option = new ChromeOptions();
			option.setBinary(home
					+ "/AppData/Local/Google/Chrome/Application/chrome.exe");
			option.addArguments("disable-infobars");
			driver2 = new ChromeDriver();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			System.out.println("Browser launched and maximized successfully");
			driver2.navigate().to(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajakumar").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("searched the keyword in the Browsers");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

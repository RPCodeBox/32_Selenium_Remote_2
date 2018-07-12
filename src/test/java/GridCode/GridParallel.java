package GridCode;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.AutomationConstants;
import Browser.DriverFactory;
import Browser.Property_Lib;

public class GridParallel extends AutomationConstants {

	private String pageurl;
	private String nodeurl;
	long timeout = 20;

	@BeforeMethod
	public void setup() {
		// WebDriver driver = DriverFactory.getInstance().getDriver();
		// DriverFactory.getInstance().getDriver().manage().window().maximize();
		// driver.get(Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
		// "PageURL"));
		System.out.println("Execution started");
	}

	@AfterMethod
	public void tearDown() {
		// DriverFactory.getInstance().removeDriver();
		System.out.println("Execution ended");
	}

	@Test
	public void testDriver1() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver2() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver3() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver4() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver5() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver6() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver7() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver8() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver9() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver10() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver11() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver12() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver13() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver14() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver15() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver16() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver17() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver18() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver19() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDriver20() throws AWTException, IOException,
			InterruptedException {
		try {
			WebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			WebElement ele = driver.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import Browser.LaunchBrowser;
import Browser.Property_Lib;

public class Gridhub extends LaunchBrowser {
	private WebDriver driver1;
	private WebDriver driver2;
	private String pageurl;
	private String nodeurl;
	long timeout = 20;

	@Test
	public void Test1() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test2() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test3() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test4() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test5() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test6() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test7() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test8() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test9() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test10() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test11() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test12() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test13() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test14() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test15() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test16() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test17() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test18() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver2 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver2.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver2.get(pageurl);
			WebElement ele = driver2.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver2);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver2.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test19() throws AWTException, IOException, InterruptedException {
		try {
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"NodeURL");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver1 = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver1.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver1.get(pageurl);
			WebElement ele = driver1.findElement(By
					.xpath("//*[@class='sbib_b']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).sendKeys("Rajnikanth").build().perform();
			System.out.println("Searched the keyword");
			driver1.close();
			System.out.println("navigated to google page successfully");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test20() throws MalformedURLException {
		try {
			String home = System.getProperty("user.home");
			System.out.println(System.getProperty("user.home"));
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

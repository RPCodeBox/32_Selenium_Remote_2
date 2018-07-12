package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Browser.AutomationConstants;
import Browser.DriverFactory;
import Browser.Excel_Lib;
import Browser.Property_Lib;

public class Tests_SearchPage extends AutomationConstants {
	private String pageurl;
	private String nodeurl;
	private String browser;
	long timeout = 20;

	@Test
	public void TM04_TS01_ValidatesearchforCategory() throws Exception {
		RemoteWebDriver driver=null;
		try {
			driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			driver.close();
		}
	}

	@Test
	public void TM04_TS02_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS03_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS04_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS05_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS06_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS07_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS08_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS09_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS10_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS11_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS12_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS13_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS14_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS15_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS16_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS17_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS18_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS19_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS20_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS21_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS22_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS23_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS24_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS25_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS26_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS27_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS28_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS29_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS30_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS31_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS32_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS33_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS34_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS35_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS36_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS37_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS38_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS39_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS40_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS41_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS42_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS43_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS44_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS45_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS46_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS47_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS48_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS49_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS50_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS51_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS52_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS53_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS54_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS55_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS56_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS57_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS58_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS59_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS60_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS61_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS62_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS63_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS64_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS65_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS66_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS67_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS68_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS69_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS70_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS71_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS72_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS73_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS74_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS75_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS76_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS77_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS78_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS79_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS80_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS81_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS82_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS83_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS84_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS85_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS86_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS87_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS88_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS89_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS90_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS91_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS92_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS93_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS94_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS95_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS96_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS97_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS98_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS99_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS100_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS101_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS102_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS103_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS104_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS105_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS106_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS107_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS108_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS109_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS110_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS111_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS112_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS113_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS114_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS115_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS116_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS117_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS118_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS119_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS120_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS121_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS122_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS123_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS124_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS125_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS126_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS127_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS128_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS129_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS130_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS131_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS132_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS133_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS134_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS135_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS136_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS137_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS138_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS139_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS140_ValidatesearchforCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 0);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS141_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS142_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 2, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS143_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 3, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS144_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 4, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS145_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 5, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS146_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 6, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS147_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 7, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS148_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 8, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS149_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 9, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM04_TS150_ValidatesearchforSubCategory() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String categoryName = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 10, 1);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName(browser);
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts()
					.pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.get(pageurl);
			// HomePage_LIB homepage=new HomePage_LIB();
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(categoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Search functionality with "
					+ categoryName + " successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

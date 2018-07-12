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

public class Tests_HomePage extends AutomationConstants {
	private String pageurl;
	private String nodeurl;
	private String browser;
	long timeout = 20;

	@Test
	public void TM01_TS01_ValidateLogo() throws Exception {
		RemoteWebDriver driver=null;
		try {
			driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			driver.close();
		}
	}

	@Test
	public void TM01_TS02_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS03_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS04_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS05_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS06_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS07_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS08_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS09_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS10_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS11_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS12_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS13_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS14_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS15_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS16_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS17_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS18_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS19_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS20_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS21_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS22_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS23_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS24_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS25_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS26_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS27_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS28_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS29_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS30_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS31_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS32_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS33_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS34_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS35_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS36_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS37_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS38_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS39_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS40_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS41_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS42_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS43_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS44_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS45_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS46_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS47_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS48_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS49_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS50_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS51_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS52_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS53_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS54_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS55_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS56_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS57_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS58_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS59_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS60_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS61_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS62_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS63_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS64_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS65_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS66_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS67_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS68_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS69_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS70_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS71_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS72_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS73_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS74_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS75_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS76_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS77_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS78_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS79_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS80_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS81_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS82_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS83_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS84_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS85_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS86_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS87_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS88_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS89_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS90_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS91_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS92_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS93_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS94_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS95_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS96_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS97_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS98_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS99_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS100_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS101_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS102_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS103_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS104_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS105_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS106_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS107_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS108_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS109_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS110_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS111_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS112_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS113_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS114_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS115_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS116_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS117_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS118_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS119_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS120_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS121_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS122_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS123_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS124_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS125_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS126_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS127_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS128_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS129_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS130_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS131_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS132_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS133_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS134_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS135_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS136_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS137_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS138_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS139_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS140_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS141_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS142_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS143_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS144_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS145_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS146_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS147_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS148_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS149_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS150_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS151_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS152_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS153_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS154_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS155_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS156_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS157_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS158_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS159_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS160_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS161_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS162_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS163_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS164_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS165_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS166_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS167_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS168_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS169_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS170_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS171_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS172_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS173_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS174_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS175_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS176_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS177_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS178_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS179_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS180_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS181_ValidateLogo() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateDXLLogo();
			boolean element = driver.findElement(By.xpath("//img[@alt='DXL']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Logo successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS182_validateSignIn() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateSignIn();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='my account']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the SignIn Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS183_validateStoreFinder() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateStoreFinder();
			boolean element = driver.findElement(
					By.xpath("//*[@class='storeFinder tooltips']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the Store finder Icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS184_validateShoppingBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			// homepage.validateShoppingBag();
			boolean element = driver.findElement(
					By.xpath("//*[@alt='checkout']")).isDisplayed();
			System.out.println(element);
			System.out.println("validated the Shopping Bag icon successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS185_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS186_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS187_ValidateSubSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_Sub_Ctegory = Excel_Lib.getData("./Data/TestData.xls",
					"HomePage", 1, 2);
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
			element.sendKeys(sub_Sub_Ctegory);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated the DXL Sub-Sub-Cetagory successfully");
			driver.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS188_ValidateSearch() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM01_TS189_ValidateOfferBanner() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean banner = driver
					.findElement(
							By.xpath("//img[@alt='Online & In-Store | Semi-Annual Clearance Sale | UP TO 75% OFF | Savings this good only come along twice a year! | SHOP SALE']"))
					.isDisplayed();
			System.out.println(banner);
			System.out.println("validated the DXL Offer banner successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS190_ValidateTopSlot() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean element = driver.findElement(
					By.xpath("//img[@alt='COMFORT IN MOTION | SHOP REEBOK']"))
					.isDisplayed();
			System.out.println(element);
			System.out.println("validated the DXL Top Slot successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS191_ValidateFooterlinks() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
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
			boolean info = driver.findElement(
					By.xpath("//*[text()='Information']")).isDisplayed();
			System.out.println(info);
			boolean myacc = driver.findElement(
					By.xpath("//*[text()='My account']")).isDisplayed();
			System.out.println(myacc);
			boolean subscribe = driver.findElement(
					By.xpath("//*[text()='Sign up for our very best deals']"))
					.isDisplayed();
			System.out.println(subscribe);
			System.out.println("validated the DXL footer links successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS192_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS193_ValidateCategories() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS194_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS195_ValidateCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS196_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS197_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS198_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS199_ValidateSubCategories() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM01_TS200_ValidateSubCategories() throws Exception {
		RemoteWebDriver driver = null;
		try {
			driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
			pageurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"PageURL");
			browser = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			String sub_CtegoryName = Excel_Lib.getData("./Data/TestData.xls",
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
			// homepage.browseFromSubCategory(categoryName, sub_CtegoryName);
			WebElement element = driver.findElement(By
					.xpath("//input[@id='quickSearch-query']"));
			element.sendKeys(sub_CtegoryName);
			element.sendKeys(Keys.ENTER);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validated the DXL Sub-Cetagory successfully");
			driver.close();
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
			driver.close();
		}
	}
}

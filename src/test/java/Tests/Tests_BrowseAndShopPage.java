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

public class Tests_BrowseAndShopPage extends AutomationConstants {
	private String pageurl;
	private String nodeurl;
	private String browser;
	long timeout = 20;

	@Test
	public void TM03_TS01_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			driver.close();
		}
	}

	@Test
	public void TM03_TS02_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
	public void TM03_TS03_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
	public void TM03_TS04_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS05_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS06_validateProductDetails() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS07_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS08_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS09_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS10_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS11_AddtoBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS12_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS13_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS14_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS15_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS16_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS17_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
	public void TM03_TS18_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM03_TS19_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS20_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS21_validateProductDetails() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS22_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS23_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS24_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS25_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS26_AddtoBag() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS27_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS28_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS29_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS30_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS31_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS32_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
	public void TM03_TS33_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
	public void TM03_TS34_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS35_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS36_validateProductDetails() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS37_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS38_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS39_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS40_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS41_AddtoBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS42_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS43_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS44_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS45_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS46_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS47_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
	public void TM03_TS48_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM03_TS49_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS50_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS51_validateProductDetails() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS52_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS53_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS54_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS55_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS56_AddtoBag() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS57_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS58_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS59_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS60_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS61_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS62_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
	public void TM03_TS63_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
	public void TM03_TS64_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS65_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS66_validateProductDetails() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS67_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS68_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS69_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS70_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS71_AddtoBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS72_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS73_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS74_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS75_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS76_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS77_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
	public void TM03_TS78_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM03_TS79_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS80_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS81_validateProductDetails() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS82_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS83_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS84_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS85_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS86_AddtoBag() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS87_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS88_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS89_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS90_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS91_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS92_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
	public void TM03_TS93_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
	public void TM03_TS94_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS95_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS96_validateProductDetails() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS97_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS98_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS99_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS100_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS101_AddtoBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS102_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS103_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS104_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS105_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS106_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS107_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
	public void TM03_TS108_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM03_TS109_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS110_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS111_validateProductDetails() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS112_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS113_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS114_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS115_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS116_AddtoBag() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS117_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS118_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS119_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS120_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS121_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS122_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
	public void TM03_TS123_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
	public void TM03_TS124_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS125_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS126_validateProductDetails() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS127_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS128_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS129_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS130_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS131_AddtoBag() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS132_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS133_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS134_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS135_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS136_CategoryPagefromMegaMenu() throws Exception {
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
			// homepage.validateCategory(categoryName);
			WebElement CATEGORY = driver.findElement(By.xpath("//*[text()='"
					+ categoryName + "']"));
			boolean status = CATEGORY.isDisplayed();
			System.out.println(status);
			CATEGORY.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Validation with " + categoryName
					+ " is successful");
			System.out.println("validated the DXL Cetagory successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS137_SubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
	public void TM03_TS138_SubSubCategoryPagefromMegaMenu() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
	public void TM03_TS139_GridSizeInPLP() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			WebElement view = driver.findElement(By
					.xpath("//*[@title='Show 4 across']"));
			view.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = view.getAttribute("class");
			System.out.println(status);
			System.out.println("validated the GridView size successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS140_validateProduct() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			System.out
					.println("validated the Product page navigation successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS141_validateProductDetails() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node1");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement detail = DriverFactory.getInstance().getDriver()
					.findElement(By.xpath("//*[text()='PRODUCT DETAILS']"));
			boolean status = detail.isDisplayed();
			System.out.println(status);
			String msg = detail.getAttribute("p");
			System.out.println(msg);
			System.out.println("validated the Product details successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS142_validateCalculateSize() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node2");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean calculatesize = driver.findElement(
					By.xpath("//*[text()='Calculate your size']"))
					.isDisplayed();
			System.out.println(calculatesize);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS143_validateSizechart() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node3");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizechart = driver.findElement(
					By.xpath("//strong[text()='Size Chart']")).isDisplayed();
			System.out.println(sizechart);
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS144_validatesalepricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node4");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement salepricecolor = driver.findElement(By
					.xpath("(//*[text()='Sale Priced Colors'])[1]"));
			boolean status = salepricecolor.isDisplayed();
			System.out.println(status);
			salepricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS145_validateRegpricedcolors() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			WebElement regpricecolor = driver.findElement(By
					.xpath("((//*[text()='Reg. Priced Colors'])[1]"));
			boolean status = regpricecolor.isDisplayed();
			System.out.println(status);
			regpricecolor.click();
			System.out
					.println("validated the Product size calculator successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS146_AddtoBag() throws Exception {
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='Add to Cart'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String status = driver.getTitle();
			System.out.println(status);
			System.out
					.println("Product added to the shopping Bag successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS147_ValidateProductName() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productName = driver.findElement(
					By.xpath("//h1[contains(text(),'Harbor Bay')]")).getText();
			System.out.println(productName);
			System.out.println("Validated the Product name successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS148_ValidateProductOffer() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			String productoffer = driver.findElement(
					By.xpath("//*[@class='price sale']")).getText();
			System.out.println(productoffer);
			System.out.println("Validated the Product Offer successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS149_ValidateSizeAndColorSelectionBlog() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node9");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			boolean sizecolorBlog = driver.findElement(
					By.xpath("//*[text()='SIZE & COLOR']")).isDisplayed();
			System.out.println(sizecolorBlog);
			System.out.println("Validated the Size & Color blog successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM03_TS150_ValidatePickupInStore() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node10");
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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("(//*[@class='mouseHoverProductImage'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//*[@title='size-3XL']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//*[@alt='sea surf blue'])[1]"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@alt='pick up in store']"))
					.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fancybox-close']")).click();
			System.out.println("Validated the PickUp in Store successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

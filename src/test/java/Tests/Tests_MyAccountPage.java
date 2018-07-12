package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Browser.AutomationConstants;
import Browser.DriverFactory;
import Browser.Property_Lib;

public class Tests_MyAccountPage extends AutomationConstants {
	private String pageurl;
	private String nodeurl;
	private String browser;
	long timeout = 20;

	@Test
	public void TM02_TS01_CreateAccount() throws Exception {
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out
					.println("validated Created the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			driver.close();
		}
	}

	@Test
	public void TM02_TS02_ValidateSocialMediaIcons() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signin.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS03_CreateAccountwithInvalidData() throws Exception {
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
			// homepage.validateDXLLogo();
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signin.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signin.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);

			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS04_ValidateMyProfile() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS05_ValidateForgotPasswordLink() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS06_CreateAccount() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS07_ValidateSocialMediaIcons() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS08_CreateAccountwithInvalidData() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS09_ValidateMyProfile() throws Exception {
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
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS10_ValidateForgotPasswordLink() throws Exception {
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS11_CreateAccount() throws Exception {
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS12_ValidateSocialMediaIcons() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS13_CreateAccountwithInvalidData() throws Exception {
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
			// homepage.validateDXLLogo();
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signin.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS14_ValidateMyProfile() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS15_ValidateForgotPasswordLink() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS16_CreateAccount() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS17_ValidateSocialMediaIcons() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS18_CreateAccountwithInvalidData() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signin.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS19_ValidateMyProfile() throws Exception {
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
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS20_ValidateForgotPasswordLink() throws Exception {
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS21_CreateAccount() throws Exception {
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS22_ValidateSocialMediaIcons() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS23_CreateAccountwithInvalidData() throws Exception {
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
			// homepage.validateDXLLogo();
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS24_ValidateMyProfile() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS25_ValidateForgotPasswordLink() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS26_CreateAccount() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS27_ValidateSocialMediaIcons() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS28_CreateAccountwithInvalidData() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS29_ValidateMyProfile() throws Exception {
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
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS30_ValidateForgotPasswordLink() throws Exception {
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS31_CreateAccount() throws Exception {
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS32_ValidateSocialMediaIcons() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS33_CreateAccountwithInvalidData() throws Exception {
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
			// homepage.validateDXLLogo();
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS34_ValidateMyProfile() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS35_ValidateForgotPasswordLink() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS36_CreateAccount() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS37_ValidateSocialMediaIcons() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS38_CreateAccountwithInvalidData() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS39_ValidateMyProfile() throws Exception {
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
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS40_ValidateForgotPasswordLink() throws Exception {
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS41_CreateAccount() throws Exception {
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS42_ValidateSocialMediaIcons() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS43_CreateAccountwithInvalidData() throws Exception {
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
			// homepage.validateDXLLogo();
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS44_ValidateMyProfile() throws Exception {
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
			// homepage.browseFromSubSubCategory(categoryName, sub_CtegoryName,
			// sub_Sub_Ctegory);
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS45_ValidateForgotPasswordLink() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node5");
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS46_CreateAccount() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node6");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS47_ValidateSocialMediaIcons() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node7");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean facebook = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[1]"))
					.isDisplayed();
			System.out.println(facebook);
			boolean google = driver.findElement(
					By.xpath("(//*[@style='cursor: pointer;'])[2]"))
					.isDisplayed();
			System.out.println(google);
			System.out
					.println("validated the DXL Social media icons successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS48_CreateAccountwithInvalidData() throws Exception {
		try {
			RemoteWebDriver driver = DriverFactory.getInstance().getDriver();
			nodeurl = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Node8");
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
			WebElement signin = driver.findElement(By
					.xpath("//*[@alt='my account']"));
			boolean signIn = signin.isDisplayed();
			System.out.println(signIn);
			signin.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			WebElement signup = driver.findElement(By
					.xpath("//a[text()=' Sign Up']"));
			boolean signUp = signup.isDisplayed();
			System.out.println(signUp);
			signup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement signupEmail = driver.findElement(By
					.xpath("//*[text()='Sign up with Email']"));
			boolean signUpemail = signupEmail.isDisplayed();
			System.out.println(signUpemail);
			signupEmail.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.emailAddress']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='SignUpForm.password']"))
					.sendKeys("pwd1234");
			driver.findElement(
					By.xpath("//input[@id='SignUpForm.confirmPassword']"))
					.sendKeys("pwd1234");
			driver.findElement(By.xpath("//input[@id='AddressForm.firstName']"))
					.sendKeys("sachin");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.middleInitial']"))
					.sendKeys("a");
			driver.findElement(By.xpath("//input[@id='AddressForm.lastName']"))
					.sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id='AddressForm.company']"))
					.sendKeys("chts technologies");
			driver.findElement(
					By.xpath("//input[@id='AddressForm.phoneNumber']"))
					.sendKeys("123456789");
			WebElement dropdown = driver.findElement(By
					.xpath("//*[@id='SignUpForm.birthMonth']"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("March");
			WebElement dropDown = driver.findElement(By
					.xpath("//*[@id='AddressForm.country']"));
			Select select1 = new Select(dropDown);
			select1.selectByVisibleText("ALGERIA");
			driver.findElement(By.xpath("//*[@id='AddressForm.streetAddress']"))
					.sendKeys("abcd street");
			driver.findElement(By.xpath("//*[@id='AddressForm.address2']"))
					.sendKeys("efgh road");
			driver.findElement(By.xpath("//*[@id='AddressForm.city']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.intProvince']"))
					.sendKeys("Oran");
			driver.findElement(By.xpath("//*[@id='AddressForm.zipCode']"))
					.sendKeys("12345");
			driver.findElement(By.xpath("//*[@alt='click to create account']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			String errormsg = driver.findElement(
					By.xpath("//*[@class='errorMessage']")).getAttribute("p");
			System.out.println(errormsg);

			System.out.println("validatedCreated the DXL Account successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS49_ValidateMyProfile() throws Exception {
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
			boolean profile = driver.findElement(
					By.xpath("//*[text()=' My size profile ']")).isDisplayed();
			System.out.println(profile);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TM02_TS50_ValidateForgotPasswordLink() throws Exception {
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
			boolean forgotpwd = driver.findElement(
					By.xpath("//*[text()='Forgot your password?']"))
					.isDisplayed();
			System.out.println(forgotpwd);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("validated the DXL My Profile successfully");
			driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

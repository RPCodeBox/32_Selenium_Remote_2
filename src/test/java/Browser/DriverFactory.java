package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory extends AutomationConstants {
	public static String browserType;
	private DriverFactory() {
		// Do-nothing..Do not allow to initialize this class from outside
	}

	private static DriverFactory instance = new DriverFactory();

	public static DriverFactory getInstance() {
		return instance;
	}

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local
																	// driver
																	// object
																	// for
																	// webdriver
	{
		public WebDriver initialValue() {
			browserType=Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"Browser");
			if(browserType.equalsIgnoreCase("chrome")) 
			{
				System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);
				return new ChromeDriver();
			}
			else if(browserType.equalsIgnoreCase("firefox"))
			{
				System.setProperty(GECKO_KEY, DRIVER_PATH + GECKO_FILE);
				return new FirefoxDriver();
			}
			else if(browserType.equalsIgnoreCase("IE"))
			{
				System.setProperty(IE_KEY, DRIVER_PATH + IE_FILE);
				return new InternetExplorerDriver();
			}
			else
				System.err
						.println("You did not mentioned the browser name exactly so defualt it is launching firefox. \nIf you mentioned the browser name please follow the rules");
				System.setProperty(GECKO_KEY, DRIVER_PATH + GECKO_FILE);
				return new FirefoxDriver();

			}
			// can be replaced with other browser drivers
	};

	public RemoteWebDriver getDriver() // call this method to get the driver object
									// and launch the browser
	{
		return (RemoteWebDriver) driver.get();
	}

	public void removeDriver() // Quits the driver and closes the browser
	{
		driver.get().quit();
		driver.remove();
	}
}
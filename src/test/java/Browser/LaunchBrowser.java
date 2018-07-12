package Browser;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser extends AutomationConstants {
	public static WebDriver driver;
	public static long timeout;
	public static String url;
	public static String url2;
	public static String browserType;

	public Logger log;

	public LaunchBrowser() {
		log = Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
		BasicConfigurator.configure();
	}

	/*
	 * Method Name : launchBrowser() Purpose : To launch the browser and
	 * Maximize it Author : Shiva Date Created : 09/02/18 Date Modified :
	 * Reviewed By : CH
	 */

	public boolean launchBrowser() throws Exception {
		try {
			String home = System.getProperty("user.home");
			log.info("Initialising Framework");
			browserType = Property_Lib.getPropertyValue(CONFIG_PATH
					+ CONFIG_FILE, "Browser");
			url = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"URL");
			url2 = Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
					"URL_ACC");
			timeout = Long.parseLong((Property_Lib.getPropertyValue(CONFIG_PATH
					+ CONFIG_FILE, "IMPLICIT")));
			log.info("Browser:" + browserType);
			if (browserType.equalsIgnoreCase("chromeBrowser")) {
				System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);
				ChromeOptions option = new ChromeOptions();
				option.setBinary(home+"AppData/Local/Google/Chrome/Application/chrome.exe");
				option.addArguments("disable-infobars");
				driver = new ChromeDriver(option);
			} else if (browserType.equalsIgnoreCase("ieBrowser")) {
				System.setProperty("webdriver.ie.driver", DRIVER_PATH + IE_FILE);
				driver = new InternetExplorerDriver();
			} else if (browserType.equalsIgnoreCase("fireFoxBrowser")) {
				System.setProperty(GECKO_KEY, DRIVER_PATH + GECKO_FILE);
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			log.info("TimeOut:" + timeout);
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			log.info("Browser launched and maximized Successfully");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : navigateToUrl(String url) Purpose : To naviate for the
	 * specified url Author : Shiva Date Created : 09/02/18 Date Modified :
	 * Reviewed By : CH
	 */
	public boolean navigateToUrl(String url) throws Exception {
		try {
			driver.get(url);
			log.info("Navigated to url Specified");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : close() Purpose : To terminate the browser Author : Shiva
	 * Date Created : 09/02/18 Date Modified : Reviewed By :
	 */

	public boolean close() throws Exception {
		try {
			log.info("Finalising Frmework");
			driver.quit();
			log.info("Browser Terminated");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : close() Purpose : To terminate the browser Author : Shiva
	 * Date Created : 09/02/18 Date Modified : Reviewed By :
	 */

	public boolean waitForElement() throws Exception {
		try {
			timeout = Long.parseLong((Property_Lib.getPropertyValue(CONFIG_PATH
					+ CONFIG_FILE, "IMPLICIT")));
			driver.manage().timeouts()
					.implicitlyWait(timeout, TimeUnit.SECONDS);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
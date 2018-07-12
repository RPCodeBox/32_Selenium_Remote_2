package GridCode;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Browser.AutomationConstants;
import Browser.DriverFactory;
import Browser.Property_Lib;

public class ParallelBrowsers extends AutomationConstants {

	@BeforeMethod
	public void setup() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		DriverFactory.getInstance().getDriver().manage().window().maximize();
		driver.get(Property_Lib.getPropertyValue(CONFIG_PATH + CONFIG_FILE,
				"PageURL"));
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().removeDriver();
	}

	
	@Test
	public void testDriver1() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver2() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver3() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver4() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver5() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver6() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver7() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver8() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver9() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver10() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver11() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver12() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver13() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver14() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver15() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver16() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver17() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver18() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver19() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

	@Test
	public void testDriver20() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		System.out.println("Windows Title: " + driver.getTitle());
	}

}

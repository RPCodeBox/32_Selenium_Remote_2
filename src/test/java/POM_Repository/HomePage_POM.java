package POM_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.DriverFactory;

public class HomePage_POM {
	public HomePage_POM()
    {
        PageFactory.initElements(DriverFactory.getInstance().getDriver(), this);
    }
	
	@FindBy(xpath = "//img[@alt='DXL']")
    public WebElement DXL_LOGO;
	
	@FindBy(xpath="//*[@class='storeFinder tooltips']")
	public WebElement DXL_STOREFINDER;
	
	@FindBy(xpath="//*[@alt='checkout']")
	public WebElement DXL_SHOPPINGBAG;
	
	@FindBy(xpath="//*[@alt='my account']")
	public WebElement DXL_SIGNIN;
	
	public String CATEGORY1="//*[text()='";
	public String CATEGORY2="']";
}

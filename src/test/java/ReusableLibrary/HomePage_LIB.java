package ReusableLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.DriverFactory;
import POM_Repository.HomePage_POM;


public class HomePage_LIB extends HomePage_POM {

	/* ****************************************************
	 * Method Name   : validateDXLLogo()
	 * Purpose       : To validate the DXL Logo present in the Home page of site
	 * Author        : Shiva
	 * Date Created  : 29/05/18
	 * Date Modified :
	 * Reviewed By   : 
	 * ******************************************************
	 */
	public boolean validateDXLLogo() throws Exception
    {
        try
        {
        	WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getDriver(), 10);
        	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(DXL_LOGO));
            boolean status = element.isDisplayed();
            System.out.println(status);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }
	
	/* ****************************************************
	 * Method Name   : validateSignIn()
	 * Purpose       : To validate the DXL SignIn present in the Home page of site
	 * Author        : Shiva
	 * Date Created  : 29/05/18
	 * Date Modified :
	 * Reviewed By   : 
	 * ******************************************************
	 */
	public boolean validateSignIn() throws Exception
	{
		try
		{
			boolean status=DXL_SIGNIN.isDisplayed();
			System.out.println(status);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	/* ****************************************************
	 * Method Name   : validateStoreFinder()
	 * Purpose       : To validate the DXL StoreFinder present in the Home page of site
	 * Author        : Shiva
	 * Date Created  : 29/05/18
	 * Date Modified :
	 * Reviewed By   : 
	 * ******************************************************
	 */
	public boolean validateStoreFinder() throws Exception
	{
		try
		{
			boolean status=DXL_STOREFINDER.isDisplayed();
			System.out.println(status);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	/* ****************************************************
	 * Method Name   : validateShoppingBag()
	 * Purpose       : To validate the Shopping Bag present in the Home page of site
	 * Author        : Shiva
	 * Date Created  : 29/05/18
	 * Date Modified :
	 * Reviewed By   : 
	 * ******************************************************
	 */
	public boolean validateShoppingBag() throws Exception
	{
		try
		{
			boolean status=DXL_SHOPPINGBAG.isDisplayed();
			System.out.println(status);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	/* ****************************************************
	 * Method Name   : validateCategory(String categoryName)
	 * Purpose       : To validate the Category present in the Home page of site
	 * Author        : Shiva
	 * Date Created  : 29/05/18
	 * Date Modified :
	 * Reviewed By   : 
	 * ******************************************************
	 */
	public boolean validateCategory(String categoryName) throws Exception
	{
		try
		{
			WebElement CATEGORY=DriverFactory.getInstance().getDriver().findElement(By.xpath(CATEGORY1+categoryName+CATEGORY2));
			boolean status=CATEGORY.isDisplayed();
			System.out.println(status);
			System.out.println("Validation with "+ categoryName +" is successful");
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	/* ****************************************************
	 * Method Name   : browseFromSubCategory(String categoryName, String sub_CtegoryName)
	 * Purpose       : To validate the Sub_Category present in the Home page of site
	 * Author        : Shiva
	 * Date Created  : 29/05/18
	 * Date Modified :
	 * Reviewed By   : 
	 * ******************************************************
	 */
	public boolean browseFromSubCategory(String categoryName, String sub_CtegoryName) throws Exception
	{
		try
		{
			WebElement CATAGORY=DriverFactory.getInstance().getDriver().findElement(By.xpath(CATEGORY1+categoryName+CATEGORY2));
			Actions act=new Actions(DriverFactory.getInstance().getDriver());
			act.moveToElement(CATAGORY).build().perform();
			WebElement Sub_CATAGORY=DriverFactory.getInstance().getDriver().findElement(By.xpath(CATEGORY1+sub_CtegoryName+CATEGORY2));
			Thread.sleep(3000);
			Sub_CATAGORY.click();
			Thread.sleep(3000);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	/* ****************************************************
	 * Method Name   : browseFromSubSubCategory(String categoryName, String sub_CtegoryName, String sub_Sub_Ctegory)
	 * Purpose       : To validate the SubSub_Category present in the Home page of site
	 * Author        : Shiva
	 * Date Created  : 29/05/18
	 * Date Modified :
	 * Reviewed By   : 
	 * ******************************************************
	 */
	public boolean browseFromSubSubCategory(String categoryName, String sub_CtegoryName, String sub_Sub_Ctegory) throws Exception
	{
		try
		{
			WebElement CATAGORY=DriverFactory.getInstance().getDriver().findElement(By.xpath(CATEGORY1+categoryName+CATEGORY2));
			Actions act=new Actions(DriverFactory.getInstance().getDriver());
			act.moveToElement(CATAGORY).build().perform();
			Thread.sleep(3000);
			
			Actions act2=new Actions(DriverFactory.getInstance().getDriver());
			WebElement Sub_CATAGORY=DriverFactory.getInstance().getDriver().findElement(By.xpath(CATEGORY1+sub_CtegoryName+CATEGORY2));
			act2.moveToElement(Sub_CATAGORY).build().perform();
			Thread.sleep(3000);
			WebElement Sub_Sub_CATAGORY=DriverFactory.getInstance().getDriver().findElement(By.xpath(CATEGORY1+sub_Sub_Ctegory+CATEGORY2));
			Sub_Sub_CATAGORY.click();
			Thread.sleep(3000);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
}

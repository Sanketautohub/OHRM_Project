package library.OHRM;

import java.io.IOException;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage_OHRM extends AppUtils{
	public void login(String uid, String pass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public boolean adminLogin()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public boolean invalidLoginCredentials()
	{
		String errmsg;
		
		errmsg = driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]")).getText();
		
		if(errmsg.toLowerCase().contains("invalid"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public boolean isEmployeeModuleDisplayed() throws IOException
	{
		try{
		driver.findElement(By.linkText("Admin")).isDisplayed();
		
			return false;
		}
		catch(Exception e)
		{
			return true;
		}
		
		
	}

}

package library.OHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class UserPage_OHRM extends AppUtils{
	
	public boolean addUser(String role,String empname,String usename, String pass ) throws InterruptedException
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
	
		Select rolelist = new Select(driver.findElement(By.id("systemUser_userType")));
		rolelist.selectByVisibleText(role);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);//Magma John Nikolas
		driver.findElement(By.id("systemUser_userName")).sendKeys(usename);//Magma
		driver.findElement(By.id("systemUser_password")).sendKeys(pass);//Magma@123
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pass);//Magma@123
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(usename);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement table = driver.findElement(By.id("resultTable"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		boolean tc = false;
		for(int i= 1; i<rows.size(); i++) 
		{
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			
			if (col.get(1).getText().equals(usename)) 
			{
				tc= true;
				break;
			}
		}
		 return tc;
	}
	
	
	
	public boolean PersonalDetails(String Mname, String Oid,String licDate, String maritalsts, String nationality) throws InterruptedException
	{
		final String Aname="Sujeet";
		boolean cond = false;
		driver.findElement(By.linkText("My Info")).click();
		Thread.sleep(2000);
		String Ename = driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value");
		
		if(Aname.equals(Ename)) {
			if(cond = true) 
			{
		      driver.findElement(By.id("btnSave")).click();
		
		      driver.findElement(By.id("personal_txtEmpMiddleName")).clear();
		      driver.findElement(By.id("personal_txtEmpMiddleName")).sendKeys(Mname);
		
		      driver.findElement(By.id("personal_txtOtherID")).clear();
		      driver.findElement(By.id("personal_txtOtherID")).sendKeys(Oid);
		
		      driver.findElement(By.id("personal_txtLicExpDate")).clear();
		      driver.findElement(By.id("personal_txtLicExpDate")).sendKeys(licDate);
		
		      Select marital = new Select(driver.findElement(By.id("personal_cmbMarital")));
		      marital.selectByVisibleText(maritalsts);
		
		      driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		
		      Select national = new Select(driver.findElement(By.id("personal_cmbNation")));
		      national.selectByVisibleText(nationality);
		 
		      driver.findElement(By.id("btnSave")).click();
			}
		}
		return cond;
	}

	
	
	public boolean PersonalCostomFields(String elle, String Comment)
	{	
		driver.findElement(By.linkText("My Info")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.className("head")));
		boolean cond = false;
		
		String Actual=driver.findElement(By.partialLinkText("Welcome")).getText();
		String Expect= "Sujeet";
		
		if(Actual.contains(Expect))
		{
		if(cond=true)
		{
			driver.findElement(By.id("btnEditCustom")).click();
			
			WebElement ellergies = driver.findElement(By.name("custom8"));
			Select sel = new Select(ellergies);
			sel.selectByVisibleText(elle);
			
			driver.findElement(By.id("custom9")).sendKeys(Comment);
			
			driver.findElement(By.id("btnEditCustom")).click();
		}
		}
		return cond;
	
	}
	
	
	
	public boolean AddUsersFile(String Comment) throws InterruptedException
	{
		
		boolean cond = false;
		driver.findElement(By.linkText("My Info")).click();
		String ExpectItem = driver.findElement(By.xpath("//h1[contains(text(),'Sujeet Shankar Bramhanand')]")).getText();
		String ActualItem = "Shankar Bramhanand";
		
		if (ExpectItem.contains(ActualItem)) 
		{
			
			if (cond=true) 
			{
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//h1[contains(text(),'Attachments')]")));
				
				driver.findElement(By.id("btnAddAttachment")).click();
				
				try {
				     driver.findElement(By.id("ufile")).sendKeys("D:\\Project_Hydrabad\\DemoFile.txt");
				     driver.findElement(By.id("txtAttDesc")).sendKeys(Comment);
				     Thread.sleep(2000);
				     WebElement button = driver.findElement(By.id("btnSaveAttachment"));
				     Actions Act = new Actions(driver);
				     Act.moveToElement(button).click().build().perform();
				     }
				     catch (Exception e) 
				     {
				     }
			}
			
		}
		return cond;
	}
}





//driver.findElement(By.id("btnEditCustom")).click();
//
//WebElement ellergies = driver.findElement(By.name("custom8"));
//Select sel = new Select(ellergies);
//sel.selectByVisibleText(elle);
//
//driver.findElement(By.id("custom9")).sendKeys(Comment);
//
//driver.findElement(By.id("btnEditCustom")).click();




















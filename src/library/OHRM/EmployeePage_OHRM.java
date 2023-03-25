package library.OHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class EmployeePage_OHRM extends AppUtils{
	
	
	public boolean addEmployee(String fname, String lname)
	{
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);//Magma
		driver.findElement(By.id("lastName")).sendKeys(lname);//Nikolas
		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
		boolean tc = false;
		WebElement table = driver.findElement(By.id("resultTable"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i = 1; i<rows.size(); i++)
		{
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			
			if(col.get(1).getText().equalsIgnoreCase(empid)) 
			{
				tc = true;
				break;
			}
			
		}
		return tc;
	}
	
	
	
	
	public boolean addEmployee(String fname, String mname,String lname)
	{
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);//Magma
		driver.findElement(By.id("middleName")).sendKeys(mname);//Jhon
		driver.findElement(By.id("lastName")).sendKeys(lname);//Nikolas
		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
		boolean tc = false;
		WebElement table = driver.findElement(By.id("resultTable"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i = 1; i<rows.size(); i++)
		{
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			
			if(col.get(1).getText().equalsIgnoreCase(empid)) 
			{
				tc = true;
				break;
			}
			
		}
		return tc;
	}
	

}

package miscellaneousTests_OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class UsersContactDetails extends AppUtils{
	
	public void CheckingAllTextFilds(String street1,String street2,String city,String province,String zip,String country,String tel,String mob,String Wtel,String Wemail,String oemail)
	{
		
		driver.findElement(By.linkText("My Info")).click();
		
		driver.findElement(By.linkText("Contact Details")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("contact_street1")).isEnabled();
		driver.findElement(By.id("contact_street1")).sendKeys(street1);
		
		driver.findElement(By.id("contact_street2")).isEnabled();
		driver.findElement(By.id("contact_street2")).sendKeys(street2);
		
		driver.findElement(By.id("contact_city")).isEnabled();
		driver.findElement(By.id("contact_city")).sendKeys(city);
		
		driver.findElement(By.id("contact_province")).isEnabled();
		driver.findElement(By.id("contact_province")).sendKeys(province);
		
		driver.findElement(By.id("contact_emp_zipcode")).isEnabled();
		driver.findElement(By.id("contact_emp_zipcode")).sendKeys(zip);
		
		WebElement ele = driver.findElement(By.id("contact_country"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(country);
		
		driver.findElement(By.id("contact_emp_hm_telephone")).isEnabled();
		driver.findElement(By.id("contact_emp_hm_telephone")).sendKeys(tel);
		
		driver.findElement(By.id("contact_emp_mobile")).isEnabled();
		driver.findElement(By.id("contact_emp_mobile")).sendKeys(mob);
		
		driver.findElement(By.id("contact_emp_work_telephone")).isEnabled();
		driver.findElement(By.id("contact_emp_work_telephone")).sendKeys(Wtel);
		
		driver.findElement(By.id("contact_emp_work_email")).isEnabled();
		driver.findElement(By.id("contact_emp_work_email")).sendKeys(Wemail);
		
		driver.findElement(By.id("contact_emp_oth_email")).isEnabled();
		driver.findElement(By.id("contact_emp_oth_email")).sendKeys(oemail);
		
		driver.findElement(By.id("btnSave")).click();



		
		
		
		
		
	}

}

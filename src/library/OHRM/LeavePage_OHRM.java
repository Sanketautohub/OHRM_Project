package library.OHRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.AppUtils;

public class LeavePage_OHRM extends AppUtils{
	
	public boolean employeeLeaves(String ename,String LeaveType, String FDate, String TDate) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Assign Leave")).click();
		
		//another way use to send data in textbox
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("doucument.getElementByID('assignleave_txtEmployee_empName').value ='Sujeet Bramhanand';");
		
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys(ename);
		Select leaveType = new Select( driver.findElement(By.id("assignleave_txtLeaveType")));
		leaveType.selectByValue(LeaveType);
		
		driver.findElement(By.id("assignleave_txtFromDate")).clear();
		driver.findElement(By.id("assignleave_txtFromDate")).sendKeys(FDate);//2023-04-10
		driver.findElement(By.id("assignleave_txtToDate")).clear();
		driver.findElement(By.id("assignleave_txtToDate")).sendKeys(TDate);//2023-04-20
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='assignBtn']"))).click(); 
//		driver.findElement(By.xpath("//input[@id='assignBtn']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='assignBtn']"))).click(); 


		WebElement popbutton;
		popbutton =wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmOkButton")));
		popbutton.click(); 
		
		
		driver.findElement(By.linkText("Leave List")).click();
		driver.findElement(By.id("calFromDate")).clear();
		driver.findElement(By.id("calFromDate")).sendKeys(FDate);
		driver.findElement(By.id("calToDate")).clear();
		driver.findElement(By.id("calToDate")).sendKeys(TDate);
		driver.findElement(By.id("leaveList_chkSearchFilter_2")).click();
		driver.findElement(By.id("leaveList_txtEmployee_empName")).sendKeys(ename);
		driver.findElement(By.id("btnSearch")).click();
		
		Thread.sleep(2000);
		
	    WebElement table= driver.findElement(By.id("resultTable"));
	    
	    List<WebElement> row = table.findElements(By.tagName("tr"));
	    boolean condition= false;
	    for(int i=1; i<row.size(); i++)
	    {
	    	List<WebElement> col = row.get(i).findElements(By.tagName("td"));
	    	
	    	
	    		String equal = col.get(0).getText();
	    		System.out.println(equal);
	    		if(col.get(0).getText().equals(equal))
	    		{
	    			condition= true;
	    			break;
	    		}
	    	
	    	
	    }
		return condition;
	}
	

}

package testCases.OHRM;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.OHRM.UserLoginUtils;
import library.OHRM.UserPage_OHRM;

public class TC_UP_01AddUsersPersonalDataTest extends UserLoginUtils{
	
	@Parameters({"Mname","Oid","ExDate","Mstatus","Nationality"})
	@Test
	public void addUserPersonalDetails(String mname,String oid,String date,String mstatus,String Nat ) throws InterruptedException
	{
		
		UserPage_OHRM up =new UserPage_OHRM();
		boolean res=up.PersonalDetails(mname, oid, date, mstatus, Nat);
		if(res)
		{
			System.out.println("Users Personal Details Add");
		}
		else 
		{
			System.out.println("User Page Mismatch, Not Actual User");
			Assert.assertTrue(res);
		}
		
	}

}

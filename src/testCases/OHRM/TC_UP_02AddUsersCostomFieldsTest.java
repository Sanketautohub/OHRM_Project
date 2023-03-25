package testCases.OHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

import library.OHRM.UserLoginUtils;
import library.OHRM.UserPage_OHRM;

public class TC_UP_02AddUsersCostomFieldsTest extends UserLoginUtils{
	
	@Test
	public void addCostomFileds() 
	{
		UserPage_OHRM up = new UserPage_OHRM();
		boolean res=up.PersonalCostomFields("shellfish", "Cant digest, Suffering with vomiting");
		if(res) 
		{
			System.out.println("Sujeets Costom Fields Add");	
		}
		else
		{
			System.out.println("Its Not Sujeets Costom Field");
			Assert.assertTrue(res);
		}
	}

}

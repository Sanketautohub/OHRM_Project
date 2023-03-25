package testCases.OHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

import library.OHRM.UserLoginUtils;
import library.OHRM.UserPage_OHRM;

public class TC_UP_03AddUserAttachmentFileTest extends UserLoginUtils{
	
	@Test
	public void userAttachmentFile() throws InterruptedException
	{
		
		UserPage_OHRM up = new UserPage_OHRM();
		boolean res = up.AddUsersFile("Very Important File For User Prespective,\nTo Open The File Password is Required.\n\tPass-Hint\n\tTravel");
		if (res) 
		{
		   System.out.println("User File Has Been Attached");	
		}
		else
		{
		   System.out.println("User Page Not Open");
		   Assert.assertTrue(res);
		}
		
	}

}

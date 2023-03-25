package testCases.OHRM;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.OHRM.AdminLoginUtils;
import library.OHRM.UserPage_OHRM;

public class TC_UP_00CheckAddingUserWithValidInput extends AdminLoginUtils{
	
	@Parameters({"role","epname","user","upass"})
	@Test
	public void addUserWithValidInputData(String role,String epname,String usename,String npass) throws InterruptedException {
		
		
		
		UserPage_OHRM up = new UserPage_OHRM();
		boolean res= up.addUser(role, epname, usename, npass);
		
		if(res)
		{
			System.out.println("New User Add Successfully");
		}
		else
		{
			System.out.println("New User Not Added");
		}
}

}

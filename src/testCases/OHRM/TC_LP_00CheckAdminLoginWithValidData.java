package testCases.OHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

import library.OHRM.AdminLoginUtils;
import library.OHRM.LoginPage_OHRM;

public class TC_LP_00CheckAdminLoginWithValidData extends AdminLoginUtils{
	
	@Test
	public void loginAdminPage() {
		
		LoginPage_OHRM lp = new LoginPage_OHRM();
		
	    boolean res=lp.adminLogin();
	    Assert.assertTrue(res);
	   
		
	}
	
	
	

}

package testCases.OHRM;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.OHRM.LoginPage_OHRM;
import utils.AppUtils;

public class TC_LP_01CheckAdminLoginWithInvalidData extends AppUtils{
	
	@Parameters({"uid","pass"})
	@Test
	public void LoginAdminWithInvalidData(String uid, String pass) {
		
		LoginPage_OHRM lp= new LoginPage_OHRM();
		lp.login(uid, pass);
	    boolean res= lp.invalidLoginCredentials();
	    Assert.assertTrue(res);
		
	}

}

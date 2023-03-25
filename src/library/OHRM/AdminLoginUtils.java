package library.OHRM;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class AdminLoginUtils extends AppUtils{
	String AdminUid= "Admin";
	String AdminPwd= "Qedge123!@#";
	
	
	LoginPage_OHRM lp;
	
	@BeforeTest
	public void adminLogin()
	{
		lp =new LoginPage_OHRM();
		lp.login(AdminUid, AdminPwd);
	}
	
	@AfterTest
	public void adminLogout()
	{
		lp.logout();
	}

}

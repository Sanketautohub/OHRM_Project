package library.OHRM;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class UserLoginUtils extends AppUtils{
	
	String UserUID= "SujBramha";
	String UserPWD= "Sujeet123!@#";
	
	LoginPage_OHRM lp;
	
	@BeforeTest
	public void userLogin()
	{
		 lp = new LoginPage_OHRM();
		 lp.login(UserUID, UserPWD);
	}
	
	@AfterTest
	public void userLogout()
	{
		lp.logout();
	}

}

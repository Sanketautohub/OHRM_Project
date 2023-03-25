package testCases.OHRM;

import org.testng.annotations.Test;

import library.OHRM.LoginPage_OHRM;
import miscellaneousTests_OHRM.UsersContactDetails;
import utils.AppUtils;

public class TC_MT_01AddUserContactDetailsTest extends AppUtils{
	
	
	@Test
	public void contactDetails()
	{
		LoginPage_OHRM lp = new LoginPage_OHRM();
		lp.login("SujBramha", "Sujeet123!@#");
		
		UsersContactDetails uc = new UsersContactDetails();
		uc.CheckingAllTextFilds("Flower Building", "Atlus Square", "New York", "Wasington DC", "US12000025", "American Samoa", "22455-45852","9658474125", "22554-84848", "magama@gmail.com", "sujeet@gmail.com");
		
		lp.logout();
		
	}

}

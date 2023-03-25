package testCases.OHRM;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.OHRM.LoginPage_OHRM;
import utils.AppUtils;

public class TC_EP_01CheckEmpModuleLoginIsDisplyed extends AppUtils{
	
	
	@Parameters({"uuid","upass"})
	@Test
	public void employeeModuleLoginTest(String uid, String Pass) throws IOException {
		
		LoginPage_OHRM lp = new LoginPage_OHRM();
		lp.login(uid, Pass);
		
		boolean res= lp.isEmployeeModuleDisplayed();
		if(res)
		{
			System.out.println("Employee Module Displayed, Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		
		lp.logout();
	}

}

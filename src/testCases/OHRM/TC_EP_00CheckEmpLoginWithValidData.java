package testCases.OHRM;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.OHRM.AdminLoginUtils;
import library.OHRM.EmployeePage_OHRM;

public class TC_EP_00CheckEmpLoginWithValidData extends AdminLoginUtils{
	
	
	@Parameters({"Fname","Lname"})
	@Test
	public void employeeLoginValidData(String Fname, String Lname) {
		
		EmployeePage_OHRM ep = new EmployeePage_OHRM();
		boolean res=ep.addEmployee(Fname, Lname);
		if(res) 
		{		
	    	System.out.println("Epmloyee Registration Successfull");
	    	
	    }
	    else
	    {
	    	
	    	System.out.println("Epmloyee Registration Not Successfull");
	    }	
	}

}

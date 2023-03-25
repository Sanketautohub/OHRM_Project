package testCases.OHRM;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.OHRM.AdminLoginUtils;
import library.OHRM.LeavePage_OHRM;

public class TC_EP_02CheckEmpLeavesGenrated extends AdminLoginUtils{
	
	@Parameters({"empname","leavetype","fromdate","todate"})
	@Test
	public void EmployeeLeavesGarants(String Ename, String ltype, String Fdate,String Tdate) throws InterruptedException
	{
	
		LeavePage_OHRM lv = new LeavePage_OHRM();
		boolean res = lv.employeeLeaves(Ename,ltype,Fdate,Tdate);
		if(res)
		{
			System.out.println("Leave Genrated");
		}
		else
		{
			System.out.println("Leaves Not Genrated");
		}
		
	
		
 }

}

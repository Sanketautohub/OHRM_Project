package testCases.OHRM;

import org.testng.annotations.Test;

import library.OHRM.AdminLoginUtils;
import miscellaneousTests_OHRM.Brokenlinks;

public class TC_MT_00CheckBrokenLinksInTest extends AdminLoginUtils{
	
	@Test
	public void brokenLinkCount()
	{
		
		Brokenlinks link = new Brokenlinks();
		link.findingBrokenLinks();
	}

}

package miscellaneousTests_OHRM;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class Brokenlinks extends AppUtils
{
	
	public void findingBrokenLinks() 
	{
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		int rescode=200;
		int brokenlinkcount = 0;
		System.out.println("Total link on page: "+allLinks.size());
		for(WebElement itrate : allLinks)
		{
			String url = itrate.getAttribute("href");
			
			try 
			{
			
				URL urllink = new URL(url);
				
				HttpURLConnection hub= (HttpURLConnection)urllink.openConnection();
				hub.setRequestMethod("HEAD");
				hub.connect();
				
				rescode= hub.getResponseCode();
				if(rescode>=400)
				{
					System.out.println(url+":- "+"Broken Link");
					brokenlinkcount ++;
				}
				
			}
			catch (Exception e) 
			{
				
			}	
		}
		System.out.println("Total Broken Links Presents on page"+" "+brokenlinkcount);
	}

}

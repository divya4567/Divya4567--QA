import com.thoughtworks.selenium.DefaultSelenium;
public class Google_link1 {
	public static DefaultSelenium selenium;
	public static String str=null;
	public static void wait(String str) throws Exception
	{
		for (int i = 0; i < 30; i++) {
			if(selenium.isElementPresent(str))
			{
				Thread.sleep(1000);
				selenium.isVisible(str);
				break;
			}
		}
	}
	public static String openURL()
	{
		selenium=new DefaultSelenium("localhost",1213,str,"http://");
		selenium.start();
		selenium.setTimeout("1000000");
		selenium.open("http://www.google.co.in/");
		selenium.windowMaximize();
		
		return "Pass";
	}
	public static String hindi() throws Exception
	{
		try{
			selenium.click("link=Hindi");
			wait("link=English");
			selenium.click("link=English");
			Thread.sleep(6000);	
		}catch(Exception e){e.printStackTrace();}
		
		return "Pass";
	}
	public static String bengali() throws Exception
	{
		selenium.click("link=Bengali");
		Thread.sleep(6000);
		selenium.click("link=English");
		Thread.sleep(6000);
		return "Pass";
	}
	public static String telugu() throws Exception
	{
		selenium.click("link=Telugu");
		Thread.sleep(6000);
		selenium.click("link=English");
		Thread.sleep(6000);
		return "Pass";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		str="*firefox";
		for (int i = 0; i < 2; i++) {
			openURL();
			hindi();
			bengali();
			telugu();
		}	
		}
		
		

}

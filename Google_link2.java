import com.thoughtworks.selenium.DefaultSelenium;
public class Google_link2 {
	private static DefaultSelenium selenium=new DefaultSelenium("localhost",1212,"*firefox","http://");
	public static String openURL()
	{
		selenium.start();
		selenium.open("http://www.google.co.in/");
		selenium.windowMaximize();
		return "Pass";
	}
	public static String Click_link(String str) throws Exception
	{
		selenium.click("link="+str);
		Thread.sleep(6000);
		selenium.click("link=English");
		Thread.sleep(6000);
		return "Pass";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		openURL();
		Click_link("Hindi");
		Click_link("Bengali");
		Click_link("Telugu");
	}

}

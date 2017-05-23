import com.thoughtworks.selenium.DefaultSelenium;


public class GooglesSearch extends DriverScript{

	public static String gs()
	{
		//DefaultSelenium selenium=new DefaultSelenium("localhost",1212,"*firefox","http://");
		//selenium.start();
		//selenium.open("http://google.co.in");
		//selenium.windowMaximize();
		selenium.type("gbqfq", "Nagesh");
		selenium.click("gbqfb");
		
		return "Pass";
	}

	

}





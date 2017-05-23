
public class Mail_Login extends DriverScript{
//public static DefaultSelenium selenium=new DefaultSelenium("localhost",1212,"*firefox","http://");
	public static String openURL()
	{
		/*selenium.start();
		selenium.open("http://www.mail.in.com/");
		selenium.windowMaximize();*/
		return "Pass";
	}
	public static String login()
	{
		selenium.type("f_id", "mar1selenium");
		selenium.type("f_pwd", "selenium");
		selenium.click("css=input.signin");
		selenium.waitForPageToLoad("30000");
		return "Pass";
	}
	public static String logout()
	{
		if(selenium.isElementPresent("link=Sign out"))
		{
		selenium.click("link=Sign out");
		System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}

		return "Pass";
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	

	}

}

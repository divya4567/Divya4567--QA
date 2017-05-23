
public class Mail_Reg extends Mail_Login{

	public static String reg() throws Exception
	{
		selenium.click("css=input.registernow");
		selenium.waitForPageToLoad("30000");
		selenium.type("fname", "Nagesh");
		selenium.select("day", "5");
		selenium.select("month", "Apr");
		selenium.select("id=year", "label=2001");
		selenium.type("id=username", "nagesh2001");
		selenium.type("id=password", "nagesh123");
		selenium.type("id=repassword", "nagesh123");
		selenium.type("id=altemail", "nag@gmail.com");
		selenium.click("id=imageField");
		Thread.sleep(2000);
		selenium.click("id=imageField");
		selenium.select("mcountry", "India");

		
		return "Pass";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		openURL();
		reg();
	}

}

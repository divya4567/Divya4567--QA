

import com.thoughtworks.selenium.DefaultSelenium;


public class register {
		
	public static DefaultSelenium selenium = new DefaultSelenium("localhost", 1212, "*firefox", "http://mail.in.com");
	public static void main(String[] args)throws Exception {
	
	selenium.start();
	selenium.open("http://mail.in.com");
	selenium.waitForPageToLoad("20000");
	selenium.windowMaximize();
String str=selenium.getText("//html/body/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/form/div/div[1]/p[2]");
	System.out.println("The value is "+str);
/*	selenium.click("css=input.registernow");
	Thread.sleep(5000);
	selenium.type("fname","skpsadaff");
	selenium.select("day", "3");
	selenium.select("month", "Jun");
	selenium.select("year", "1994");
	selenium.type("username", "kumarsarat");
	selenium.type("password", "selenium");
	selenium.type("repassword", "selenium");
	selenium.type("altemail", "mar1selenium@gmail.com");
	selenium.type("mobileno", "9938423933");
	selenium.click("imageField");*/
	}
	

	
	
}

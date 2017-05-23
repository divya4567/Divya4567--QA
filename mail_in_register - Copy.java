

import com.thoughtworks.selenium.DefaultSelenium;


public class mail_in_register {
		
	public static DefaultSelenium selenium = new DefaultSelenium("localhost", 1212, "*firefox", "http://mail.in.com");
	public static void main(String[] args)throws Exception {
	
	selenium.start();
	selenium.open("http://mail.in.com");
	selenium.waitForPageToLoad("20000");
	selenium.windowMaximize();
	selenium.click("css=input.registernow");
	


	}
	
	}

	
	


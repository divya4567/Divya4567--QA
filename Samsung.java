import com.thoughtworks.selenium.DefaultSelenium;


public class Samsung {

	/**
	 * @param args
	 */
	private static DefaultSelenium selenium=new DefaultSelenium("localhost",1213,"*firefox","http://");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selenium.start();
		selenium.setTimeout("100000");
		selenium.open("http://www.samsung.com/in/info/contactus.html");
		selenium.windowMaximize();
		selenium.click("link=E-mail Samsung");
		selenium.waitForPopUp("_blank", "30000");
		selenium.type("id=FIRST_NAME", "nagesh");

	}

}

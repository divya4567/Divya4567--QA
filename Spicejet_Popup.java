import com.thoughtworks.selenium.DefaultSelenium;


public class Spicejet_Popup {
	public static DefaultSelenium selenium=new DefaultSelenium("localhost",1234,"*firefox","http://");
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		selenium.start();
		selenium.open("http://spicejet.com");
		selenium.windowMaximize();
		selenium.click("id=oneWayRadio");
		selenium.select("id=from1Select", "label=Hyderabad");
		selenium.select("id=to1Select", "label=Vizag");
		selenium.click("css=#to1Select > option[value=\"VTZ\"]");
		selenium.click("id=departDate1text");
		selenium.click("link=5");
		selenium.click("id=submitBtn");
		selenium.getConfirmation();
		Thread.sleep(10000);
		selenium.click("id=m1f1r1");
		selenium.click("id=converterButton");
		selenium.waitForPopUp("converter", "30000");
		selenium.selectWindow("name=converter");
		selenium.type("id=amountText", "100");
		selenium.select("name=convert_from", "label=US Dollar (USD)");
		selenium.select("name=convert_to", "label=Indian Rupee (INR)");
		Thread.sleep(2000);
		selenium.click("id=closeButton");
		Thread.sleep(2000);
		//selenium.waitForPageToLoad("30000");
		selenium.selectWindow("null");
		selenium.click("id=nextDayButton1");
		selenium.waitForPageToLoad("30000");

	}

}

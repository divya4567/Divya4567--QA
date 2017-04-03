import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 1212, "*chrome", "http://www.mail.in.com/");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
		selenium.open("/");
		selenium.windowMaximize();
		selenium.click("css=input.registernowjgfjvku");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=fname", "nagesh");
		selenium.select("id=day", "label=13");
		selenium.select("id=month", "label=Mar");
		selenium.select("id=year", "label=2000");
		selenium.type("id=username", "nagesh_2000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}

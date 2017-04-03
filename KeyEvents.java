import java.awt.event.KeyEvent;

import com.thoughtworks.selenium.DefaultSelenium;
public class KeyEvents {
	public static DefaultSelenium selenium = new DefaultSelenium("localhost", 1212, "*firefox", "http://mail.in.com");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selenium.start();
		selenium.open("http://www.google.com");
		selenium.windowMaximize();
		selenium.setCursorPosition("f_id", "1");
	    selenium.keyDownNative(Integer.toString(KeyEvent.VK_SHIFT));
	    selenium.keyPressNative(String.valueOf(KeyEvent.VK_D));
	    selenium.keyPressNative(Integer.toString(KeyEvent.VK_SEMICOLON));
	    selenium.keyUpNative(Integer.toString(KeyEvent.VK_SHIFT));
	    selenium.keyPressNative(Integer.toString(KeyEvent.VK_SLASH)); 
	    selenium.keyPressNative(String.valueOf(KeyEvent.VK_S));
	    selenium.keyPressNative(String.valueOf(KeyEvent.VK_E));
	    selenium.keyPressNative(String.valueOf(KeyEvent.VK_L));
	    selenium.keyPressNative(String.valueOf(KeyEvent.VK_E));
	    selenium.keyPressNative(String.valueOf(KeyEvent.VK_N));

	}

}

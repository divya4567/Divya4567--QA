import org.testng.annotations.Test;

public class TestNG {

	@Test(priority=1)
	public  void login(){
		System.out.println("login successful");
		
		}
	@Test(priority=2)
	public void deposit(){
		System.out.println("deposit successful");
		
	}
	@Test(priority=3)
	public void withdraw(){
		System.out.println("withdraw successful");
	}
	@Test(priority=4)
	public void logout(){
		System.out.println("loug out successful");
	}
}

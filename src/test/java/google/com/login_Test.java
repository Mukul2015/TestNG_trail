package google.com;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login_Test extends Parent_BaseTest{
	
	@Test(dataProvider="getData",groups= {"datadriven"})
	public void passedlogin(String username, String password) {
		openchromebrowser();
		System.out.println("Username is "+username+ " and url is "+password); 
	
		System.out.println("passedlogin");
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] obj=new Object[3][2];
		obj[0][0]="User1";
		obj[0][1]="Pass1";
		obj[1][0]="User2";
		obj[1][1]="Pass2";
		obj[2][0]="User3";
		obj[2][1]="Pass3";
		
		return obj;
	}
	
	
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("After Suite");
	}
	@Parameters({ "url"})
	@Test(timeOut=10000)
	public void failedloggin(String site) {
		System.out.println("failedloggin");
		System.out.println("Website in login test class is : "+site);

	}
	
	@BeforeTest
	public void b4test() {
		System.out.println("Before test");
	}
	
	


}

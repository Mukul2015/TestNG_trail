package google.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class UI_Test extends Parent_BaseTest {

private static Logger log=LogManager.getLogger(UI_Test.class.getName());	
	
	
	@BeforeSuite
	public void b4suite() {
		System.out.println("Before Suite");
		 System.out.println("Working Directory = " +
	              System.getProperty("user.dir"));
	}
	
	@Parameters({"username", "url"})
	@Test
	public void menutest(String us, String site) {
		log.info("this is a log");
		System.out.println("Runs menutest");
		System.out.println("Username is "+us+ " and url is "+site);
	}
	
	@Test
	public void buttontest() throws IOException {
		 System.out.println("Working Directory = " +
	              System.getProperty("user.dir"));
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".//properties//Globel_Parameters.properties");
		//System.getProperty("user.dir")+"//properties//Globel_Parameters.properties");
		prop.load(fis);
		String b1=prop.getProperty("browser1");
		if(b1.equalsIgnoreCase("ie"))
			System.out.println("IE");
		else {
			System.out.println("No IE in properties");
			}
			System.out.println("In properties: "+ b1);
			
		System.out.println("Runs buttontest");

	}
	@Test
	public void contact() {
		System.out.println("Runs contact");

	}


}

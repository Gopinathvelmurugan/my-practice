package com.automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;
import com.base_class.Page_Object_Manager;

public class Particular_Data extends Base_Class {

	public static WebDriver driver = browser_configuration("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Particular_Data.class);

	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		getUrl("http://automationpractice.com/index.php");
		
		log.info("url launch");
		
		implicitywait(30, TimeUnit.SECONDS);
		// Home Page
		ClickOnElement(pom.get_instance_Hp().getSigninbutton());
       
		
		String username = Particular_Data(
"C:\\Users\\DELL\\eclipse-workspace\\Learnings\\Mavenpractice_Examples\\Testcases\\Test  case Automation.xlsx",
				2, 5);

		String password = Particular_Data(
"C:\\Users\\DELL\\eclipse-workspace\\Learnings\\Mavenpractice_Examples\\Testcases\\Test  case Automation.xlsx",
				7, 5);
		// Login Page
		inputValueElement(pom.get_instance_login().getMailid(), username);
		inputValueElement(pom.get_instance_login().getPassword(), password);
		ClickOnElement(pom.get_instance_login().getSubmitbutton());
		// All Products
		ClickOnElement(pom.get_instance_products().getWomensdress());
		// Womens products

		ClickOnElement(pom.get_instance_wp().getShowtype());

		// printed clothes

		ClickOnElement(pom.get_instance_DD().getPrintedclothes());

		// Dress Details

		String quantity = Particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Learnings\\Mavenpractice_Examples\\Testcases\\Test  case Automation.xlsx",26 ,5 );
		
		String size = Particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Learnings\\Mavenpractice_Examples\\Testcases\\Test  case Automation.xlsx",28 ,5 );
		
		

		inputValueElement(pom.get_instance_DD().getSize(),size );
		
		inputValueElement(pom.get_instance_DD().getQuantity(),quantity );

		ClickOnElement(pom.get_instance_DD().getColor());

		ClickOnElement(pom.get_instance_DD().getTocart());

		ClickOnElement(pom.get_instance_cart().getCheckout1());

		ClickOnElement(pom.get_instance_cart().getCheckout2());

		ClickOnElement(pom.get_instance_cart().getCheckout3());

		ClickOnElement(pom.get_instance_acceptcart().getTermsandcond_Btn());

		ClickOnElement(pom.get_instance_acceptcart().getCheckout4());

		ClickOnElement(pom.get_instance_bank().getPaybutton());

		ClickOnElement(pom.get_instance_co().getOrder());

		// endSession("quit");

	}

}

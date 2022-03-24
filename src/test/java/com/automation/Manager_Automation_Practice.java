package com.automation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;
import com.base_class.Page_Object_Manager;

public class Manager_Automation_Practice extends Base_Class {

	public static WebDriver driver = browser_configuration("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static Logger log = Logger.getLogger(Manager_Automation_Practice.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		getUrl("http://automationpractice.com/index.php");
		log.info("successfully launched url ");
		implicitywait(30, TimeUnit.SECONDS);
		
		// Home Page
		ClickOnElement(pom.get_instance_Hp().getSigninbutton());
		
		// Login Page
		inputValueElement(pom.get_instance_login().getMailid(), "velgopi238@gmail.com");
		inputValueElement(pom.get_instance_login().getPassword(), "Velgopi@2308");
		ClickOnElement(pom.get_instance_login().getSubmitbutton());

		// All Products

		ClickOnElement(pom.get_instance_products().getWomensdress());

		// Womens products

		ClickOnElement(pom.get_instance_wp().getShowtype());

		// printed clothes

		ClickOnElement(pom.get_instance_DD().getPrintedclothes());

		// Dress Details

		inputValueElement(pom.get_instance_DD().getQuantity(), "5");

		inputValueElement(pom.get_instance_DD().getSize(), "3");

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

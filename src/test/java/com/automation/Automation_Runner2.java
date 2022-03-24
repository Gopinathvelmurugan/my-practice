package com.automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base_class.Accept_Addtocart;
import com.base_class.Addtocart;
import com.base_class.All_Products;
import com.base_class.Base_Class;
import com.base_class.By_Bank;
import com.base_class.Confirm_Order;
import com.base_class.Dress_Details;
import com.base_class.Home_Page;
import com.base_class.Login_Page;
import com.base_class.Womens_Product;

public class Automation_Runner2 extends Base_Class {

	public static void main(String[] args) throws IOException, InterruptedException {

		driver = browser_configuration("chrome");

		getUrl("http://automationpractice.com/index.php");

		implicitywait(30, TimeUnit.SECONDS);

		Home_Page hp = new Home_Page(driver);
		ClickOnElement(hp.getSigninbutton());

		Login_Page login = new Login_Page(driver);

		inputValueElement(login.getMailid(), "velgopi238@gmail.com");
		inputValueElement(login.getPassword(), "Velgopi@2308");

		ClickOnElement(login.getSubmitbutton());

		All_Products product = new All_Products(driver);

		ClickOnElement(product.getWomensdress());

		Womens_Product wp = new Womens_Product(driver);

		ClickOnElement(wp.getShowtype());

		Dress_Details details = new Dress_Details(driver);

		ClickOnElement(details.getPrintedclothes());

		ClickOnElement(details.getQuantity());
		clear(details.getQuantity());
		inputValueElement(details.getQuantity(), "5");

		dropdown("byvalue", details.getSize(), "3");

		ClickOnElement(details.getColor());

		ClickOnElement(details.getTocart());

		Addtocart cart = new Addtocart(driver);

		ClickOnElement(cart.getCheckout1());

		ClickOnElement(cart.getCheckout2());

		ClickOnElement(cart.getCheckout3());

		Accept_Addtocart addtocart = new Accept_Addtocart(driver);

		ClickOnElement(addtocart.getTermsandcond_Btn());

		ClickOnElement(addtocart.getCheckout4());

		By_Bank bank = new By_Bank(driver);

		ClickOnElement(bank.getPaybutton());

		Confirm_Order order = new Confirm_Order(driver);

		ClickOnElement(order.getOrder());

		// endSession("quit");

	}

}

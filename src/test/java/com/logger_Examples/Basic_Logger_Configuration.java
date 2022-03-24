package com.logger_Examples;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Logger_Configuration {
	 //factory design pattern.
	static Logger log = Logger.getLogger(Basic_Logger_Configuration.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();	
			
		log.info("info");
		
		log.warn("Warning");
		
		log.error("Error");
		
		log.fatal("fatal");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

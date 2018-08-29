package com.companyname.controller;

import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;

public class TestBase {
	
	private static final String URL = "https://jsonplaceholder.typicode.com";
	public static RestExecutor executor;
	//public static Log4JLogger log ;
	//public static Logger log;
	
	
	@BeforeClass
	public static void setUp() {
		/*
		 * Initialize RestExecutor object using the end point URL
		 */
		executor = new RestExecutor(URL);
		BasicConfigurator.configure();
		
	}

}

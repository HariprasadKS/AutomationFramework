package com.companyname.test;

import org.apache.commons.logging.impl.Log4JLogger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.companyname.controller.RestExecutor;
import com.companyname.controller.TestBase;

public class APIGETMethodtodos extends TestBase {

	
	/**
	 * todos get method
	 */
	@Test
	public void testGETMethodtodos() {

		executor.get("/todos/1")
		.expectCode(200)
		.expectMessage("OK")
		.expectHeader("Content-Type", "application/json; charset=utf-8")
		.expectInBody("delectus aut autem");
		//log.info("API /todos/1 is verified");

	}











}

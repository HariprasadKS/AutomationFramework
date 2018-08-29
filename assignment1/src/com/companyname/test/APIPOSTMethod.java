package com.companyname.test;

import org.junit.Test;

import com.companyname.controller.TestBase;

public class APIPOSTMethod extends TestBase{

	/**
	 * API POST method call
	 */

	@Test
	public void testPOSTMethod()  {
		/*
		 * POST operation for insertion providing the path, xml content and content type.
		 */
		executor.post("/posts", "{ \"userId\": \"1\", \"id\": \"101\", \"title\": \"Testing Title\", \"body\": \"Test Body\" }", "application/json")
		.expectCode(200)
		.expectHeader("Content-Type", "application/json; charset=utf-8")
		.expectInBody("\"title\": \"Testing Title\"")
		.expectInBody("Test Body");
	}


}

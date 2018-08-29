package com.companyname.test;

import org.junit.Test;

import com.companyname.controller.TestBase;

public class APIGETMethodposts extends TestBase{

	/**
	 * posts API method
	 */
	@Test
	public void testGETMethodposts() {

		executor.get("/posts")
		.expectCode(200)
		.expectMessage("OK")
		.expectHeader("Content-Type", "application/json; charset=utf-8")
		.expectInBody("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");

	}
}

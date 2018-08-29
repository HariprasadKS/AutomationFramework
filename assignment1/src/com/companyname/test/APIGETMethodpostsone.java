package com.companyname.test;

import org.junit.Test;

import com.companyname.controller.TestBase;

public class APIGETMethodpostsone extends TestBase {

	/**
	 * posts one API method
	 */
	@Test
	public void testGETMethodpostsone() {

		executor.get("/posts/1")
		.expectCode(200)
		.expectMessage("OK")
		.expectInBody("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");

	}
}

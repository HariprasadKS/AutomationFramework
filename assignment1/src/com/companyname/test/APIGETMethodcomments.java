package com.companyname.test;

import org.junit.Test;

import com.companyname.controller.TestBase;

public class APIGETMethodcomments extends TestBase {
	
	/**
	 * comments API method
	 */
	@Test
	public void testGETMethodcomments() {

		executor.get("/comments")
		.expectCode(200)
		.expectMessage("OK")
		.expectHeader("Content-Type", "application/json; charset=utf-8")
		.expectInBody("Eliseo@gardner.biz");

	}

}

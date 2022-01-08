package com.qa.capstone.RestAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class AutomateGetRequest {

	@Test
	public void validate_get_status_code() {
		given()
		.baseUri("https://api.instantwebtools.net")
		.when()
		.get("/v1/airlines")
		.then()
		.log().all()
		.assertThat().statusCode(200);
	}
}

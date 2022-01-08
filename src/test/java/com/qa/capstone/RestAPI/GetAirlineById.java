package com.qa.capstone.RestAPI;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetAirlineById {

	@Test 
	public void getAirlineByID() {
		given()
		.baseUri("https://api.instantwebtools.net")
		.pathParam("id", "1")
		.when()
		.get("/v1/airlines/{id}")
		.then()
		.log().all()
		.assertThat().statusCode(200);
	}
}

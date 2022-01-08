package com.qa.capstone.RestAPI;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

public class POSTPassenger {

	@Test
	public void postReq() {
		File file = new File("resources/data.json");
		
				given()
				.baseUri("https://api.instantwebtools.net")
				.contentType(ContentType.JSON)
				.body(file)
				.when()
				.post("/v1/passenger")
				.then()
				.log().all()
				.assertThat().statusCode(200);
	}
}

package com.utils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestfulBookerAPI {
	Response response;

	static String token;
	static String userID;

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
	}

	@Test
	public void generateToken() {
		token = RestAssured.given().contentType(ContentType.JSON)
				.body(getUserJson()).when().post("/auth").then().statusCode(200)
				.extract().jsonPath().get("token");
		System.out.println("My Generated Token: " + token);
	}

	@Test
	public void GetBookingIds() {

	}

	@Test
	public void GetBooking() {

	}

	@Test
	public void CreateBooking() {

	}

	@Test
	public void UpdateBooking() {

	}

	@Test
	public void PartialUpdateBooking() {

	}
	

	public String getUserJson() {
		String userJson = "{\"username\": \"admin\",\"password\": \"password123\"}";
		return userJson;
	}
}

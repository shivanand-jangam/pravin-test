package com.utils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DemoAPIAutomation2 {

	Response response;

	static String token;
	static String userID;

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://demoqa.com";
	}

	@Test
	public void getBookDetails() {
		response = RestAssured.given().contentType(ContentType.JSON)
				.accept("application/json")
				// .header("Authorization", "Bearer " + token)
				.when().get("/BookStore/v1/Books").then().statusCode(200)
				.extract().response();

		System.out.println(response.asPrettyString());
	}
	
	@Test
	public void getSingleBookDetails() {
		response = RestAssured.given().contentType(ContentType.JSON)
				.accept("application/json")
				.when().get("/BookStore/v1/Book?ISBN=9781449325862").then().statusCode(200)
				.extract().response();
		
		System.out.println(response.asPrettyString());
	}

	
	@Test
	public void updateBookDetails() {
		
		
	}

	
	
}

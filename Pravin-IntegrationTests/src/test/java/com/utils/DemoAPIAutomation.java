package com.utils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DemoAPIAutomation {

	Response response;

	static String token;
	static String userID;

	@BeforeClass
	public void setup() {

		RestAssured.baseURI = "https://demoqa.com";

	}

	@Test
	public void createUser() {
		System.out.println("********************* createUser START *********************");
		String userjson = getUserJson();

		userID = RestAssured.given().contentType(ContentType.JSON)
				.body(userjson).when().post("/Account/v1/User").then()
				.statusCode(201).extract().jsonPath().getString("userID");

		System.out.println("User Id: " + userID);
		System.out.println("********************* createUser END *********************");

	}

	@Test
	public void generateToken() {
		System.out.println("********************* generateToken START *********************");
		String userjson = getUserJson();

		token = RestAssured.given().contentType(ContentType.JSON).body(userjson)
				.when().post("/Account/v1/GenerateToken").then().statusCode(200)
				.extract().jsonPath().get("token");

		System.out.println("My generated Token: " + token);
		System.out.println("********************* generateToken END *********************");
	}

	@Test
	public void getUserDetails() {
		System.out.println("********************* getUserDetails START *********************");
		response = RestAssured.given().contentType(ContentType.JSON)
				.accept("application/json")
				.header("Authorization", "Bearer " + token).when()
				.get("/Account/v1/User/" + userID).then().statusCode(200)
				.extract().response();

		System.out.println(response.asPrettyString());
		System.out.println("********************* getUserDetails END *********************");
		
	}

	@Test
	public void deleteUser() {
		System.out.println("********************* deleteUser START *********************");
		response = RestAssured.given().contentType(ContentType.JSON)
				.accept("application/json")
				.header("Authorization", "Bearer " + token).when()
				.delete("/Account/v1/User/" + userID).then().statusCode(204)
				.extract().response();
		System.out.println("DELETED USER ID: " + userID);
		System.out.println("********************* deleteUser END *********************");
	}

	@Test
	public void endToEnd() {

		createUser();

		generateToken();

		getUserDetails();

//		deleteUser();

//		getUserDetails();

	}

	public String getUserJson() {
		String userJson = "{\"userName\": \"admin.shiva3\",\"password\": \"Admin@258\"}";
		return userJson;
	}

}

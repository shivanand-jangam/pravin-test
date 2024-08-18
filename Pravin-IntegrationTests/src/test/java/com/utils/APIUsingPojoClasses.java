package com.utils;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojoclasses.BookingRespnse;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIUsingPojoClasses {

	Response response;
	ObjectMapper objectMapper = new ObjectMapper();

	static String token;
	static String userID;

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
	}

	@Test
	public void generateToken()
			throws JsonMappingException, JsonProcessingException {
		response = RestAssured.given().contentType(ContentType.JSON)
				.body(getBookingJson()).when().post("/booking").then()
				.statusCode(200).extract().response();

		//////////////////////////////////////////////////////////////////
		// Way 1
		BookingRespnse respnse = objectMapper.readValue(response.asString(),
				BookingRespnse.class);
		
		Assert.assertTrue(respnse.getBookingid()!=null);
		System.out.println("Way 1 My Generated Token: " + respnse.getBookingid());
		
		Assert.assertEquals(respnse.getBooking().getFirstname(),"Shivanand");
		System.out.println(
				"Way 1 My First Token: " + respnse.getBooking().getFirstname());
		
		Assert.assertEquals(respnse.getBooking().getBookingdates().getCheckin(),"2024-08-18");
		System.out.println("Way 1 My Checkin Token: "
				+ respnse.getBooking().getBookingdates().getCheckin());
		
		/////////////////////////////////////////////////////////////////////
		
		// Way 2
				BookingRespnse bookingRespnse = response.as(BookingRespnse.class);

		System.out.println(
				"Way 2 My Generated Token: " + bookingRespnse.getBookingid());
		System.out.println("Way 2 My First Token: "
				+ bookingRespnse.getBooking().getFirstname());
		System.out.println("Way 2 My Checkin Token: "
				+ bookingRespnse.getBooking().getBookingdates().getCheckin());
	}

	public String getBookingJson() {
		String payload = "{\"firstname\":\"Shivanand\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2024-08-18\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}";
		return payload;

	}

}

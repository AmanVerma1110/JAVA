package First;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Firsto {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		// Validate if Add Place API is working as expected 
				// 3 principle of REST assured
				//given- for all input 
				//when- Submit the API - Resurce HTTP method
			    // then - Validate the response
				RestAssured.baseURI= "https://rahulshettyacademy.com";
				given().log().all().queryParam("key","qaclick123").header("Content-Type","ext/plain")
				.body("{\r\n"
						+ "  \"location\": {\r\n"
						+ "    \"lat\": -38.383494,\r\n"
						+ "    \"lng\": 33.427362\r\n"
						+ "  },\r\n"
						+ "  \"accuracy\": 50,\r\n"
						+ "  \"name\": \"Frontline house\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
						+ "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n"
						+ "    \"shop\"\r\n"
						+ "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n"
						+ "  \"language\": \"French-IN\"\r\n"
						+ "}").when().post("maps/api/place/add/json")
				.then().assertThat().statusCode(200);

	}

}

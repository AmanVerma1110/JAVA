package apitest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;

public class Basis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		 
		RestAssured.useRelaxedHTTPSValidation();
 
		String output = given().log().all().queryParam("key", "qaclick123")
				.header("Content-Type", "application/json")
				.body("{\n" + "  \"location\": {\n" + "    \"lat\": -38.383494,\n" + "    \"lng\": 33.427362\n"
						+ "  },\n" + "  \"accuracy\": 50,\n" + "  \"name\": \"Frontline house\",\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\n" + "  \"types\": [\n"
						+ "    \"shoe park\",\n" + "    \"shop\"\n" + "  ],\n"
						+ "  \"website\": \"http://google.com\",\n" + "  \"language\": \"French-IN\"\n" + "}\n" + "")
				.when().log().all().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.header("Server", "Apache/2.4.41 (Ubuntu)").body("scope", equalTo("APP")).extract()
				.response().asString();
 
		System.out.println(output);

	}

}

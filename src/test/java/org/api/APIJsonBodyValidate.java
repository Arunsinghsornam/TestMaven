package org.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class APIJsonBodyValidate {
	RequestSpecification requestSpec;
	Response response;
	
	@Test
	public void userListJsonBody() {
		requestSpec = RestAssured.given();
		requestSpec.baseUri("http:reqres.in");
		requestSpec.basePath("/api/users");
		response = requestSpec.get();
		ResponseBody responseBody = response.getBody();
		String responseString = responseBody.asString();
		System.out.println("Response Body is "+ responseString);
		Assert.assertEquals(responseString.contains("Janet"), true,"check for presence Janet");
		
		JsonPath jsonPath = responseBody.jsonPath();
		
		String firstName=jsonPath.get("data[1].first_name");
		System.out.println("First Name is "+firstName);
		Assert.assertEquals(firstName, "Janet","Check For Presense of Janet");
		//.data[4].name
		

	}

}
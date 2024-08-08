package org.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIHeaderValidation {
	RequestSpecification requestSpec;
	Response response;

	@Test
	private void headerValidation_NonBDD() {
		requestSpec = RestAssured.given();
		requestSpec.baseUri("http:reqres.in");
		requestSpec.basePath("/api/users/2");
		response = requestSpec.get();
		String connection = response.getHeader("connection");
		String conType = response.getHeader("Content-Type");
		System.out.println("Conection Status is "+connection);
		System.out.println("Content Type is "+conType);
		Headers headersList = response.getHeaders();
		for (Header header : headersList) {
			System.out.println(header.getName() + "    :" + header.getValue() );
			
		}
		


	}

}
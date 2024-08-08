package org.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAPI {

	static RequestSpecification requestSpec;
	static Response response;
	static String validRequest = "{" +
			"\"username\": \"apimicronsure\"," +
			"\"password\": \"micronsure@123\"," +
			"}";

	static String authToken = "";
	@Test
	public static void logIn() throws InterruptedException {

		requestSpec=RestAssured.given();
		requestSpec.baseUri("https:testapi.miwisa.in");
		requestSpec.basePath("/apisecurity/login");
		response = requestSpec.auth()
				.basic("username", "password")
				.contentType(ContentType.JSON)
				.body(validRequest).post();
		response.then().statusCode(200);
		JsonPath jsonViewPath = response.jsonPath();
		authToken = jsonViewPath.get("token");

		System.out.println("Response StatusCode "+response.statusCode());
		System.out.println("Response Token  is "+authToken);
}

	@Test(dependsOnMethods= {"logIn"})
	public void lmsAddContactDetails() {
		 //Create form data
		String user1 = "bhanu" + new Random().nextInt(1000);
		String mobileNumber1 = "9236567" + new Random().nextLong(1000);
		System.out.println(mobileNumber1);

		
		String user2 = "adithya" + new Random().nextInt(1000);
		String mobileNumber2 = "9238567" + new Random().nextLong(1000);
		System.out.println(mobileNumber2);

		JSONObject jsonData = new JSONObject();
		jsonData.put("leadId", "85");
		jsonData.put("name", user1);
		jsonData.put("mobileNumber",mobileNumber1 );
		jsonData.put("email", "asd@wsdf.trew");
		jsonData.put("designation", "asdasd");
		jsonData.put("categoryId", 2);
		jsonData.put("isActive", "true");
		jsonData.put("createdBy", "21");
		jsonData.put("createdOn", null);
		jsonData.put("updatedBy", null);
		jsonData.put("updatedOn", null);
		jsonData.put("categoryTitle", "Decision Maker");



		JSONObject jsonData1 = new JSONObject();
		jsonData1.put("leadId", "86");
		jsonData1.put("name", user2);
		jsonData1.put("mobileNumber",mobileNumber2);
		jsonData1.put("email", "asd@wsdf.trew");
		jsonData1.put("designation", "asdasd");
		jsonData1.put("categoryId", 2);
		jsonData1.put("isActive", "true");
		jsonData1.put("createdBy", "21");
		jsonData1.put("createdOn", null);
		jsonData1.put("updatedBy", null);
		jsonData1.put("updatedOn", null);
		jsonData1.put("categoryTitle", "Decision Maker");

		List<JSONObject> payload = new ArrayList<>();
		payload.add(jsonData);

		payload.add(jsonData);
		payload.add(jsonData1);



		requestSpec = RestAssured.given();
		requestSpec.baseUri("https:testapi.miwisa.in");
		requestSpec.basePath("/api/LMSContactDetails/AddContactDetails");
		requestSpec.header("Authorization", "Bearer " + authToken);
		requestSpec.contentType("multipart/form-data");
		requestSpec.multiPart("jsondata",payload.toString());
		response = requestSpec.post();
		int postResponseCode = response.getStatusCode();
		String body = response.getBody().asString();
		System.out.println("Post ResponseCode Is " + postResponseCode);
		System.out.println("Post ResponseBody Is " + body);

		try {
			Connection con = DriverManager.getConnection("jdbc:sqlserver:miwisadb-2.cxebotchjdqu.ap-south-1.rds.amazonaws.com:1433;database=micronsure_test;user=MNsure_Test_Read;password=R3ad#2022!@Test;encrypt=true;trustServerCertificate=true;loginTimeout=30;");
			Statement stmt = con.createStatement();
			String newContactDetails = "select top 2 * from LMSContactDetails order by id desc";
			ResultSet rs = stmt.executeQuery(newContactDetails);
						int count = 0;
			while (rs.next()) {
								count++;
				int id = rs.getInt("Id");
				String contactID = String.valueOf(id);
				System.out.println("New ContactID Is =" + contactID);
				int leadID = rs.getInt("LeadId");
				String newContactLeadId = String.valueOf(leadID);
				System.out.println("New Contact LeadID Is =" + newContactLeadId);
				String newContactName = rs.getString("Name");
				System.out.println("New Contact Name is ="+newContactName);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("oops there is a error");
			e.printStackTrace();
		}
	}


}
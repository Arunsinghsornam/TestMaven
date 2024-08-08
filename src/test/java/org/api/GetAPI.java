package org.api;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GetAPI{
//	static RequestSpecification requestSpec;
//	static Response response;
//	static String validRequest = "{" +
//			"\"username\": \"apimicronsure\"," +
//			"\"password\": \"micronsure@123\"" +
//			"}";
//	static String authToken = "";
//	@Test
//	public static void logIn() throws InterruptedException {
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/apisecurity/login");
//		response = requestSpec.auth()
//				.preemptive()
//				.basic("username", "password")
//				.header("Accept", "application/json")
//				.contentType(ContentType.JSON)
//				.body(validRequest).post();
//		response.then().statusCode(200);
//		JsonPath jsonViewPath = response.jsonPath();
//		authToken = jsonViewPath.get("token");
//		System.out.println("Response StatusCode "+response.statusCode());
//		System.out.println("Response Status "+response.statusLine());
//		System.out.println("Response Token  is "+authToken);
//	}
//	@Test(dependsOnMethods= {"logIn"})
//	public static void organizationApi() throws InterruptedException {
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/organizations/organizationsbyskip");
//		requestSpec.queryParams("skip",0,"take",1000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Orgganization Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"organizationApi"})
//	public static void zoneApi() throws InterruptedException {
//
//		//https://testapi.miwisa.in/api/zones/zonesbyskip?skip=0&take=500
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/zones/zonesbyskip");
//		requestSpec.queryParams("skip", 0, "take", 500);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Zone Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"zoneApi"})
//	public static void regionApi() throws InterruptedException {
//
//		//http://testapi.miwisa.in/api/zones/regionsbyskip?skip=0&take=1000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/regions/regionsbyskip");
//		requestSpec.queryParams("skip",0,"take",1000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Region Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"regionApi"})
//	public static void branchApi() throws InterruptedException {
//
//		//		//https://testapi.miwisa.in/api/branches/branchesbyskip?skip=0&take=1000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/branches/branchesbyskip");
//		requestSpec.queryParams("skip",0,"take",1000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Branch Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"branchApi"})
//	public static void employeeApi() throws InterruptedException {
//
//		//https://testapi.miwisa.in/api/employees/employeesbyskip?skip=0&take=10000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/employees/employeesbyskip");
//		requestSpec.queryParams("skip",0,"take",1000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Employee Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"employeeApi"})
//	public static void insurancecompanyApi() throws InterruptedException {
//
//		//https://testapi.miwisa.in/api/insurancecompany/companybyskip?skip=0&take=10000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/insurancecompany/companybyskip");
//		requestSpec.queryParams("skip",0,"take",1000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Insurance company Data is "+ response.getBody().asString());
//	}
//
//
//	@Test(dependsOnMethods= {"insurancecompanyApi"})
//	public  void unApproveProductAPI() {
//		// https://testapi.miwisa.in/api/products/getUnapprovedProducts
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/products/getUnapprovedProducts");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("UnApproved Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"unApproveProductAPI"})
//	public static void usersAPI() {
//		// https://testapi.miwisa.in/api/users/usersbyskip?skip=0&take=10000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/users/usersbyskip");
//		requestSpec.queryParams("skip",0,"take",10000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("User Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"usersAPI"})
//	public static void roleAPI() {
//		// https://testapi.miwisa.in/api/role/rolesbyskip?skip=0&take=10000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/role/rolesbyskip");
//		requestSpec.queryParams("skip",0,"take",10000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Role Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"roleAPI"})
//	public static void menuitemAPI() {
//		// http://testapi.miwisa.in/api/menuitems/menuitemsbyskip?skip=0&take=10000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/menuitems/menuitemsbyskip");
//		requestSpec.queryParams("skip",0,"take",10000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("menuitemAPI Data is "+ response.getBody().asString());
//
//	}
//
//	@Test(dependsOnMethods= {"menuitemAPI"})
//	public static void claimintimationAPI() {
//		// https://testapi.miwisa.in/api/claimsintimation/claimintimationbyskip?skip=0&take=100000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/claimsintimation/claimintimationbyskip");
//		requestSpec.queryParams("skip",0,"take",100000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("claimintimationAPI Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"claimintimationAPI"})
//	public static void claimsourceAPI() {
//		// https://testapi.miwisa.in/api/claimsource/claimsourcebyskip?skip=0&take=100000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/claimsource/claimsourcebyskip");
//		requestSpec.queryParams("skip",0,"take",100000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("claimsourceAPI Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"claimsourceAPI"})
//	public static void claimreasonAPI() {
//		// https://testapi.miwisa.in/api/claimsreason/claimreasonsbyskip?skip=0&take=100000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/claimsreason/claimreasonsbyskip");
//		requestSpec.queryParams("skip",0,"take",100000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("claimreasonAPI Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"claimreasonAPI"})
//	public static void claimstatus() {
//		// https://testapi.miwisa.in/api/claimstatus/claimstatusbyskip?skip=0&take=100000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/claimstatus/claimstatusbyskip");
//		requestSpec.queryParams("skip",0,"take",100000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("claimstatus Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"claimstatus"})
//	public static void claimstypeAPI() {
//		// https://testapi.miwisa.in/api/ClaimTypes/claimtypesbyskip?skip=0&take=100000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/ClaimTypes/claimtypesbyskip");
//		requestSpec.queryParams("skip",0,"take",100000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("claimstypeAPI Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"claimstypeAPI"})
//	public static void claimdocumentAPI() {
//		// https://testapi.miwisa.in/api/claimsdocumentlist/claimdocumentssbyskip?skip=0&take=100000
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/claimsdocumentlist/claimdocumentssbyskip");
//		requestSpec.queryParams("skip",0,"take",100000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("claimdocumentAPI Data is "+ response.getBody().asString());
//	}
//	@Test (dependsOnMethods= {"claimdocumentAPI"})
//	public static void virtualwalletlistAPI() {
//		// https://testapi.miwisa.in/api/virtualwallets/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/virtualwallets/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("virtualwalletlistAPI Data is "+ response.getBody().asString());
//	}
//
//	//======================================Role=============================================
//	@Test (dependsOnMethods= {"virtualwalletlistAPI"})
//	public static void getRoles() {
//		//  https://testapi.miwisa.in/role/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/role/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Roles List API Data is "+ response.getBody().asString());
//
//	}
//	@Test (dependsOnMethods= {"getRoles"})
//	public static void roleActiveList() {
//		// https://testapi.miwisa.in/api/role/activelist
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/role/activelist");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Active Roles List API Data is "+ response.getBody().asString());
//	}
//	@Test (dependsOnMethods= {"roleActiveList"})
//	public static void roleCount() {
//		// https://testapi.miwisa.in/api/role/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/role/activelist");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("roleCount API Data is "+ response.getBody().asString());
//	}
//	@Test (dependsOnMethods= {"roleCount"})
//	public static void roleSkip() {
//		//https://testapi.miwisa.in/api/role/rolesbyskip?skip={skip}&take={take}
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/role/rolesbyskip");
//		requestSpec.queryParam("skip",0, "take",1000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Role Skip API Data is "+ response.getBody().asString());
//	}
//	//=================================menu Item===================================================
//	@Test(dependsOnMethods= {"roleSkip"})
//	public static void allMenuItem() {
//		// https://testapi.miwisa.in/api/menuitems/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/menuitems/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("ALL MenuItem  API Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"allMenuItem"})
//	public static void countOfMenuItem() {
//		// https://testapi.miwisa.in/api/menuitems/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/menuitems/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Count Of MenuItem  API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"countOfMenuItem"})
//	public static void menuItemSkip() {
//		// https://testapi.miwisa.in/api/menuitems/menuitemsbyskip?skip={skip}&take={take}
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/menuitems/menuitemsbyskip");
//		requestSpec.queryParam("skip", 0,"take",1000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Count Of Skip MenuItem  API Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"menuItemSkip"})
//	public static void productList() {
//		// https://testapi.miwisa.in/api/products/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/products/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Product List  API Data is "+ response.getBody().asString());
//
//
//	}
//	@Test(dependsOnMethods= {"productList"})
//	public static void productCount() {
//		// https://testapi.miwisa.in/api/products/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/products/total");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Product List Count API Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"productCount"})
//	public static void allProductCount() {
//		// https://testapi.miwisa.in/api/products/getallproductstotal
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/products/getallproductstotal");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("All Product  Count API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"allProductCount"})
//	public static void allProductDetails() {
//		// https://testapi.miwisa.in/api/products/productdetailsall
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/products/productdetailsall");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("All Product  Details API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"allProductDetails"})
//	public static void allWalletTypes() {
//		// https://testapi.miwisa.in/api/products/GetWalletTypes
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/products/GetWalletTypes");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("All  Wallet Types API Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"allWalletTypes"})
//
//	public void allProductSegment() {
//		// https://testapi.miwisa.in/api/ProductSegments/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/ProductSegments/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("All  Product Segment API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"allProductSegment"})
//	public void allProductSaleType() {
//		// https://testapi.miwisa.in/ProductSaleType/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/ProductSaleType/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("All  Product Sale Type API Data is "+ response.getBody().asString());
//	}	
//	@Test(dependsOnMethods= {"allProductSaleType"})
//	public void userCount() {
//		// https://testapi.miwisa.in/api/users/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/users/total");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("User Count API Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"userCount"})
//	public void allClaimDocuments() {
//		// https://testapi.miwisa.in/api/claimsdocumentlist/List
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/claimsdocumentlist/List");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Claim Document API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"allClaimDocuments"})
//	public void allFeatureTypes() {
//		// https://testapi.miwisa.in/api/addonfeatures/featuretypelist
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/addonfeatures/featuretypelist");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Featuree Typet API Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"allFeatureTypes"})
//	public void allUserType() {
//		// https://testapi.miwisa.in/api/UserTypes/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/UserTypes/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("All User Typet API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"allUserType"})
//	private void organizationCount() {
//		// https://testapi.miwisa.in/api/organizations/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/organizations/total");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Organization Count API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"organizationCount"})
//	private void organizationList() {
//
//		// https://testapi.miwisa.in/api/organizations/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/organizations/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Organization List API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"organizationList"})
//	public void activeOrganizationList() {
//		// https://testapi.miwisa.in/api/organizations/activeInActivelist
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/organizations/activeInActivelist");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Organization Active List API Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"activeOrganizationList"})
//	public void branchCount() {
//		// https://testapi.miwisa.in/api/branches/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/branches/total");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Branch Count API Data is "+ response.getBody().asString());
//
//	}
//	@Test(dependsOnMethods= {"branchCount"})
//	public void employeeCount() {
//		// https://testapi.miwisa.in/api/employees/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/employees/total");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Branch Count API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"employeeCount"})
//	public void skipEmployee() {
//		// https://testapi.miwisa.in/api/employees/employeesbyskip?skip={skip}&take={take}
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/employees/employeesbyskip");
//		requestSpec.queryParams("skip", 0,"take",10000);
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Branch Count API Data is "+ response.getBody().asString());
//	}
//
//	@Test(dependsOnMethods= {"skipEmployee"})
//	public void zoneList() {
//		// https://testapi.miwisa.in/api/zones/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/zones/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Zone List API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"zoneList"})
//	public void zoneTotalCount() {
//		// https://testapi.miwisa.in/api/zones/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/zones/total");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Zone Total Count API Data is "+ response.getBody().asString());
//	}
//
//	@Test(dependsOnMethods= {"zoneTotalCount"})
//	public void regionList(){
//		// https://testapi.miwisa.in/api/regions/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/regions/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Region List API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"regionList"})
//	public void regionCount(){
//		// https://testapi.miwisa.in/api/regions/total
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/regions/total");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Region Count API Data is "+ response.getBody().asString());
//	}
//
//	@Test(dependsOnMethods= {"regionCount"})
//	public void organizationRoles(){
//		// https://testapi.miwisa.in/api/organizationroles/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/organizationroles/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Organization Roles List API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"organizationRoles"})
//	public void coiTemplates(){
//		// https://testapi.miwisa.in/api/policies/COITemplate?
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/policies/COITemplate");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("CoiTemplates API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"coiTemplates"})
//	public void relationshipList(){
//		// https://testapi.miwisa.in/api/relationships/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/relationships/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("RelationshipList API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"relationshipList"})
//	public void salutationslist(){
//		// https://testapi.miwisa.in/api/salutations/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/salutations/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Salutations list API Data is "+ response.getBody().asString());
//	}
//	@Test(dependsOnMethods= {"salutationslist"})
//	public void statelist(){
//		// https://testapi.miwisa.in/api/states/list
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/states/list");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("Salutations list API Data is "+ response.getBody().asString());
//	}
//
//	@Test(dependsOnMethods= {"statelist"})
//	public void protectionCOITemplates(){
//		// https://testapi.miwisa.in/api/policymembersprotection/COITemplate
//		requestSpec = RestAssured.given();
//		requestSpec.baseUri("https://testapi.miwisa.in");
//		requestSpec.basePath("/api/policymembersprotection/COITemplate");
//		requestSpec.header("Authorization", "Bearer " + authToken);
//		response = requestSpec.get();
//		response.then().statusCode(200);
//		System.out.println("ProtectionCOITemplates API Data is "+ response.getBody().asString());
//	}
}
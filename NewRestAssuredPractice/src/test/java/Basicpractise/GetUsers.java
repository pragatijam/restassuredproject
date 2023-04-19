package Basicpractise;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class GetUsers {
	
	@Test
	
	public void GetListUsers() {
		
		RestAssured.baseURI="https://reqres.in/";
	Response response=given()
		.when()
		.get("api/users?page=2")
		.then()
		.extract()
		.response();
	
		String resp=response.asPrettyString();
		System.out.println(resp);
		
		int code =response.getStatusCode();
		long time =response.getTime();
		
		System.out.println("time" + time + "code "+ code );
		Assert.assertEquals(200, code);
		
}
}
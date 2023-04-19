package Basicpractise;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateUser {
	static 	String msg;
	@Test(priority=1)
	public void CreateUsersss() {
		
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		Response resp=given()
		
		.header("Content-Type", "application/json")
		.header("accept", "application/json")
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"userten\",\r\n"
				+ "  \"firstName\": \"Test10\",\r\n"
				+ "  \"lastName\": \"user10\",\r\n"
				+ "  \"email\": \"sept10@ss.com\",\r\n"
				+ "  \"password\": \"Test@12345\",\r\n"
				+ "  \"phone\": \"9876543211\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}")

		
		.when()
		
		.post("/user")
		
		.then()
		
        .extract()
		
		.response();
	
	String stringresp = resp.asPrettyString();
	
	System.out.println(stringresp);
	
	JsonPath jp=new JsonPath(stringresp);
	
	String msg=jp.get("message");
   System.out.println(msg);
   
		
		
	}
	
	
	@Test(priority=2)
	public void GetDetails() {
		
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		Response response=given()
		
		.when()
		
		.get("/user/userten")
		
		.then()
		.extract()
		.response();
		
		 String rp = response.asPrettyString();
		 
		System.out.println(rp);
		
		JsonPath jp1=new JsonPath(rp);
				
			String idvalue = jp1.get("id");
			
			System.out.println(idvalue);
			
			Assert.assertEquals(msg, idvalue);
	}

}

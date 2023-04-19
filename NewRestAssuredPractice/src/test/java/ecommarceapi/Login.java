package ecommarceapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Login extends BaseVar{
	
	@Test
	
	public void LoginMethod() {
		
		RestAssured.baseURI="https://www.rahulshettyacademy.com";
		Response resp = given()
				
		.headers("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"userEmail\": \"pragatijamdade2311@gmail.com\",\r\n"
				+ "     \"userPassword\": \"Pragati@23\"\r\n"
				+ "}")
		.when()
		.post("api/ecom/auth/login")
		.then()
		.log().all()
		.extract()
		.response();
		
   JsonPath jp=resp.jsonPath();
		
   userid =jp.getString("userId");
   tokenid=jp.getString("token");
	}

}

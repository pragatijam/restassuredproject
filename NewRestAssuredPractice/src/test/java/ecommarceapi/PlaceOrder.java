package ecommarceapi;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PlaceOrder extends BaseVar {
	
	@Test
	
	public void Placeorder1() {
		
		RestAssured.baseURI="https://www.rahulshettyacademy.com";
		given()
				
		.headers("Authorization",tokenid)
		.header("Content-Type","application/json")
		.body(BodyOfPlaceOrder.GetOrderBody(productid))
		.when()
		.post("api/ecom/order/create-order")
		.then()
		.extract()
		.response();
	}

}

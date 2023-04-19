package ecommarceapi;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AddProduct extends BaseVar{
	
	@Test
	
	public void AddProduct1() {
		RestAssured.baseURI="https://www.rahulshettyacademy.com";
		Response res=given()
				
		.headers("Authorization",tokenid)
		.param("productName"," Official shirt")
		.param("productAddedBy",userid)
		.param("productCategory", "fashion")
		.param("productSubCategory", "shirts")
		.param("productPrice", "1000")
		.param("productDescription", "Allen Solly")
		.param("productFor", "Men")
		.multiPart("productImage", new File("C:\\Users\\KING\\Documents\\indigoshirt.png"))
		.when()
		.post("api/ecom/product/add-product")
		.then()
		.log().all()
		.extract()
		.response();
		
	JsonPath	jp=res.jsonPath();
	productid=jp.get("productId");
		
	}

}

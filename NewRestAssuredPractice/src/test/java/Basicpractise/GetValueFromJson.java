package Basicpractise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetValueFromJson {
	
	@Test
	
	public void ValueFromJson() {
		
	JsonPath jp=new JsonPath("{\r\n"
			+ "\"dashboard\": {\r\n"
			+ "\"purchaseAmount\": 910,\r\n"
			+ "\"website\": \"www.abc.com\"\r\n"
			+ "},\r\n"
			+ "\"courses\": [\r\n"
			+ "{\r\n"
			+ "\"title\": \"Selenium Python\",\r\n"
			+ "\"price\": 50,\r\n"
			+ "\"copies\": 6\r\n"
			+ "},\r\n"
			+ "{\r\n"
			+ "\"title\": \"Cypress\",\r\n"
			+ "\"price\": 40,\r\n"
			+ "\"copies\": 4\r\n"
			+ "},\r\n"
			+ "{\r\n"
			+ "\"title\": \"RPA\",\r\n"
			+ "\"price\": 45,\r\n"
			+ "\"copies\": 10\r\n"
			+ "}\r\n"
			+ "]\r\n"
			+ "}\r\n"
			+ " ");
	
        String course=jp.get("courses[0].title");
        
        System.out.println(course);
        
        int size=jp.getInt("courses.size()");
        System.out.println(size);
        
        
        for(int i=0;i<=size;i++) {
			  String title = jp.getString("courses["+i+"].title");
			  int price = jp.getInt("courses["+i+"].price");
			  
			  System.out.println(title+" "+price);
		  }
		
	}

	}



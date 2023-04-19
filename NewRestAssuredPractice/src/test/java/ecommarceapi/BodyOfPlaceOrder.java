package ecommarceapi;

public class BodyOfPlaceOrder{
	
	public static String GetOrderBody(String prdid) {
	String body="{\"orders\": [\r\n"
			+ "        {\r\n"
			+ "        \"country\": \"India\", \r\n"
			+ "        \"productOrderedId\" : \""+ prdid +"\"\r\n"
			+ "        }\r\n"
			+ "    ]\r\n"
			+ "}";
	
	return body; 
	}		
			
}

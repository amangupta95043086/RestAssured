package Practise;

import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.specification.RequestSpecification;


public class GetMethod {
	
	@Test
	public void getWheatherDetailsOfCity()
	{
		String baseUrl="http://demoqa.com/utilities/weather/city/Hyderabad";
		RestAssured.baseURI = baseUrl;
		
		//RequestSpecification request=RestAssured.given();
		
		
		

	}
	
	

}

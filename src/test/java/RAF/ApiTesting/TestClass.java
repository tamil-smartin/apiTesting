package RAF.ApiTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestClass {

	@BeforeMethod

	public void apiSetup() {
	
	}

	@Test (priority = 0, description="Validate response body for getAPI.")
	public void test_getAPI() {

		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/posts");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	
	@Test (priority = 0, description="Validate response body for putAPI.")
	public void test_putAPI() {

		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.PUT, "/posts/1");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	@AfterMethod

	public void afterMethod() {
		
	}

}

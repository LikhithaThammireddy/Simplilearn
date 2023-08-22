package reqres;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Reqres_DELETE_Demo {
	@Test
	public void deleteResource() {
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="/api/users/6";
		RestAssured
		.when()
		  .delete()
		.then()
		   .statusCode(204);
	}}   
		
		




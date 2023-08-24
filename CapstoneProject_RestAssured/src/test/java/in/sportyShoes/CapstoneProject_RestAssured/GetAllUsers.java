package in.sportyShoes.CapstoneProject_RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllUsers {
	@Test
	public void getServerResponse() {
		RestAssured
		.when()
		      .get("http://localhost:9010/get-users")
       .then()
       .assertThat()
       .statusCode(200)
		.log().all();
	}

}



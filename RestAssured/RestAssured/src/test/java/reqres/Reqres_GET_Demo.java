package reqres;
import org.testng.annotations.Test;
import io.restassured.RestAssured;


	public class Reqres_GET_Demo {
		@Test
		public void getServerResponse() {
			RestAssured
			.when()
			      .get("https://reqres.in/api/users?page=2 ")
	       .then()
	       .assertThat()
	       .statusCode(200)
			.log().all();
		}

	}




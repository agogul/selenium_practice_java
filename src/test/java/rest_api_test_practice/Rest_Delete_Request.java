package rest_api_test_practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Rest_Delete_Request {

    @Test
    public void delete_Data(){
        RestAssured.baseURI = "http://localhost:3000";

        Response response = RestAssured.
                given().
                when().
                delete("/data/19");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asPrettyString());
        System.out.println(response.getStatusLine());
    }
}

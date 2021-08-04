package rest_api_test_practice;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Rest_Get_Request {
    @Test
    public void get_Request_TC001(){
        //printing out json body
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification http_request = RestAssured.given();
        Response response = http_request.request(Method.GET, "/api/users?page=2");
        String body = response.getBody().asString();
        System.out.println(body);
        Headers headers = response.getHeaders();
        headers.forEach(System.out::println);
    }
    @Test
    public void get_Request_TC002(){
        //getting status line
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification http_request = RestAssured.given();
        Response response = http_request.request(Method.GET, "/api/users?page=2");
        String body = response.getStatusLine();
        System.out.println(body);
        Object name = response.jsonPath().get("data[0].first_name");//getting specific value
        System.out.println(name);
    }
    @Test
    public void get_Request_TC003(){
        //getting status code
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification http_request = RestAssured.given();
        Response response = http_request.request(Method.GET, "/api/users?page=2");
        int code = response.getStatusCode();
        System.out.println(code);
    }
}

package rest_api_test_practice;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Get_Headers {
    @Test
    public void get_Request_TC001(){
        //printing out json body
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification http_request = RestAssured.given();
        Response response = http_request.request(Method.GET, "/api/user/2");
        String body = response.getBody().asString();
        System.out.println(body);
        Headers headers = response.getHeaders();

        //easy way to get name and value
        headers.forEach(System.out::println); //method 1
        System.out.println("-------------------------------------------------");

        //easy way to get name and value
        headers.forEach(a-> System.out.println(a.getName()+"|"+a.getValue()));//method 2
        System.out.println("-------------------------------------------------");

        //another way
        for(Header header:headers){
            String name = header.getName();
            String value = header.getValue();
            System.out.println(name+":"+value);
        }
        System.out.println("-------------------------------------------------");
    }
}

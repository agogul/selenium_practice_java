package rest_api_test_practice;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Rest_Post_Request {
    @Test
    public void post_Request_TC001(){
        RestAssured.baseURI = "http://localhost:3000";
        RequestSpecification http_request = RestAssured.given();
        
        JSONObject jsonData = new JSONObject();
        jsonData.put("name","amala");
        jsonData.put("salary ","36000");
        jsonData.put("age","28");
        
        http_request.header("Content-Type","application/json");//must use this while post action
        http_request.request().body(jsonData.toJSONString());
        
        Response response = http_request.request(Method.POST, "/data");

        int code = response.getStatusCode();
        System.out.println(response.getContentType());
        System.out.println(response.getStatusLine());
        System.out.println(code);
        Object data = response.jsonPath().get();
        Object data1 = response.jsonPath().get("name");

        System.out.println(data);
        System.out.println(data1);
    }
}

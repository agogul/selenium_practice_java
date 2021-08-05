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
    @Test
    public void post(){
        RestAssured.baseURI = "https://petstore.swagger.io";
        RequestSpecification http_request = RestAssured.given();


        String str = """
                {
                  "id": 0,
                  "category": {
                    "id": 10,
                    "name": "gokul"
                  },
                  "name": "doggie",
                  "photoUrls": [
                    "string"
                  ],
                  "tags": [
                    {
                      "id": 0,
                      "name": "tag_name"
                    }
                  ],
                  "status": "available"
                }""";


        http_request.header("Content-Type","application/json");//must use this while post action
        http_request.request().body(str);

        Response response = http_request.request(Method.POST, "/v2/pet");
        Object data = response.jsonPath().get("name");
        Object data1 = response.jsonPath().get("category.name");
        Object data2 = response.jsonPath().get("tags[0].name");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);

    }
}

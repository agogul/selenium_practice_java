package rest_api_test_practice;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;

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
    @Test
    public void post_Json_File() throws IOException {
        FileReader read = new FileReader("C:\\Users\\GOKUL\\IdeaProjects\\selenium_practice_java\\src\\test\\Json Files\\Swagger_Post_Data.json");
        RestAssured.baseURI = "https://petstore.swagger.io";
        Response data = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(IOUtils.toString(read))
                .when()
                .post("/v2/pet");
        System.out.println(data.getStatusLine());
        System.out.println(data.getBody().asString());
        System.out.println(data.getStatusCode());
    }

    @Test
    public void post_Json_File1(){
        RestAssured.baseURI = "http://localhost:3000";

        String data = """
                {
                "name": "amala",
                "salary": "35000",
                "age": "29"
                }
                """;

        RestAssured.
                given().
                header("Content-Type", "application/json").
                body(data).

                when().
                post("/data").

                then().
                statusCode(201).
                statusLine("HTTP/1.1 201 Created").log().all().extract().response();
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getBody().asPrettyString());
//        System.out.println(response.getStatusLine());
    }
}

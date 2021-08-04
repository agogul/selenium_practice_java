package rest_api_test_practice;

import io.restassured.RestAssured;
import io.restassured.authentication.OAuthScheme;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Authorization {

    @Test
    public void basic_Auth(){//without basic auth

        RestAssured.baseURI = "https://postman-echo.com";
        RequestSpecification http_request = RestAssured.given();
        Response response = http_request.request(Method.GET, "/basic-auth");
        System.out.println(response.getStatusLine());
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }

    @Test
    public void basic_Auth_tc001(){//with basic auth

        RestAssured.baseURI = "https://postman-echo.com";
        PreemptiveBasicAuthScheme basicAuth = new PreemptiveBasicAuthScheme();
        basicAuth.setUserName("postman");//##
        basicAuth.setPassword("password");//##
        RestAssured.authentication = basicAuth;//##
        RequestSpecification http_request = RestAssured.given();
        Response response = http_request.request(Method.GET, "/basic-auth");
        System.out.println(response.getStatusLine());
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asPrettyString());
    }



    @Test
    public void oAuth_1(){//without oauth auth
        RestAssured.baseURI = "https://postman-echo.com";
        Response response = RestAssured.given().request(Method.GET, "/oauth1");
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getBody().asPrettyString());
    }
    @Test
    public void oAuth_1_TC002(){//without oauth auth
        RestAssured.baseURI = "https://postman-echo.com";
        OAuthScheme oauth = new OAuthScheme();
        oauth.setConsumerKey("RKCGzna7bv9YD57c");
        oauth.setConsumerSecret("D+EdQ-gs$-%@2Nu7");
        RestAssured.authentication = oauth;
        Response response = RestAssured.given().request(Method.GET, "/oauth1");
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getBody().asPrettyString());
    }

}

package testng_pra;

import org.testng.annotations.*;

public class TC2 {
    @BeforeMethod
    void beforeMethodTc2(){
        System.out.println("before each method");
    }
    @AfterMethod
    void afterMethodTc2(){
        System.out.println("after each method");
    }
    @Test(priority = 0)
    void tesT3(){
        System.out.println("this is test3");
    }
    @Test(priority = 1)
    void tesT4(){
        System.out.println("this is test4");
    }


}



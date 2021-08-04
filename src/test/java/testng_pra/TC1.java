package testng_pra;

import org.testng.annotations.*;

public class TC1 {
    @BeforeClass
    void beforeClass(){
        System.out.println("before each class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("after each class");
    }
    @BeforeMethod
    void beforeMethodTc1(){
        System.out.println("before each method");
    }
    @AfterMethod
    void afterMethodTc1(){
        System.out.println("after each method");
    }

    @Test(priority = 0)
    void tesT1(){
        System.out.println("this is method 1");
    }
    @Test(priority = 1)
    void tesT2(){
        System.out.println("this is method 2");
    }

    @BeforeTest
    void beforeTestTc2(){
        System.out.println("before each test");
    }
    @AfterTest
    void afterTestTc2(){
        System.out.println("after each test");
    }
}



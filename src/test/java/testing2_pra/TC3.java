package testing2_pra;

import org.testng.annotations.*;

public class TC3 {
    @BeforeMethod
    void beforeMethodTc2(){
        System.out.println("before each method");
    }
    @AfterMethod
    void afterMethodTc2(){
        System.out.println("after each method");
    }
    @Test(priority = 0)
    void tesT5(){
        System.out.println("this is test5");
    }
    @Test(priority = 1)
    void tesT6(){
        System.out.println("this is test6");
    }

    @BeforeSuite
    void beforeSuitTc2(){
        System.out.println("before each siut");
    }
    @AfterSuite
    void afterSuitTc2(){
        System.out.println("after each suit");
    }
}

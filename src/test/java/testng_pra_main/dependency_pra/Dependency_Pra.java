package testng_pra_main.dependency_pra;

import org.testng.annotations.Test;

public class Dependency_Pra {

    /*Dependency is depending on other method if one method failed the depending method
    * will not executed.but we can also forcefully execute it by using always run = true */

    @Test
    void start_Car(){
        System.out.println("car started"); // main method
    }

    @Test(dependsOnMethods = {"start_Car"}) //depending method
    void drive_Car(){
        System.out.println("car driving");
    }

    @Test(dependsOnMethods ={"drive_Car"} ) // depending method
    void park_Car(){
        System.out.println("car parked");
    }

    @Test(dependsOnMethods = "park_Car")
    void stop_Car(){
        System.out.println("car stopped");
    }

}



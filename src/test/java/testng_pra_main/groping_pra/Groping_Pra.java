package testng_pra_main.groping_pra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groping_Pra {
    @Test(groups = "regression")
    void test1(){
        System.out.println("reg test1");
    }
    @Test(groups = "regression")
    void test2(){
        System.out.println("reg test2");
    }
    @Test(groups = "regression")
    void test3(){
        System.out.println("reg test3");

    }
    @Test(groups = "sanity")
    void test4(){
        System.out.println("san test4");
    }
    @Test(groups = "sanity")
    void test5(){
        System.out.println("san test5");
    }
    @Test(groups = "sanity")
    void test6(){
        System.out.println("san test6");
    }
}

package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InvoiceTests {

    @BeforeClass
    public static void beforeclass(){
        System.out.println("before class");
    }

    @Before
    public void beforemethod(){
        System.out.println("this before method");
    }


    @After
    public void aftermethod1(){
        System.out.println("THis after method");
    }

    @Test
    public void testmethod1(){
        System.out.println("iam test method 1");
    }
    @Test
    public void testmethod2(){
        System.out.println("iam test method 2");
    }
}

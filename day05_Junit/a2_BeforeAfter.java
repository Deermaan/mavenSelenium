package day05_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class a2_BeforeAfter {
    @Before
    public void setup (){
        System.out.println("Her test methodundan önce çalışır");
    }
    @After
    public void teardown(){
        System.out.println("Her test methodundan sonra çalışır");
    }
    @Test
    public void test1(){
        System.out.println("İlk test");
    }
    @Test
    public void test2(){
        System.out.println("İkinci test");
    }
}

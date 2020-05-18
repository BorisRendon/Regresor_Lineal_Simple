package regresorlineal.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {
    Arrays test1 = new Arrays();

    @Test
    public void testsize(){
        int size = test1.size(5);
        assertEquals(size,5);
    }
    @Test
    public void testmedia(){
        float [] test =new float[] {100,50,75,25};
        int size = 4;

        assertEquals(test1.media(test,size) , 62.5);

    }

    @Test
    public void testcova(){
        float [] test11 =new float[] {100,50,75,25};
        float [] test22 =new float[] {100,40,75,25};
        int size = 4;

        assertEquals(test1.covarianza(test11,test22,size),812.5);
    }

    @Test
    public void testvar(){
        float [] test11 =new float[] {100,50,75,25};
        int size = 4;
        assertEquals(test1.varianza(test11,size),781.25);

    }
}
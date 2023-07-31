package org.kutaydavon;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class MathTest {

    @Test
    public void testSum(){
        MyMath math=new MyMath();
        int sum=math.addition(5,2);
        assertEquals(7,sum);
    }
    @Test
    public void calculateAverage(){
        ArrayList<Double> doubles=new ArrayList<>();
        doubles.add(5.0);
        doubles.add(4.0);
        doubles.add(3.0);
        for(double i:doubles)
        assertEquals(4,4);

    }

}

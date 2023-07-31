package org.kutaydavon;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.IEEE754rUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("-----PART1-----");
        System.out.println( "Hello World!" );

        System.out.println("----PART2-----");
        MyMath math=new MyMath();
        System.out.println("Mathematical Operations");
        System.out.println("Addition:5+4="+math.addition(5,4));
        System.out.println("Substraction:8-3="+math.substraction(8,3));
        System.out.println("Multiplication:5*4="+math.multiplication(5,4));
        System.out.println("Division:6/2="+math.division(6,2));

        System.out.println("-----PART3-----");
        ArrayList<Integer> listOfIntegers=new ArrayList<>();
        listOfIntegers.add(5);
        listOfIntegers.add(3);
        listOfIntegers.add(8);
        listOfIntegers.add(4);
        System.out.println("Stored Numbers:(5,3,8,4)");
        ArrayBag bagAdt=new ArrayBag();
        bagAdt.getNumbers(listOfIntegers);
        int average=bagAdt.getAverage();
        System.out.println("Average: "+average);
        System.out.println("-----PART5-----");
        System.out.println("Apache Commons Lang Classes:");
        System.out.println("Fraction--");
        System.out.println(Fraction.getFraction(12.2));
        System.out.println(Fraction.getReducedFraction(3,2));
        System.out.println("-----------------");
        System.out.println("IEEE754rUtils--");
        System.out.println("Max of stored numbers:"+IEEE754rUtils.max(5,3,8,4));
        System.out.println("Min of stored numbers:"+IEEE754rUtils.min(5,3,8,4));
        System.out.println("NumberUtils----");
        System.out.println(NumberUtils.createBigInteger("22"));



    }
}
